<template>
    <div class="navbar">
        <img class="navImg" src="../public/logo.png">
        <div id="labels">
            <router-link to="/dashboard" class="cs">Dashboard</router-link>
            <label class="bar">|</label>
            <router-link to="/upload" class="cs">Subir un Papper</router-link>
            <label class="bar">|</label>
            <router-link to="/pappers" class="cs">Mis Pappers</router-link>
            <label class="bar">|</label>
            <router-link to="/" class="cs">Cerrar Sesión</router-link>
            <router-view/>
        </div>
    </div>
</template>

<style>
.bar{
    font-size: 1em;
}

#labels{
    display: flex;
    justify-content: space-between;
    padding: 3vh;
    
}



.cs:hover{
    color: rgb(224, 110, 10);
}

.cs{
    font-weight: bold;
    font-size: 1em;
    text-decoration: none;
    color: white;
    margin-inline: 1vh;
    transition: 0.1s;
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