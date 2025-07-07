import { createApp } from 'vue'
import PrimeVue from 'primevue/config'
import router from './router'
import 'primeicons/primeicons.css'
import 'primeflex/primeflex.css'
import App from './App.vue'


const app = createApp(App)

import Theme from './assets/theme.js';

app.use(router);
app.use(PrimeVue, {
    theme: {
        preset: Theme,
        options: {
            prefix: 'p',
            darkModeSelector: 'light',
            cssLayer: false
        }
    }
 });
app.mount('#app');
