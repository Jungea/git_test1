<template>
    <div class="p-4">
        <h2 class="mb-4">마이페이지</h2>
        <hr>
        <h4>프로필</h4>
        <div>
        <b-table stacked striped hover :items="items" :fields="fields">
            <template v-slot:cell(name)="row">
                <b-form-input v-model="row.item.name"/>
            </template>
            <template v-slot:cell(age)="row">
                <b-form-input v-model="row.item.age"/>
            </template>
        </b-table>
        {{ items }}
  </div>
    </div>
</template>

<script>
export default {
    data() {
      return {
      fields: { name: "name", age: "age" },
      items: [{ name: "Joe", age: 33 }]
    };
    }
}
</script>