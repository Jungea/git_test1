<template>
  <div class="hello">
    <h1>{{ msg }}</h1>
   <table>
      <tr v-for="p in persons" v-bind:key="p.id">
        <td>{{ p.id }}</td>
        <td>{{ p.name }}</td>
        <td>{{ p.year }}</td>
      </tr>
    </table>
    <button type="button" v-on:click="getPersons()">조회</button>
    <button type="button" v-on:click="clearPersons()">지우기</button>
  </div>
</template>

<script>
import axios from 'axios';

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
      const url = '/api/students';
        return axios.get(url)
                    .then(response => this.persons = response.data);
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
