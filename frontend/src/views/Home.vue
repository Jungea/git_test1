<template>
  <div class="home h-100">
    <b-row class="h-100">
      <b-col class="myNav overflow-auto" cols="200px">
        <Sidebar/>
      </b-col>
      <b-col>
        <ProjectManage/>
      </b-col>
    </b-row>
  </div>
</template>

<script>
import Sidebar from '@/components/Sidebar.vue'
import ProjectManage from '@/components/ProjectManage.vue'
// import MyPage from '@/components/MyPage.vue'


export default {
  name: 'Home',
  components: {
    Sidebar, ProjectManage
  }
}
</script>
