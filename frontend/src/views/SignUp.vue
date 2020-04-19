
<template>
  <div class="sign-up">
    <h3>Let's create a new account !</h3>
    <input type="text" v-model="email" placeholder="Email"><br>
    <input type="password" v-model="password" placeholder="Password"><br>
    <button>Sign Up</button>
  </div>
</template>
 
<script>
  export default {
    name: 'signUp',
    data() {
      return {}
    },
    methods: {}
  }
</script>
 
<style scoped>
  .sign-up { margin-top: 40px; }
  input { margin: 10px 0; width: 200px; padding: 5px; }
  button { margin-top: 10px; width: 100px; cursor: pointer; }
  p { margin-top: 20px; }
</style>