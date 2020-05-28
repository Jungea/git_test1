<template>
  <b-container id="app" fluid>
    <b-row class="h-100">
      <b-col xl="2" class="header" ><Header/></b-col>
      <b-col class="content"><router-view/></b-col>
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

.header {
  border-right: 1px solid lightgray;
}
</style>
