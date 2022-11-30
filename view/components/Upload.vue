<template>
 <div class="hello">
    <form>
    <input type="file" @change="uploadFile" ref="file">
    <button @click="submitFile">Upload!</button>
    </form>
</div>
</template>

<script>
import axios from 'axios';

export default{
 
    name: "HelloWorld",
    data: () => ({
        formData: null
    }),

    methods: {
        uploadFile() {
            this.Images = this.$refs.file.files[0];
        },
        submitFile() {
            const formData = new FormData();
            formData.append('file', this.Images);
            const headers = { 'Content-Type': 'multipart/form-data' };
            axios.post('http://localhost:8080/upload', formData, { headers }).then((res) => {
                res.data.files; // binary representation of the file
                res.status; // HTTP status
            });
            alert("Archivo subido")

            


        }
     

    },




    created:function(){
        this.onImageUpload,
        this.fileUpload;
    }


}

</script>