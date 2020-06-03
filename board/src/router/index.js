import Vue from 'vue'
import VueRouter from 'vue-router'
import Read from '@/components/Read'
import Create from '@/components/Create'
import Detail from '@/components/Detail'
import List from '@/components/List'
import Page from '@/components/Page'
import Chat from '@/components/Chat'
import GitHub from '@/components/GitHub'

Vue.use(VueRouter)

  const routes = [
  {
    path: '/',
    name: 'Read',
    component: Read
  },
  {
    path: '/create/:postId?',  //?는 있어도 그만 없어도 그만
    name: 'Create',
    component: Create
  },
  {
    path: '/detail/:postId',
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
    path: '/github',
    name: 'GitHub',
    component: GitHub
  },
  {
    path: '/chat',
    name: 'Chat',
    component: Chat
  },
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
