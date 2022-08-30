<template>
  <el-dialog
    v-model="froms.dialogFormVisible"
    title="提示"
    @close="exit"
  >
    <el-form :model="form">
      <el-form-item label="姓名">
        <el-input v-model="form.name" autocomplete="off" />
      </el-form-item>
      <el-form-item label="年龄">
        <el-input v-model="form.age" autocomplete="off" />
      </el-form-item>
      <el-form-item label="邮箱">
        <el-input v-model="form.email" autocomplete="off" />
      </el-form-item>
      <el-form-item label="生日">
        <el-input v-model="form.birth" autocomplete="off" />
      </el-form-item>
      <el-form-item label="地址">
        <el-input v-model="form.addr" autocomplete="off" />
      </el-form-item>
    </el-form>
    <template #footer>
      <span class="dialog-footer">
        <el-button @click="exit">取消</el-button>
        <el-button type="primary" @click="btndaddialog" v-show="props.froms.editboolean">{{btntitle}}</el-button>
        <el-button type="primary" @click="btneditdialog" v-show="!props.froms.editboolean">{{btntitle}}</el-button>
      </span>
    </template>
  </el-dialog>
</template>

<script lang="ts" setup>
import { reactive, ref } from "@vue/reactivity";
import { watch } from "@vue/runtime-core";
import { useBase64 } from "@vueuse/core";
import { fromJSON } from "postcss";
import { deepClone } from "../type/until";
//接收父组件传过来的值
const props = defineProps({
  froms: {
    type: Object,
    default: {},
  },
});
//按钮标题
const btntitle = ref("增加")
//表格框内容
let form = ref({
  name: "",
  age: "",
  email: "",
  birth: "",
  addr: "",
});
//清空表格所有数据
const formdeepclone = form.value;
//子组件传递给父组件数据
const emits = defineEmits(["adddialog","editdialog"]);
const btndaddialog = () => {
  props.froms.dialogFormVisible = false;
  emits("adddialog",form.value)
};
//修改数据方法
const btneditdialog = () => {
  props.froms.dialogFormVisible = false;
  const data = {
    index:props.froms.froms.rowIndex,
    data:form.value,
  }
  emits("editdialog",data)
};
//退出
const exit = () => {
  props.froms.dialogFormVisible = false;
  form.value = props.froms.oldfromsdata
};
//监听父组件传过来的值
watch(
  () => props.froms,
  (val, oldVal) => {
    if (!val.editboolean) {
      form.value = deepClone(val.fromsdata) as any;  
      btntitle.value="修改"
      console.log();
      
    } else {
      form.value = formdeepclone;
      btntitle.value="增加"
    }
  },
  {
    // immediate: true,
    deep: true,
  }
);
</script>
<style scoped>
</style>