
import { defineConfig } from 'vite'
import vue from '@vitejs/plugin-vue'
import path from 'path' // 👈 à ajouter
import Components from 'unplugin-vue-components/vite';
import {PrimeVueResolver} from '@primevue/auto-import-resolver';

// https://vitejs.dev/config/
export default defineConfig({
  plugins: [
    vue(),
    Components({
      resolvers: [
        PrimeVueResolver()
      ]
    })
  ],
  resolve: {
    alias: {
      '@': path.resolve(__dirname, 'src') // 👈 ceci ajoute l'alias "@"
    }
  },
   server: {
    proxy: {
      '/api': {
        target: 'http://localhost:8080', // port du backend Spring Boot
        changeOrigin: true,
        secure: false,
      },
    },
  },
})
