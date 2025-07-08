<template>
  <div class="p-6 bg-gray-100 min-h-screen">
    <!-- Navigation -->
    <div class="flex gap-4 mb-6">
      <router-link to="/profil">
        <Button label="Voir le profil" icon="pi pi-user" class="p-button-secondary" />
      </router-link>
      <router-link to="/emprunts">
        <Button label="Voir les emprunts" icon="pi pi-book" class="p-button-secondary" />
      </router-link>
    </div>

    <!-- Liste des livres -->
    <div v-if="livres.length > 0" class="bg-white rounded shadow-md p-4">
      <h2 class="text-lg font-semibold mb-3 text-gray-800">📚 Liste des Livres</h2>
      <ul class="divide-y divide-gray-200">
        <li v-for="(livre, index) in livres" :key="index" class="py-3">
          <div class="font-bold text-gray-900">{{ livre.titre }}</div>
          <div class="text-gray-500 text-sm">{{ livre.auteur }} — {{ livre.exemplaire }}</div>
        </li>
      </ul>
    </div>
    <div v-else class="text-gray-500">Chargement des livres...</div>
  </div>
</template>

<script setup>
import { ref, onMounted } from 'vue'
import axios from 'axios'

const livres = ref([])

const fetchLivres = async () => {
  try {
    const response = await axios.get('/api/livres') // Assure-toi que le backend répond ici
    livres.value = response.data
  } catch (err) {
    console.error('Erreur lors du chargement des livres:', err)
  }
}

onMounted(fetchLivres)
</script>
