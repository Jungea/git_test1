<template>
  <div class="login">
    <h3>Sign In</h3>
    <input type="text" v-model="email" placeholder="Email"><br>
    <input type="password" v-model="password" placeholder="Password"><br>
    <button>Connection</button>
  </div>
</template>
 
<script>
  export default {
    name: 'login',
    data() {
      return {};
    },
    methods: {}
  }
</script>
 
<style scoped>  /* "scoped" attribute limit the CSS to this component only */
  .login { margin-top: 40px; }
  input { margin: 10px 0; width: 200px; padding: 5px; }
  button { margin-top: 20px; width: 100px; cursor: pointer; padding: 5px; }
</style>
