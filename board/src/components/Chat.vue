<template>
    <div class="pt-4">
        <b-input-group class="mb-3">
            <b-form-input v-model.trim="name" :disabled="connect" @keyup.enter="login"></b-form-input>
            <b-input-group-append>
            <b-button v-if="!connect" @click="login">접속</b-button>
            <b-button v-else @click="disconnect">종료</b-button>
            </b-input-group-append>
        </b-input-group>
        <b-form-textarea
            id="textarea"
            v-model="chat"
            rows="15"
            disabled
        ></b-form-textarea>
        <b-input-group class="mt-3">
            <b-form-input v-model.trim="message" :disabled="!connect" @keyup.enter="submit"></b-form-input>
            <b-input-group-append>
            <b-button @click="submit" :disabled="!connect">전송</b-button>
            </b-input-group-append>
        </b-input-group>
    </div>
</template>
<script>
export default {
    name: 'Chat',
    data() {
        return{
            name: '',
            chat: '',
            message: '',
            wsocket: null,
            connect: false,
        }
    },
    methods: {
        login() {
            this.wsocket = new WebSocket("ws://localhost:8080/chat");
            this.wsocket.onopen = this.onOpen;
            this.wsocket.onmessage = this.onMessage;
            this.wsocket.onclose = this.onClose;
        },
        disconnect() {
            this.wsocket.close();
            this.connect = false;
        },
        submit() {
            this.chat = this.chat.concat(this.name+": "+this.message+"\n");
            this.wsocket.send(this.name+": "+this.message);
            this.message = '';
        },
        onOpen() {
            this.chat = this.chat.concat("연결되었습니다. \n");
            this.wsocket.send(this.name+"님이 접속하였습니다.");
            this.connect = true;
        },
        onMessage(evt) {
            this.chat = this.chat.concat(evt.data+"\n");
        },
        onClose() {
            this.chat = this.chat.concat("연결이 끊겼습니다. \n");
            this.wsocket.send(this.name+"님이 접속 종료하였습니다.");
        }
    }
    
}
</script>
<style lang="stylus" scoped>

</style>