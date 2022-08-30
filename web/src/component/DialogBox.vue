<template>
<div class="divbox">
  <el-dialog v-model="props.dialogbox.centerDialogVisible" title="提示" width="30%" top="30vh" center>
    <span>{{props.dialogbox.content}}</span
    >
    <template #footer>
      <span class="dialog-footer">
        <el-button @click="props.dialogbox.centerDialogVisible = false">取消</el-button>
        <el-button type="primary" @click="ok"
          >确定</el-button
        >
      </span>
    </template>
  </el-dialog>
</div>
</template>
<script lang="ts" setup>
import { ref } from 'vue'
const props = defineProps({
  dialogbox:{
    type: Object,
    default: {},
  }
});
const emits = defineEmits(["dialogboxok"]);
const ok=()=>{
  emits("dialogboxok", false);
}
</script>
<style scoped>
.divbox :deep(.el-dialog) {
  border-radius: 20px;
}
.dialog-footer button:first-child {
  margin-right: 10px;
}
.el-dialog__body span{
  display: flex;
  justify-content: center;
  align-items: center;
  font-size: 2rem;

}
</style>
