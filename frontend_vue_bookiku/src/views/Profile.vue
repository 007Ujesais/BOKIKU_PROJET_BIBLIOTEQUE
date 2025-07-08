<template>
  <div class="max-w-2xl mx-auto p-6 bg-white rounded shadow">
    <h1 class="text-3xl font-bold mb-4">Mon Profil</h1>

    <div v-if="adherent">
      <p><strong>Nom :</strong> {{ adherent.nom }}</p>
      <p><strong>Numéro Adhérent :</strong> {{ adherent.numAdherent }}</p>
      <p><strong>Profil :</strong> {{ adherent.profil }}</p>
      <p><strong>Âge :</strong> {{ adherent.age }}</p>
      <p><strong>Livres empruntés :</strong> {{ quotas?.livresEmpruntes ?? 'N/A' }}</p>
      <p><strong>Jours de prêt :</strong> {{ quotas?.joursPret ?? 'N/A' }}</p>
      <p><strong>Nombre de réservations autorisées :</strong> {{ quotas?.reservationLivres ?? 'N/A' }}</p>
      <p><strong>Prolongements autorisés :</strong> {{ quotas?.prolongementPret ?? 'N/A' }}</p>
    </div>
    <div v-else>
      Chargement des informations du profil...
    </div>
  </div>
</template>

<script setup>
import { ref, onMounted } from 'vue'
import axios from 'axios'

const adherent = ref(null)
const quotas = ref(null)

// Tu peux remplacer ce numéro par celui du user actuellement connecté (via auth par ex.)
const numAdherent = 'ETU001'

const fetchProfile = async () => {
  try {
    const response = await axios.get(`http://localhost:8080/api/adherents/${numAdherent}`)
    adherent.value = response.data.adherent
    quotas.value = response.data.quotas
  } catch (error) {
    console.error('Erreur lors du chargement du profil :', error)
  }
}

onMounted(() => {
  fetchProfile()
})
</script>
