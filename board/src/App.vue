<template>
  <b-container id="app" fluid>
    <b-row class="h-100">
      <b-col class="myNav h-100 overflow-auto" cols="2"><Header/></b-col>
      <b-col clos="10"><router-view/></b-col>
    </b-row>
  </b-container>
</template>

<script>
import Header from '@/components/Header'
export default {
  name: 'App',
  components: {
    Header,
  }
}
</script>

<style>
html, body, #app {
  height: 100%
}
#app {
  border: 1px solid red;
}
  .myNav{
    border: 1px solid gray;
  }
</style>
