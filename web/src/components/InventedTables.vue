<template>
  <div class="div">
    <div class="conter-left">
      <div class="common-layout">
        <el-container>
          <el-header>
            <div class="title">
              <span>虚拟化表格</span>
            </div>
            <div class="find">
              <el-form
                :inline="true"
                :model="formInline"
                class="demo-form-inline"
              >
                <el-form-item label="姓名">
                  <el-input
                    v-model="formInline.name"
                    placeholder="请输入姓名"
                  />
                </el-form-item>
                <el-form-item label="年龄">
                  <el-input v-model="formInline.age" placeholder="请输入年龄" />
                </el-form-item>
                <el-form-item label="生日">
                  <el-config-provider :locale="zhCn">
                    <el-date-picker
                      v-model="formInline.birth"
                      type="datetime"
                      placeholder="请输入生日"
                    />
                  </el-config-provider>
                </el-form-item>
                <el-form-item label="地址">
                  <el-input
                    v-model="formInline.addr"
                    placeholder="请输入地址"
                  />
                </el-form-item>
                <el-form-item label="邮箱">
                  <el-input
                    v-model="formInline.email"
                    placeholder="请输入邮箱"
                  />
                </el-form-item>
                <el-form-item>
                  <el-button type="primary" @click="find">查询</el-button>
                  <el-button type="primary" @click="reset">重置</el-button>
                  <el-button type="primary" @click="deletes">批量删除</el-button>
                </el-form-item>
              </el-form>
            </div>
          </el-header>
          <el-main>
            <el-table-v2
              :columns="columnsData"
              :class="kls"
              :data="tables"
              :width="1600"
              :height="800"
              fixed
            />
          </el-main>
        </el-container>
      </div>
    </div>
  </div>
  <Componenttablesfrom :froms="froms" v-on="tablefunc"></Componenttablesfrom>
  <DialogBoxVue :dialogbox="dialogbox" v-on="dialogboxfunc"></DialogBoxVue>
</template>

<script lang="tsx" setup>
import axios from "axios";
import zhCn from "element-plus/lib/locale/lang/zh-cn";
import { Column, ElCheckbox, ElInput, ElMessage, linkEmits } from "element-plus";
import { FunctionalComponent, onMounted, reactive, ref, resolveDynamicComponent, unref, watch } from "vue";
import Componenttablesfrom from "../component/Componenttables.vue";
import { deepClone, filterData, renderTime } from "../type/until";
import DialogBoxVue from "../component/DialogBox.vue";
import { defaultDocument } from "@vueuse/core";
const Input = resolveDynamicComponent('ElInput') as typeof ElInput
const Checkbox = resolveDynamicComponent('ElCheckbox') as typeof ElCheckbox
type SelectionCellProps = {
  value: string
  intermediate?: boolean
  onChange: (value: string) => void
  forwardRef: (el: InstanceType<typeof ElInput>) => void
}
const InputCell: FunctionalComponent<SelectionCellProps> = ({
  value,
  onChange,
  forwardRef,
}) => {
  return <Input ref={forwardRef as any} onInput={onChange} modelValue={value} />
}


type SelectionCheckProps = {
  value: boolean
  intermediate?: boolean
  onChange: (value: boolean) => void
}
const SelectionCell: FunctionalComponent<SelectionCheckProps> = ({
  value,
  intermediate = false,
  onChange,
}) => {
  return (
    <Checkbox
      onChange={onChange}
      modelValue={value}
      indeterminate={intermediate}
    />
  )
}

//传递给对话框的数值
const dialogbox = reactive({
  centerDialogVisible:false,
  content:"是否修改此内容",
  title:'',
  dialogboxvalue:''
})
// watch(
//   () => dialogbox.dialogboxvalue,
//   (val, oldVal) => {
//     console.log(oldVal);
//     console.log(val);
//   },
//   {
//     // immediate: true,
//     deep: true,
//   }
// );
//表格数据
const tables = ref([]);
//重复的表格数据，用于查询
const oldtables = ref([]);
//每个表格的宽度
const tablewidth = 220;
//传递给子组件的值
let froms = reactive({
  dialogFormVisible: false,
  froms: {},
  fromsdata: {},
  editboolean: false,
  oldfromsdata: {},
});
//查询用的值
let formInline = reactive({
  name: "",
  age: "",
  addr: "",
  email: "",
  birth: "",
});
/**
 * 通用表格的单元格变成输入框的方法
 */
const componentcellRenderer=(rowData:any,column:any,values:string)=>{
const onChange = (value: string) => {
      rowData[column.dataKey!] = value
      dialogbox.dialogboxvalue = value
    }
    const onEnterEditMode = () => {
      rowData[values]= true
    }
    const onExitEditMode = () => {
      rowData[values] = false
    }
    const input = ref()
    const setRef = (el) => {
      input.value = el
      if (el) {
        el.focus()
      }
    }
    return rowData[values] ? (
      <InputCell
        forwardRef={setRef}
        value={rowData[column.dataKey!]}
        onChange={onChange}
        onBlur={onExitEditMode}
        onKeydownEnter={onExitEditMode}
      />
    ) : (
      <div class="table-v2-inline-editing-trigger" onClick={onEnterEditMode}>
        {rowData[column.dataKey!]}
      </div>
    )
}
//列表的数据
const columnsData: Column<any>[] = [
  {
    key: "id",
    title: "id",
    dataKey: "id",
    width: tablewidth,
    align: "center",
  },
  {
    key: "name",
    title: "姓名",
    dataKey: "name",
    width: tablewidth,
    align: "center",
    cellRenderer: ({ rowData, column,rowIndex }) => {
    return componentcellRenderer(rowData,column,"edittingname")
  },

  },
  {
    key: "age",
    title: "年龄",
    dataKey: "age",
    width: tablewidth,
    align: "center",
    cellRenderer: ({ rowData, column }) => {
    return componentcellRenderer(rowData,column,"edittingage")
  },
  },

  {
    key: "email",
    title: "邮箱",
    dataKey: "email",
    width: tablewidth,
    align: "center",
    cellRenderer: ({ rowData, column,rowIndex }) => {
   return componentcellRenderer(rowData,column,"edittingemail")
  },
    
  },
  {
    key: "birth",
    title: "生日",
    dataKey: "birth",
    width: tablewidth,
    align: "center",
    cellRenderer: ({ rowData, column,rowIndex }) => {
   return componentcellRenderer(rowData,column,"edittingbirth")
  },
  },
  {
    key: "addr",
    title: "地址",
    dataKey: "addr",
    width: tablewidth,
    align: "center",
    cellRenderer: ({ rowData, column,rowIndex }) => {
   return componentcellRenderer(rowData,column,"edittingaddr")
  },
  },
  {
    key: "operations",
    title: "操作按钮",
    width: 220,
    align: "center",
    cellRenderer: (dataKey) => (
      <>
        <el-button
          type="primary"
          onClick={editinventedtable.bind(this, dataKey, false)}
        >
          编辑
        </el-button>
        <el-button
          type="primary"
          onClick={addinventedtable.bind(this, dataKey, true)}
        >
          增加
        </el-button>
        <el-button
          type="danger"
          onClick={deleteinventedtable.bind(this, dataKey, true)}
        >
          删除
        </el-button>
      </>
    ),
  },
];
let selectedarr = []
//选择某一个或者多个元素进行操作
columnsData.unshift({
  key: 'selection',
  width: 50,
  cellRenderer: ({ rowData }) => {
    const onChange = (value: boolean) => (rowData.checked = value)
    return <SelectionCell value={rowData.checked} onChange={onChange} />
  },
  headerCellRenderer: () => {
    const _data = unref(tables)
    const onChange = (value: boolean) =>
      (tables.value = _data.map((row) => {
        row.checked = value  
        return row
      }))
    const allSelected = _data.every((row) => row.checked)
    const containsChecked = _data.some(function(item,index,arr){
    })
    //对加入的数组去重
    // selectedarr = Array.from(new Set(selectedarr))
    return (
      <SelectionCell
        value={allSelected}
        intermediate={containsChecked && !allSelected}
        onChange={onChange}
      />
    )
  },
})
//批量删除
const deletes = ()=>{
  
}
//高亮哪一行
const kls = ref<string>('')
//单个单元格执行的方法
const cellProps = ({ columnIndex }) => {
  const key = `hovering-col-${columnIndex}`
  return {
    ['data-key']: key,
    onMouseenter: () => {
      kls.value = key
    },
    onMouseleave: () => {
      kls.value = ''
    },
  }
}
//查询
const fingstringarr = ["name", "age", "addr", "email", "birth"];
const find = () => {
  tables.value = filterData(
    tables.value,
    fingstringarr,
    "addr",
    formInline.addr
  );
  tables.value = filterData(tables.value, fingstringarr, "age", formInline.age);
  tables.value = filterData(
    tables.value,
    fingstringarr,
    "email",
    formInline.email
  );
  tables.value = filterData(
    tables.value,
    fingstringarr,
    "name",
    formInline.name
  );
  tables.value = filterData(
    tables.value,
    fingstringarr,
    "birth",
    formInline.birth
  );
};
//重置
const reset = () => {
  tables.value = oldtables.value;
  formInline.addr = "";
  formInline.name = "";
  formInline.age = "";
  formInline.email = "";
};
//对话框的值
const dialogboxfunc={
  dialogboxok(value){
    dialogbox.centerDialogVisible = value
  }
}
//添加
const tablefunc = {
  adddialog(item) {
    axios.post('/api/tables/add').then((res:any)=>{ 
      if(res.data.success){
        tables.value.push(item)
        ElMessage({
          message: '添加成功',
          type: 'success',
        })
      }
    })
  },
  //编辑
  editdialog(item) {
     axios.post('/api/tables/edit').then((res:any)=>{ 
      if(res.data.success){
        tables.value[item.index] = item.data;
        ElMessage({
          message: '修改成功',
          type: 'success',
        })
      }
    })
    
  },
};

//删除
const deleteinventedtable = (item: any, editboolean: boolean) => {
  tables.value.splice(item.rowIndex, 1);
};
//编辑
const editinventedtable = (item: any, editboolean: boolean) => {
  froms.dialogFormVisible = true;
  froms.editboolean = editboolean;
  froms.froms = item;
  froms.fromsdata = item.rowData;
  froms.oldfromsdata = deepClone(item.rowData);
};
//增加
const addinventedtable = (item: any, editboolean: boolean) => {
  froms.dialogFormVisible = true;
  froms.editboolean = editboolean;
  froms.fromsdata = item.rowData;
};
onMounted(async () => {
  await axios.post("/api/tables").then((res) => {
    tables.value = res.data.data;
    oldtables.value = res.data.data;
  });

});
</script>
<style scoped>
.div {
  width: 100%;
  height: 100vh;
  flex-direction: row;
  display: flex;
  justify-content: center;
  align-items: center;
}
.conter-left {
  display: flex;
  align-content: center;
  justify-content: center;
  width: 100%;
  height: 100vh;
}
.common-layout {
  width: 100%;
}
.el-header,
.el-main {
  width: 100%;
}
.el-header {
  height: 80px;
  display: flex;
  justify-content: center;
  align-items: center;
  flex-direction: column;
}
.el-header .title {
  margin-top: 20px;
}
.el-header .find {
  margin-top: 20px;
}
.el-header .el-input {
  width: 120px;
}
.el-main {
  height: 80%;
}
.el-table__inner-wrapper :deep(.cell) {
  display: flex;
  justify-content: center;
  align-items: center;
}

:deep(.hovering-col-0 [data-key="hovering-col-0"]),
:deep(.hovering-col-1 [data-key="hovering-col-1"]),
:deep(.hovering-col-2 [data-key="hovering-col-2"]),
:deep(.hovering-col-3 [data-key="hovering-col-3"]),
:deep(.hovering-col-4 [data-key="hovering-col-4"]),
:deep(.hovering-col-5 [data-key="hovering-col-5"]) {
  background: var(--el-table-row-hover-bg-color);
}

:deep([data-key="hovering-col-0"]) {
  font-weight: bold;
  user-select: none;
  pointer-events: none;
}
</style>