import Vue from 'vue'
import VueRouter from 'vue-router'
import Read from '@/components/Read'
import Create from '@/components/Create'
import Detail from '@/components/Detail'
import List from '@/components/List'
import Page from '@/components/Page'
import Kk from '@/components/Kk'

Vue.use(VueRouter)

  const routes = [
  {
    path: '/',
    name: 'Read',
    component: Read
  },
  {
    path: '/create/:contentId?',  //?는 있어도 그만 없어도 그만
    name: 'Create',
    component: Create
  },
  {
    path: '/detail/:contentId',
    name: 'Detail',
    component: Detail
  },
  {
    path: '/a',
    name: 'List',
    component: List
  },
  {
    path: '/b',
    name: 'Page',
    component: Page
  },
  {
    path: '/k',
    name: 'Kk',
    component: Kk
  },
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
