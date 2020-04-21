<template>
    <div>
        <b-button v-b-toggle.sidebar-1>Toggle Sidebar</b-button>
        <table>
            <tr>
                <th>글쓴이</th>
                <th>제목</th>
                <th>내용</th>
            </tr>
            <tr :key="index" v-for="(value,index) in data" @click="detail(index)">
                <td>{{value.writer}}</td>
                <td>{{value.title}}</td>
                <td>{{value.content}}</td>
            </tr>
        </table>
        <button @click="write">글쓰기</button>
    </div>
</template>

<script>
import data from '@/data'

export default {
    name: 'Read',
    data() {
        return {
            data: data
        }
    },
    methods: {
        write() {
            this.$router.push({
                path: 'create'
            })
        },
        detail(index) {
            this.$router.push({
                name: 'Detail', //이때 path가 아니다.
                params: {
                    contentId: index
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