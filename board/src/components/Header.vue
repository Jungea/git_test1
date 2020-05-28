<template>
  <div>
    <b-nav vertical>
      <b-container>
        <b-row class="text-center">
          <b-col cols="2" class="p-0"><b-icon-house-fill  style="cursor:pointer" font-scale="1.4"></b-icon-house-fill></b-col>
          <b-col cols="6" class="p-0">{{name}} 님</b-col>
          <b-col cols="2" class="p-0"><b-icon-bell style="cursor:pointer" font-scale="1.3"></b-icon-bell></b-col>
          <b-col cols="2" class="p-0"><b-icon-gear style="cursor:pointer" font-scale="1.3"></b-icon-gear></b-col>
        </b-row>
      </b-container>

      <!-- <p class="mt-4 ml-1 text-center">
        
      </p> -->
      <b-nav-item disabled><hr/></b-nav-item>

      <b-nav-item> 
        <b-form-select v-model="selected" :options="options"></b-form-select>
      </b-nav-item>
      <b-nav-item><hr></b-nav-item>

      <div v-show="selected">
        <b-nav-item><strong>{{ selected }}</strong></b-nav-item>
        <b-nav-item>프로젝트 정보</b-nav-item>
        <b-nav-item>캘린더</b-nav-item>
        <b-nav-item>주차별 목표(to-do-list)</b-nav-item>
        <b-nav-item>토론 게시판</b-nav-item>
        <b-nav-item>자유 게시판</b-nav-item>
        <b-nav-item>관리</b-nav-item>
        <hr>
      </div>

      <b-nav-item>it 경진대회</b-nav-item>
      <b-nav-item>프로젝트 게시판</b-nav-item>
      <b-nav-item >커뮤니티 게시판</b-nav-item>
      <b-nav-item><hr></b-nav-item>

      <b-nav-item>
        <b-button block variant="dark">Logout</b-button>
      </b-nav-item>

    </b-nav>
  </div>
</template>
<script>
export default {
    name: "Header",
    data() {
      return {
        name: '홍길동',
        selected: null,
        options: [ 
          { value: null, text: '프로젝트를 선택하세요.' },
          { value: 1, text: '소캡프로젝트' },
          { value: 2, text: '디비프로젝트' }
          
          ]
      }
    }

}
</script>