<template>
    <div class="card flex justify-center">
      <div v-if="data">
        <ul>
          <li v-for="(item, index) in data" :key="index">
            {{ item }}
          </li>
        </ul>
      </div>
      <div v-else>
        Chargement...
      </div>
    </div>
  </template>
  
  <script setup>
  import { ref, onMounted } from 'vue';
  import { get } from '@/services/get.js'; // corrige l'import ici
  
  const data = ref(null);
  
  onMounted(async () => {
    try {
      const response = await get('livres');
      data.value = response.data;
    } catch (error) {
      console.error('Erreur de chargement:', error);
    }
  });
  </script>
  