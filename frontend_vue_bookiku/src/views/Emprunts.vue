<template>
  <div class="container mx-auto p-4">
    <h1 class="text-2xl font-bold mb-4">Mes Emprunts</h1>

    <div v-if="emprunts.length > 0">
      <table class="min-w-full border border-gray-300">
        <thead>
          <tr class="bg-gray-200">
            <th class="border p-2">Adhérent</th>
            <th class="border p-2">Livre</th>
            <th class="border p-2">Date d'emprunt</th>
            <th class="border p-2">Date de retour prévue</th>
            <th class="border p-2">Date de retour réelle</th>
            <th class="border p-2">Prolongations</th>
            <th class="border p-2">Statut</th>
          </tr>
        </thead>
        <tbody>
          <tr v-for="emprunt in emprunts" :key="emprunt.id">
            <td class="border p-2">{{ emprunt.adherent.nom }}</td>
            <td class="border p-2">{{ emprunt.livre.titre }}</td>
            <td class="border p-2">{{ formatDate(emprunt.dateEmprunt) }}</td>
            <td class="border p-2">{{ formatDate(emprunt.dateRetourPrevue) }}</td>
            <td class="border p-2">{{ emprunt.dateRetourReelle ? formatDate(emprunt.dateRetourReelle) : 'Non retourné' }}</td>
            <td class="border p-2">{{ emprunt.prolongations }}</td>
            <td class="border p-2">{{ emprunt.status.toUpperCase() }}</td>
          </tr>
        </tbody>
      </table>
    </div>
    <div v-else>
      <p>Aucun emprunt trouvé.</p>
    </div>
  </div>
</template>

<script setup>
import { ref, onMounted } from 'vue'
import axios from 'axios'

const emprunts = ref([])

const fetchEmprunts = async () => {
  try {
    const response = await axios.get('http://localhost:8080/api/emprunts')
    emprunts.value = response.data
  } catch (error) {
    console.error('Erreur lors du chargement des emprunts:', error)
  }
}

const formatDate = (dateStr) => {
  if (!dateStr) return ''
  const date = new Date(dateStr)
  return date.toLocaleDateString()
}

onMounted(() => {
  fetchEmprunts()
})
</script>

<style scoped>
table {
  border-collapse: collapse;
  width: 100%;
}
th, td {
  border: 1px solid #ccc;
}
th {
  background-color: #f3f4f6;
}
</style>
