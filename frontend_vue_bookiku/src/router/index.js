import { createRouter, createWebHistory } from 'vue-router'

// Routes
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
  },
  {
    path: '/emprunts',
    name: 'Emprunts',
    component: () => import('../views/Emprunts.vue') // ← ta nouvelle page liste des emprunts
  },
  {
    path: '/profil',
    name: 'Profile',
    component: () => import('../views/Profile.vue') // ← ta nouvelle page profil
  }
]

const router = createRouter({
  history: createWebHistory(),
  routes
})

export default router
