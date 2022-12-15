# Fullstack Website using vue.js springboot and postgresql
Website using vuejs, springboot, vue.js and postgresql.

## Configuration

### Install
            git clone https://github.com/vastien/fingeso-vuejs-springboot-postgresql/
            cd fingeso-vuejs-springboot-postgresql

### Dependencies

          npm i axios@0.21.1
          npm i @vuelidate/core @vuelidate/validators
          npm i nuxt@2.15.8

### Package
{
  "name": "view",
  "version": "1.0.0",
  "lockfileVersion": 3,
  "requires": true,
  "packages": {
    "": {
      "name": "view",
      "version": "1.0.0",
      "dependencies": {
        "@nuxtjs/auth-next": "5.0.0-1667386184.dfbbb54",
        "@nuxtjs/axios": "^5.13.6",
        "@vuelidate/core": "^2.0.0",
        "@vuelidate/validators": "^2.0.0",
        "axios": "^0.21.1",
        "core-js": "^3.25.3",
        "nuxt": "^2.15.8",
        "vue": "^2.7.10",
        "vue-server-renderer": "^2.7.10",
        "vue-template-compiler": "^2.7.10"
      },
      "devDependencies": {
        "@vue/test-utils": "^1.3.0",
        "babel-core": "7.0.0-bridge.0",
        "babel-jest": "^29.1.2",
        "jest": "^29.1.2",
        "jest-environment-jsdom": "^29.1.2",
        "vue-jest": "^3.0.4"
      }
    }
    
    
    ## Modules
    
     // Modules: https://go.nuxtjs.dev/config-modules
  modules: [
    '@nuxtjs/axios',
    '@nuxtjs/auth-next',
    '@vuelidate/core'
    ],
  axios:{
    baseURL: 'http://localhost:8080',
    proxy: true
  },

    
