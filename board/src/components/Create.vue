<template>
    <div class="m-3">
        <input type="text" v-model="writer" placeholder="글쓴이" /><br>
        <textarea v-model="content" placeholder="내용"></textarea><br>
        <b-form @submit="a" enctype="multipart/form-data">
            <b-form-file
            v-model="file"
            placeholder="Choose a file or drop it here..."
            drop-placeholder="Drop file here..."
            ></b-form-file>
            <div class="mt-3">Selected file: {{ file ? file.name : '' }}</div>

        </b-form>
        <button @click="a">버튼</button>

        <button>버튼</button>
    </div>
</template>
<script>
import axios from 'axios'

export default {
    name: 'Create',
    data() {
        const postId = this.$route.params.postId;
        return {
            data: {},
            postId: postId,
            writer: '',
            title: '',
            content: '',
            file: null
        }
    },
    mounted() {
        if(this.postId)
            axios.get('/api/post/'+this.postId)
                .then(response => this.data = response.data)
    },
    methods: {
        a() {
            console.log(this.file)
            axios.post('/api/post', {
                file: this.file
            }).then()
        }
        // write() {
        //     this.data.push({
        //         writer: this.writer,
        //         title: this.title,
        //         content: this.content
        //     })
        //     this.$router.push({
        //         path: '/'
        //     })
        // },
        // update() {
        //     data[this.index].writer = this.writer;
        //     data[this.index].title = this.title;
        //     data[this.index].content = this.content;

        //     this.$router.push({
        //         path: '/'
        //     })
        // }
    }
}
</script>