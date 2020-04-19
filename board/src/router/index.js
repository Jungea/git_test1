import Vue from 'vue'
import VueRouter from 'vue-router'
import Read from '@/components/Read'
import Create from '@/components/Create'

Vue.use(VueRouter)

  const routes = [
  {
    path: '/',
    name: 'Read',
    component: Read
  },
  {
    path: '/create',
    name: 'Create',
    component: Create
  },
 
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
