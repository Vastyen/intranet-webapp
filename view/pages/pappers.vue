<template>
    
    <div class="pappers">
        <NavBar />
    <ul id="pappers">
        <label>Pappers</label>
        <li v-for="info in info" :key="info.message">
           - {{ info.fileName}}
           <div id="buttons">
                <label class="trash" @click="deleteData(info.id)">Borrar 🗑️</label>
                <label class="bar">|</label>
                <label class="trash" @click="download(info.id)">Descargar 💾</label>
           </div>
           
           
        </li>
    </ul>
</div>

</template>

<script>

import axios from 'axios';
export default {
    
    name: '#pappers',
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
        ,
     download(id){
         window.location.replace("http://localhost:8080/pappers/download/" + id);
        }
    },
    created: function (){
        this.showPappers()
    }

}

</script>


<style>
body {
    background-color: #213564;
    color: white;
}
.bar {
    font-size: 1em;
}
.trash{
    margin-top: -0.5vh;
    margin-inline: 10vh;
    font-size: 1em;
}

#buttons{
    display: flex;
}


li{
   width: 90%;
   justify-content: space-between;
    margin: 0 auto;
    display: flex;
    margin-top: 5vh;
    }
</style>
