
<script lang="ts" setup>

import axios from "axios";
import { onMounted, reactive, ref } from "vue";

onMounted(async() => {
  // const data  = axios.post()  8e6d2315f3b54fb78e2d2a5d8d558cce
  await axios.post("https://route.showapi.com/2217-2?showapi_appid=1144031.0&showapi_timestamp=20220828113459&showapi_sign=cf122e5406b12388ab60df0673edaf0e").then((res) => {
    console.log(res.data.confirmedNum);
  });
});
</script>
<template>
  <div class="div">11111111111</div>
</template>

<style scoped>

</style>
