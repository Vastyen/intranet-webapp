<template>
    <div class="pdf">
      <vue-pdf-embed :source="pdfSource" />
    </div>
 
</template>


<script>
import VuePdfEmbed from 'vue-pdf-embed';

export default ({
  data() {
    return {
      pdfSource:
        'https://raw.githubusercontent.com/mozilla/pdf.js/ba2edeae/examples/learning/helloworld.pdf',
    };
  },
  components: {
    VuePdfEmbed,
  },
});

</script>



<style>
.pdf {
  display: flex;
  justify-content: center;
  align-items: center;
  overflow: scroll;
  padding: 1em;
  margin: 1em;
  border: 1px solid gray;
}
</style>