<template>

  <div id="login">
      <div id="left">
    <Logo></Logo></div>
    <div id="right">
    <Login></Login></div>
  </div>
</template>

<script>
export default {
  name: 'IndexPage'
}
</script>

<style>
*{
  
    color: white;
    font-family: "JetBrains Mono", monospace;
    background-color: #213564;
  }



#login{
  display: flex;
  margin: 0 auto;
  margin-inline: 10%;
  width: 80%;
  justify-content: center;
  position: absolute;
  top: 30%;

}

#right{
  margin-inline: 10%;
 


}

#left{
  margin-inline: 10%;
  margin-top: 2%;
  
}
</style>