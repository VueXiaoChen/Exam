import { createRouter, createWebHistory } from 'vue-router'

const routes = [
  {
    path: '/',
    component: () => import('../components/Demos.vue'),
    name: 'Loading',
    meta: {
      title: '登录',
      keepAlive: true,
    },
  },
]
const router = createRouter({ history: createWebHistory(), routes });

export default router