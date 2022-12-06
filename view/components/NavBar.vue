<template>

    <div class="navbar">
<img class="navImg" src="../public/logo.png">
<label class="cs" @click="upload()">Subir un Papper</label>
<label class="cs" @click="">Eliminar un Papper</label>
<label class="cs" @click="logout()">Cerrar Sesión</label>
    </div>


</template>


<script>

export default{

    methods:{
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