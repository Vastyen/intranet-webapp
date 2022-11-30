<template>
 <div class="hello">
    <form>
    <input type="file" @change="uploadFile" ref="file">
    <button class="button-28" role="button" @click="submitFile">Subir Documento</button>
    </form>
</div>
</template>


<script>
import axios from 'axios';

export default{
 
    name: "Fingeso",
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
                res.data.files; 
                res.status; 
            });
        }
    },

    created:function(){
        this.onImageUpload,
        this.fileUpload;
    }
}

</script>
<style>
input{
    display: block;
    justify-content: center;
    align-items: center;
    text-align: center;
    font-size: 1em;
    margin: 1vh;
    font-size: 1em;
}

form{
    display: block;
    justify-content: center;
    align-items: center;
    text-align: center;
         
}

        .button-28 {
            appearance: none;
            background-color: #eca45c;
            border: 2px solid white;
            border-radius: 15px;
            box-sizing: border-box;
            color: black;
            cursor: pointer;
            display: inline-block;
            font-family: Roobert, -apple-system, BlinkMacSystemFont, "Segoe UI", Helvetica, Arial, sans-serif, "Apple Color Emoji", "Segoe UI Emoji", "Segoe UI Symbol";
            font-size: 16px;
            font-weight: 600;
            line-height: normal;
            margin: 0;
            min-height: 60px;
            min-width: 0;
            outline: none;
            padding: 16px 24px;
            text-align: center;
            text-decoration: none;
            transition: all 300ms cubic-bezier(.23, 1, 0.32, 1);
            user-select: none;
            -webkit-user-select: none;
            touch-action: manipulation;
            width: 100%;
            will-change: transform;
        }
    
        .button-28:disabled {
            pointer-events: none;
        }
    
        .button-28:hover {
            color: #fff;
            background-color: transparent;
            box-shadow: rgba(0, 0, 0, 0.25) 0 8px 15px;
            transform: translateY(-2px);
            color: white;
        }
    
        .button-28:active {
            box-shadow: none;
            transform: translateY(0);
        }
</style>