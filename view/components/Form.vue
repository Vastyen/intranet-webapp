<template>

<div class="formularioSubirDocumento">
<label class="formLabel">Nombre del Documento</label>
<input class="imput">
<label class="formLabel">Cantidad de Horas</label>
<input type="number" class="imput">
<label class="formLabel">Selecciona el tipo de actividad</label>

<select class="selected">
    <option disabled value="">Tipo de Actividad</option>
    <option>Vinculación con el Medio</option>
    <option>Investigación</option>
    <option>Docencia</option>
</select>
</div>

</template>



<style>
*{
    font-family: "JetBrains Mono", monospace;
        
}

.formLabel{
    font-size: 1em;
    margin-top: 5vh;
    margin-bottom: 0.5vh;
}
.selected {
    font-size: 1rem;
}
.imput{
    border-radius: 1px;
    display: block;
    font-size: 1.5rem;
    margin: 0 auto;
    width: 40vw;
    height: 4vh;
    
}
</style>