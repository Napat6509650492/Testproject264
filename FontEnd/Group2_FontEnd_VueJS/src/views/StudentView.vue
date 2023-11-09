<script setup>
import { ref } from 'vue';
import MenuButton from '../components/MenuButton.vue';
import Form_1 from '../components/Form/Form_1.vue';
import Form_2 from '../components/Form/Form_2.vue';
import RequestList from '../components/List/RequestList.vue'
import Profile from '../components/Profile.vue'

import StructWebComponent from '../components/StructWebComponent.vue'

const btnselect = ref(-1);
const test = ref([{
  a: "10:28 AM",
  b: "10/20/3030",
  c: "ยื่นคำร้องสำเร็จ",
  d: "รายละเอียด"
}, {
  a: "10:28 AM",
  b: "10/20/3030",
  c: "ยื่นคำร้องสำเร็จ",
  d: "รายละเอียด"
}, {
  a: "10:28 AM",
  b: "10/20/3030",
  c: "ยื่นคำร้องสำเร็จ",
  d: "รายละเอียด"
}, {
  a: "10:28 AM",
  b: "10/20/3030",
  c: "ยื่นคำร้องสำเร็จ",
  d: "รายละเอียด"
}]);


const changeState = (x) =>{
  btnselect.value = x;
}

</script>

<template>
    <StructWebComponent>
        <template v-slot:btn-list>
          <MenuButton @click="changeState(0)" :class="{active: btnselect == 0 }"  name="หน้าหลัก"/>
          <MenuButton @click="changeState(1)" :class="{ active: btnselect == 1}" name="โปรไฟล์"/>
          <MenuButton @click="changeState(3)" :class="{ active: btnselect == 2}" name="ยื่นคำร้อง"/>
          <div v-if="btnselect == 2 || btnselect == 3 || btnselect == 4" class="b">
            <MenuButton class="form" @click="changeState(3)" :class="{ active: btnselect == 3 }" name="คำร้องทั่วไป"/>
            <MenuButton class="form" @click="changeState(4)" :class="{ active: btnselect == 4 }" name="เพิ่ม/ถอน"/>
          </div>
          <MenuButton @click="changeState(5)" :class="{ active: btnselect == 5}" name="ตรวจสอบคำร้อง"/>
          <MenuButton @click="changeState(6)" :class="{ active: btnselect == 6}" name="ประวัติยื่นคำร้อง"/>
        </template>
        <template v-slot:body>
          <div>
            <div v-if="btnselect == 0"> main page 1234</div>
            <Profile v-if="btnselect == 1"> profile</Profile>
            <div v-if="btnselect == 2"> 123</div>
            <Form_1 v-if="btnselect == 3"></Form_1>
            <Form_2 v-if="btnselect == 4"></Form_2>
            <RequestList v-if="btnselect == 5"></RequestList>
            <RequestList v-if="btnselect == 6"> ประวัติ</RequestList>
          </div>
        </template>
    </StructWebComponent>
</template>

<style scoped>
.form{
  float: right;
  width: 70%;
  padding: 5px;
}

.active{
    background-image: radial-gradient(circle, #fff 0%, #fff 10%, #4e4e4e 175%);
    background-color: rgb(132, 132, 132) !important; 
   }

.active::after{
  content:' ◄ '
}
</style>