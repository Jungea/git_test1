<template>
    <div class="p-4">
        <h2 class="mb-4">프로젝트 관리</h2>
        <hr>
        <div>
            <h5>팀원</h5>
            <b-form inline>
                <label class="sr-only" for="inline-form-input-name">Name</label>
                <b-input class="mr-2" type="search" v-model="text" placeholder="팀원이름"></b-input>
                <b-button variant="primary">Save</b-button>
            </b-form>
            <!-- <b-container fluid>
                <b-form-row>
                    <b-col cols="5">
                        <label class="sr-only" for="inline-form-input-name">Name</label>
                        <b-input class="mr-2" type="search" v-model="text" placeholder="팀원이름"></b-input>
                    </b-col>
                    <b-col cols="1"><b-button block variant="primary">Save</b-button></b-col>
                 
                </b-form-row>
            </b-container> -->
        </div>
    </div>
</template>
<script>
export default {
    
}
</script>
<style lang="stylus" scoped>

</style>