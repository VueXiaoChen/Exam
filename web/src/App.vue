<script setup lang="ts">
// This starter template is using Vue 3 <script setup> SFCs
// Check out https://vuejs.org/api/sfc-script-setup.html#script-setup
import DeomTs from './components/DeomTs/index6.vue'
import { useRouter } from "vue-router";
import { watch } from "vue";
const Router = useRouter()



// Router.beforeEach((to, from, next) => {
//     //在跳转路由之前，先清除所有的请求
//     console.log(to);
//     console.log(from);
//     if (to.path === "/") {
//         next()
//     } else {
//       if(Router.getRoutes().length<=2){
        
//       }else{
//         next()
//       }
//     }
// })


</script>

<template>
  <!-- <DeomTs/> -->
  <router-view />
</template>

<style>
*{
  margin: 0px;
  padding: 0px;
}
html,body,#app{
  width: 100%;
  height: 100%;
  font-size: 62.5%;
}
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  /* text-align: center;
  color: #2c3e50;
  margin-top: 60px; */
}
</style>