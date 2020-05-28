<template>
    <div>
        <b-form-select class="mt-4" v-model="selected" :options="options"></b-form-select>
        <b-form-input  v-model="text"></b-form-input>
        <b-button @click="search()"  >검색</b-button>

    </div>
</template>
<script>
export default {
    data() {
        return{

        }
    },
    methods: {
        search() {
            alert("헬로")
        }
    },
}
</script>