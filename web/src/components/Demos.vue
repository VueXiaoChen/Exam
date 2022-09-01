
<script lang="ts" setup>
import axios from "axios";
import { onMounted, reactive, ref } from "vue";

const data = ref();
const update = () => {
  data.value.data.list[0].name = "我是谁啊";
  axios
    .post("http://localhost:8080/ebook/save", data.value.data.list[0])
    .then((res) => {
      console.log("修改成功");
    });
};
const deletes = () => {
  console.log(data.value.data.list);
  
  // axios
  //   .delete("http://localhost:8080/ebook/delete/"+ 9)
  //   .then((res) => {
  //     console.log(res);
  //   });
};
const add = () => {
  const data = {
    name: "345345345345",
    category1Id: 23423,
    category2Id: 58234235,
    description: "234234",
    cover: "VCHAq5345mBUGN",
    docCount: 234,
    viewCount: 234,
    voteCount: 623423431,
  };
  axios
    .post("http://localhost:8080/ebook/save", data)
    .then((res) => {
      console.log("增加成功");
    });
};

onMounted(async () => {
  const params = ref({
    page: 1,
    size: 10000,
  });

  // const data  = axios.post()  8e6d2315f3b54fb78e2d2a5d8d558cce
  // await axios.post("https://route.showapi.com/2217-2?showapi_appid=1144031.0&showapi_timestamp=20220828113459&showapi_sign=cf122e5406b12388ab60df0673edaf0e").then((res) => {
  //   console.log(res.data.confirmedNum);
  // });

  await axios
    .get("http://localhost:8080/ebook/findall", {
      params: {
        page: params.value.page,
        size: params.value.size,
      },
    })
    .then((res) => {
      console.log(res);
      
      data.value = res.data;
    });
});
</script>
<template>
  <el-button type="primary" @click="update">修改</el-button>
  <el-button type="primary" @click="add">增加</el-button>
  <el-button type="primary" @click="deletes">删除</el-button>
</template>

<style scoped>
</style>
