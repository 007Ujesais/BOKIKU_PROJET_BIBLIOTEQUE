import { createRouter, createWebHistory } from 'vue-router'
import axios from 'axios'

// Exemples de routes
const routes = [
  {
    path: '/',
    name: 'Home',
    component: () => import('../views/Home.vue')
  },
  {
    path: '/connexion',
    name: 'Connexion',
    component: () => import('../views/Connexion.vue')
  }
]

const router = createRouter({
  history: createWebHistory(),
  routes
})

export default router
