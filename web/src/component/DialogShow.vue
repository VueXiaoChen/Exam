<script setup lang="ts">
import { ref, defineProps } from "vue";
const props = defineProps({
  dialogRective:{
    type: Object,
    default: {},
  }
});
console.log(props.dialogRective);

const emits = defineEmits(["editdialogShow","deletedialog"]);
const Exit = () => {
  emits("editdialogShow", false);
};
const Ok = () => {
  const Objects = {
    dialogShow:false,
    dialogItem:props.dialogRective.dialogItem
  }
  emits("deletedialog", Objects);
};
const close = () => {
  emits("editdialogShow", false);
};
</script>
<template>
  <div class="Dialogs">
    <el-dialog
      v-model="dialogRective.dialogShow"
      :title="dialogRective.dialogTitle"
      width="40%"
      top="25vh"
      @close="close"
    >
      <span class="s-content">{{ dialogRective.dialogContent }}</span>
      <template #footer>
      <span class="dialog-footer">
        <el-button @click="Exit">取消</el-button>
        <el-button type="primary" @click="Ok"
          >确定</el-button
        >
      </span>
    </template>
    </el-dialog>
  </div>
</template>

<style>
.Dialogs .s-content {
  display: flex;
  justify-content: center;
  align-items: center;
  width: 100%;
  height: 60px;
  font-size: 1.6rem;
}
.Dialogs .el-dialog {
  border-radius: 20px;
}
 .Dialogs .el-button {
  width: 150px;
  height: 49px;
  border-radius: 49px;
  border: none;
  outline: none;
  background-color: #5995fd;
  color: #fff;
  text-transform: uppercase;
  font-weight: 600;
  margin: 10px 0;
  cursor: pointer;
  transition: 0.5s;
}
.Dialogs .el-button:hover{
  background-color: #4d84e2;
}
.Dialogs .el-dialog__footer{
  display: flex;
  justify-content: center;
  align-items: center;
}
 .Dialogs .dialog-footer{
  display: flex;
  width: 80% !important;
  justify-content: space-around;
  align-items: center;
 }
</style>
