<template>
  <div class="div">
    <div class="conter-rigth">
      <div class="common-layout">
        <el-container>
          <el-header>普通表格</el-header>
          <el-main>
            <el-table
              :data="tables"
              style="width: 100%"
              :header-cell-style="{ 'text-align': 'center' }"
              :cell-style="{ 'text-align': 'center' }"
            >
              <el-table-column prop="id" label="id" width="60" />
              <el-table-column prop="name" label="姓名" width="100" />
              <el-table-column prop="age" label="年龄" width="60" />
              <el-table-column prop="email" label="邮箱" width="100" />
              <el-table-column prop="birth" label="生日" width="100" />
              <el-table-column prop="addr" label="地址" />
              <el-table-column align="right" width="240">
                <template #header> </template>
                <template #default="scope">
                  <el-button type="primary" onClick=""> 编辑 </el-button>
                  <el-button type="primary" onClick=""> 增加 </el-button>
                  <el-button type="danger" onClick=""> 删除 </el-button>
                </template>
              </el-table-column>
            </el-table>
          </el-main>
        </el-container>
      </div>
    </div>
  </div>
<Componenttablesfrom :froms="froms" v-on="tablefunc"></Componenttablesfrom>
</template>

<script lang="tsx" setup>
import axios from "axios";
import { onMounted, reactive, ref } from "vue";
import Componenttablesfrom from '../component/Componenttables.vue'
const tables = ref([]);
const tablewidth = 130;
let froms = reactive({
  dialogFormVisible:false,
  froms:{},
  fromsdata:{},
  editboolean:false,
  oldfroms:{},
})
const tablefunc = {

}
onMounted(async () => {
  await axios.post("/api/tables").then((res) => {
    tables.value = res.data.data;
    
  });
});
</script>
<style scoped>
.div {
  width: 100%;
  height: 100%;
  flex-direction: row;
  display: flex;
  justify-content: center;
  align-items: center;
}
.conter-rigth {
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
  height: 60px;
  display: flex;
  justify-content: center;
  align-items: center;
}
.el-main {
  height: 80%;
}
.el-table__inner-wrapper :deep(.cell) {
  display: flex;
  justify-content: center;
  align-items: center;
}
</style>