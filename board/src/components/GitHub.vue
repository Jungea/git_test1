<template>
    <div class="pt-3">
        <b-form-textarea
            id="textarea"
            v-model="data"
            rows="15"
        ></b-form-textarea>
        <b-button @click="connect()">연결</b-button>

    </div>
</template>
<script>
import axios from 'axios'
export default {
    data() {
        return{
            data: null,
        }
    },
    methods: {
        connect() {
            axios.get('https://api.github.com/users/Jungea/repos')
                .then(r => console.log(r.data))
        }
    },
}
</script>