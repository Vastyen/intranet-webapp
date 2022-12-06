<template>
    <div class="pappers">
    <NavBar></NavBar>
    <ul id="pappers">
        <li v-for="info in info" :key="info.message">
            {{ info}}
            <label @click="deleteData(info.id)">🗑️</label>
        </li>
    </ul>
</div>

   

</template>


<script>

import axios from 'axios';
export default {
    
    el: '#pappers',
    data: function() {
        return {
            info: null
        }
    },
    methods: {
        showPappers() {
            axios
                .get('http://localhost:8080/pappers/all')
                .then(data => this.info = data.data)
        },
        async deleteData(id){
            await axios.delete("http://localhost:8080/pappers/delete/" + id)
            this.$router.go()


        }
    },
    created: function (){
        this.showPappers()
    }

}

</script>


<style>
Body {
    background-color: #213564;
    color: white;
}
</style>
