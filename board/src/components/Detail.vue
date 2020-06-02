<template>
    <div>
        <div>번호: {{data.postId}}</div>
        <div>내용: {{data.content}}</div>
        <div>작성자: {{data.author}}</div>
        <div>날짜: {{data.createDate}}</div>
        <div>파일: {{data.file}}</div>
        <button @click="updateData">수정</button>
        <button @click="deleteData">삭제</button>
   </div>
</template>
<script>
import axios from 'axios'

export default {
    name: 'Detail',
    data() {
        const postId = this.$route.params.postId
        return {
            data: {},
            postId: postId
        }
    }, 
    mounted() {
        axios.get('/api/post/'+this.postId)
        .then(response => this.data = response.data)
    },
    methods: {
        deleteData() {
            this.$router.push({
                path: '/'
            })
        },
        updateData() {
            this.$router.push({
                name: 'Create', //이때 path가 아니다.
                params: {
                    postId: this.postId
                }
            })
        }
    }
}
</script>