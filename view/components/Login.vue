<template>
    <div class="form">
    <form>
        <label>Iniciar Sesión</label>
        <div class="form__group field">
            <input type="input" class="form__field" placeholder="Name" name="name" id='name' required />
            <label for="name" class="form__label">Correo Electrónico</label>
        </div>
        <div class="form__group field">
            <input type="input" class="form__field" placeholder="Name" name="name" id='name' required />
            <label for="name" class="form__label">Contraseña</label>
        </div>
        <button class="button-30" role="button" @click="ingresar">Ingresar</button>
    </form>
    </div>
  
</template>

<script>

export default{
    methods: {
        ingresar() {
            this.$router.push('/upload');
        }
    },

}

</script>

<style>
form{
    display: block;
    justify-content: center;
    text-align: center;
    align-items: center;
}

button{
    display: block;
    margin: 0 auto;
    margin-top: 3vh;
    font-size: 1.3em;

}

.button-30 {
    align-items: center;
    appearance: none;
    background-color: #FCFCFD;
    border-radius: 4px;
    border-width: 0;
    box-shadow: rgba(45, 35, 66, 0.4) 0 2px 4px, rgba(45, 35, 66, 0.3) 0 7px 13px -3px, #D6D6E7 0 -3px 0 inset;
    box-sizing: border-box;
    color: #36395A;
    cursor: pointer;
    display: inline-flex;
    font-family: "JetBrains Mono", monospace;
    height: 48px;
    justify-content: center;
    line-height: 1;
    list-style: none;
    overflow: hidden;
    padding-left: 16px;
    padding-right: 16px;
    position: relative;
    text-align: left;
    text-decoration: none;
    transition: box-shadow .15s, transform .15s;
    user-select: none;
    -webkit-user-select: none;
    touch-action: manipulation;
    white-space: nowrap;
    will-change: box-shadow, transform;
    font-size: 18px;
}

.button-30:focus {
    box-shadow: #D6D6E7 0 0 0 1.5px inset, rgba(45, 35, 66, 0.4) 0 2px 4px, rgba(45, 35, 66, 0.3) 0 7px 13px -3px, #D6D6E7 0 -3px 0 inset;
}

.button-30:hover {
    box-shadow: rgba(45, 35, 66, 0.4) 0 4px 8px, rgba(45, 35, 66, 0.3) 0 7px 13px -3px, #D6D6E7 0 -3px 0 inset;
    transform: translateY(-2px);
}

.button-30:active {
    box-shadow: #D6D6E7 0 3px 7px inset;
    transform: translateY(2px);
}


label{
    display: block;
    font-size: 1.8em;
    color: white;   
}

input{
    display: block;
    

}

.form__group {
    position: relative;
    padding: 40px 0 0;
    margin-top: 20px;
    width: 100%;
}

.form__field {
    font-family: inherit;
    width: 100%;
    border: 0;
    border-bottom: 2px solid #9b9b9b;
    outline: 0;
    font-size: 1.5rem;
    color: #fff;
    padding: 7px 0;
    background: transparent;
    transition: border-color 0.2s;
}

.form__field::placeholder {
    color: transparent;
}

.form__field:placeholder-shown~.form__label {
    font-size: 1rem;
    cursor: text;
    top: 20px;
}

.form__label {
    position: absolute;
    top: 0;
    display: block;
    transition: 0.2s;
    font-size: 1rem;
    color: white;
}

.form__field:focus {
    padding-bottom: 6px;
    font-weight: 700;
    border-width: 3px;
    border-image: linear-gradient(to right, white, #F3AD66);
    border-image-slice: 1;
}

.form__field:focus~.form__label {
    position: absolute;
    top: 0;
    display: block;
    transition: 0.2s;
    font-size: 1rem;
    color: #F3AD66;
    font-weight: 700;
}

.form__field:required,
.form__field:invalid {
    box-shadow: none;
}
</style>
