<template>
  <div class="app-container" style="padding: 30px;">
    <h1>Hello Element Plus</h1>

    <el-card style="max-width: 400px; margin-top: 20px;">
      <template #header>
        示例卡片
      </template>
      <p>这是基于 Vite + Vue 3 + Element Plus 的 Hello World</p>
      <el-button type="primary" @click="handleClick">
        点击我
      </el-button>
    </el-card>
  </div>
</template>

<script setup>
const handleClick = () => {
  alert('Hello World!')
}
</script>
