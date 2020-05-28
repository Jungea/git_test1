<template>
    <b-container class="bv-example-row">
        <b-row class="m-4">
            <b-col><h2>내 프로젝트 목록</h2></b-col>
        </b-row>
        <b-row class="m-4">
            <b-col>
                <model-list-select :list="options1"
                    v-model="objectItem"
                    option-value="code"
                    :custom-text="codeAndNameAndDesc"
                    placeholder="Enter user number">
                </model-list-select>
            </b-col>
            <b-col>
                 {{objectItem}}<b-button :disabled="!objectItem">Invite</b-button>
            </b-col>
        </b-row>
        <b-row cols-md="2" cols="1">
            <b-col class="mb-4">
                <b-card title="Card title" sub-title="Card subtitle">
                    <b-card-text>
                    Some quick example text to build on the <em>card title</em> and make up the bulk of the card's
                    content.
                    </b-card-text>

                    <b-card-text>A second paragraph of text in the card.</b-card-text>

                    <a href="#" class="card-link">Card link</a>
                    <b-link href="#" class="card-link">Another link</b-link>
                </b-card>
            </b-col>
            <b-col class="mb-4">
                <b-card title="Card title" sub-title="Card subtitle">
                    <b-card-text>
                    Some quick example text to build on the <em>card title</em> and make up the bulk of the card's
                    content.
                    </b-card-text>

                    <b-card-text>A second paragraph of text in the card.</b-card-text>

                    <a href="#" class="card-link">Card link</a>
                    <b-link href="#" class="card-link">Another link</b-link>
                </b-card>
            </b-col>
            <b-col class="mb-4">
                <b-card title="Card title" sub-title="Card subtitle">
                    <b-card-text>
                    Some quick example text to build on the <em>card title</em> and make up the bulk of the card's
                    content.
                    </b-card-text>

                    <b-card-text>A second paragraph of text in the card.</b-card-text>

                    <a href="#" class="card-link">Card link</a>
                    <b-link href="#" class="card-link">Another link</b-link>
                </b-card>
            </b-col>
            <b-col class="mb-4">
                <b-card title="Card title" sub-title="Card subtitle">
                    <b-card-text>
                    Some quick example text to build on the <em>card title</em> and make up the bulk of the card's
                    content.
                    </b-card-text>

                    <b-card-text>A second paragraph of text in the card.</b-card-text>

                    <a href="#" class="card-link">Card link</a>
                    <b-link href="#" class="card-link">Another link</b-link>
                </b-card>
            </b-col>
            <b-col class="mb-4">
                <b-card title="Card title" sub-title="Card subtitle">
                    <b-card-text>
                    Some quick example text to build on the <em>card title</em> and make up the bulk of the card's
                    content.
                    </b-card-text>

                    <b-card-text>A second paragraph of text in the card.</b-card-text>

                    <a href="#" class="card-link">Card link</a>
                    <b-link href="#" class="card-link">Another link</b-link>
                </b-card>
            </b-col>
            <b-col class="mb-4">
                <b-card title="Card title" sub-title="Card subtitle">
                    <b-card-text>
                    Some quick example text to build on the <em>card title</em> and make up the bulk of the card's
                    content.
                    </b-card-text>

                    <b-card-text>A second paragraph of text in the card.</b-card-text>

                    <a href="#" class="card-link">Card link</a>
                    <b-link href="#" class="card-link">Another link</b-link>
                </b-card>
            </b-col>
        </b-row>
        <b-row>
            <b-col>
                <draggable class="list-group" :list="list1" group="people" @change="log">
                    <div
                    class="list-group-item"
                    v-for="(element, index) in list1"
                    :key="element.name"
                    >
                    {{ element.name }} {{ index }}
                    </div>
                </draggable>
            </b-col>
            <b-col>
                <draggable class="list-group" :list="list2" group="people" @change="log">
                    <div
                    class="list-group-item"
                    v-for="(element, index) in list2"
                    :key="element.name">
                    {{ element.name }} {{ index }}
                    </div>
                </draggable>
            </b-col>
            
        </b-row>
        <b-row>
            <b-col>
                {{list1}}
            </b-col>
            <b-col>
                {{list2}}
            </b-col>
        </b-row>
        <b-row>
            <b-col><hr></b-col>
        </b-row>
    </b-container> 
</template>

<script>
import { ModelListSelect } from 'vue-search-select'
import draggable from 'vuedraggable'
export default {
 data () {
      return {
         options1: [
          { code: 1, name: '홍길동', desc: '201732000' },
          { code: 2, name: '개똥이', desc: '201732001' },
          { code: 3, name: '소똥이', desc: '201732002' },
          { code: 4, name: '말똥이', desc: '201732003' },
          { code: 5, name: '개똥이2', desc: '201732004' },
          { code: 6, name: '양똥이', desc: '201732005' }
        ],
        objectItem: null,
         list1: [
        { name: "John", id: 1 },
        { name: "Joao", id: 2 },
        { name: "Jean", id: 3 },
        { name: "Gerard", id: 4 }
      ],
      list2: [
        { name: "Juan", id: 5 },
        { name: "Edgard", id: 6 },
        { name: "Johnson", id: 7 }
      ]
      }
    },
    methods: {
      reset1 () {
        this.objectItem = {}
      },
       codeAndNameAndDesc (item) {
        return `${item.desc}(${item.name})`
      },
      log: function(evt) {
      window.console.log(evt);
    }
      
    },
    components: {
      ModelListSelect,
      draggable
    }
  }


</script>
<style lang="stylus" scoped>

</style>