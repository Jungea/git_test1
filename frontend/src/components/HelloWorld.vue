<template>
  <div class="hello">
    <h1>{{ msg }}</h1>
   <table>
      <tr v-for="p in persons" v-bind:key="p.id">
        <td>{{ p.id }}</td>
        <td>{{ p.name }}</td>
        <td>{{ p.age }}</td>
      </tr>
    </table>
    <button type="button" v-on:click="getPersons()">조회</button>
    <button type="button" v-on:click="clearPersons()">지우기</button>
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  props: {
    msg: String
  },
  data() {
    return { 
      persons: []
    }    
  },
  methods:{
    getPersons() {
      this.persons = [
        {id:1, name:'홍길동', age:18 },
        {id:2, name:'임꺽정', age:19 },
        {id:3, name:'전우치', age:20 }
      ]
    },
    clearPersons() {
      this.persons = [];
    }
  }

}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
div { text-align: center; }
table { width: 400px; border-collapse: collapse; margin: auto; }
td { border: 1px solid gray; }
button { margin: 10px; }
</style>
