<template>

    <div class="navbar">
<img class="navImg" src="../public/logo.png">
<div id="labels">
    <label class="cs" @click="dashboard()">Dashboard</label>
    <label class="bar">|</label>
<label class="cs" @click="upload()">Subir un Papper</label>
<label class="bar">|</label>
<label class="cs" @click="delet()">Mis Pappers</label>
<label class="bar">|</label>
<label class="cs" @click="logout()">Cerrar Sesión</label>
</div>

    </div>


</template>


<script>

export default{

    methods:{
        dashboard() {
            this.$router.push('/dashboard');
        },
        delet() {
            this.$router.push('/pappers');
        },
        logout(){
            this.$router.push('/');
        },
        upload(){
            this.$router.push('/upload');
  
        }
    },



}


</script>




<style>

.bar{
    font-size: 1em;
}

#labels{
    display: flex;
    justify-content: space-between;
    padding: 3vh;
}

label{
    margin: 1vh;
}

.cs:hover{
    color: rgb(224, 110, 10);
}

.cs{
    font-weight: bold;
    font-size: 1em;
}

.navbar{
    font-family: "JetBrains Mono", monospace;
    display: flex;
    justify-content: space-between;
    align-items: center;
    text-align: center;
    width: 100%;

    margin: 0 auto;
}

.navImg{
    width: 13%;
}
</style>