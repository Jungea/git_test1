<template>
    <div>
        {{data}}
        <table class="m-3" border="1px solid black" width="500px">
            <tr>
                <th>번호</th>
                <th>내용</th>
                <th>글쓴이</th>
                <th>날짜</th>
                <th>파일</th>
            </tr>
            <tr v-for="value in data" :key="value.postId" @click="detail(value.postId)">
                <td>{{value.postId}}</td>
                <td>{{value.content}}</td>
                <td>{{value.author}}</td>
                <td>{{value.createDate}}</td>
                <td>{{value.file}}</td>

            </tr>
        </table>
        <button class="m-3" @click="write">글쓰기</button>
    </div>
</template>

<script>
import axios from 'axios'

export default {
    name: 'Read',
    data() {
        return {
            data: []
        }
    },
    mounted() {
        axios.get('/api/posts').then(response => this.data = response.data)
    },
    methods: {
        write() {
            this.$router.push({
                path: 'create'
            })
        },
        detail(postId) {
            this.$router.push({
                name: 'Detail', //이때 path가 아니다.
                params: {
                    postId: postId
                }
            })
        }
    }
}
</script>
<style scoped>
 td {
     cursor: pointer;
 }
</style>