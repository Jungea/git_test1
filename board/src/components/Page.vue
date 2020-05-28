<template>
    <div>
        <div>글글</div>
        <hr>

        <b-row cols-md="2" cols="1">
            <b-col class="mb-4" v-for="item in list" :key="item.id">
                <b-card>
                    <h3>{{item.id}}</h3>
                    <b-card-text>
                    {{item.first_name}} {{item.last_name}}
                    </b-card-text>
                </b-card>
            </b-col>
        </b-row>

        <b-pagination
            v-model="currentPage"
            :total-rows="rows"
            :per-page="perPage">
        </b-pagination>
    </div>
</template>
<script>
// import data from '@/data'
export default {
    data() {
        return {
            perPage: 3,
            currentPage: this.$route.query.page || 1,
            list: [],
            totalList: [
                { id: 1, first_name: 'Fred', last_name: 'Flintstone' },
                { id: 2, first_name: 'Wilma', last_name: 'Flintstone' },
                { id: 3, first_name: 'Barney', last_name: 'Rubble' },
                { id: 4, first_name: 'Betty', last_name: 'Rubble' },
                { id: 5, first_name: 'Pebbles', last_name: 'Flintstone' },
                { id: 6, first_name: 'Bamm Bamm', last_name: 'Rubble' },
                { id: 7, first_name: 'The Great', last_name: 'Gazzoo' },
                { id: 8, first_name: 'Rockhead', last_name: 'Slate' },
                { id: 9, first_name: 'Pearl', last_name: 'Slaghoople' },
                { id: 10, first_name: 'diverse', last_name: 'enormous' },
                { id: 11, first_name: 'match', last_name: 'arise' },
                { id: 12, first_name: 'interval', last_name: 'patent' },
                { id: 13, first_name: 'term', last_name: 'exceed' },
            ],
            rows: 0,
        } 
    },
    mounted() {
        this.rows = this.totalList.length;
        this.list = this.totalList.slice((this.currentPage-1) * this.perPage, this.currentPage * this.perPage)

    },
    watch: {
        currentPage() {
            this.$router.push({
                path: 'b', 
                query: {
                    page: this.currentPage
                }
            })
        }
    },    
}
</script>