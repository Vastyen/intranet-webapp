<template>
    <form>
        <label>Iniciar Sesión</label>
        <input  placeholder="Escriba su correo">
        <input  placeholder="Escriba su contraseña">
        <button>Ingresar</button>
    </form>
</template>


<style>
@import url('https://fonts.googleapis.com/css2?family=IBM+Plex+Mono:wght@500&display=swap');
button{
    margin: 0 auto;
    margin-top: 5vh;
    display: flex;
    align-items: center;
    font-size: 1.2em;
    padding: 1vh;
    border-color:#213564;
            
}


label{
    justify-content: center;
    align-items: center;
  
    font-size: 2em;
    
}

*{
    font-family: 'IBM Plex Mono', monospace;
  
}

form{
    
}

input{
    display: block;
    justify-content: center;
    align-items: center;
    padding: 1vh;
    margin: 2vh;
    font-size: 1em;
}
</style>
