<script setup>
import FormStruct from './FormStruct.vue'
</script>

<template>
   <FormStruct>
      <template v-slot:top>
            คำร้อง เพิ่ม/ถอน
         </template>
      <p >ประสงค์ขอ</p>
               <div>
                     <div>
                        <div>
                                 <input type="radio" id="exit" name="prasongkor"  value="exit">
                                 <label for="exit" >ขอลาออก</label>
                        </div>
                        <div>
                                 <input type="radio" id="mfs" name="prasongkor"  value="mfs">
                                 <label for="mfs" >ขอผ่อนพันค่าจดทะเบียนเรียน</label>
                        </div>
                        <div>
                                 <input type="radio" id="etc" name="prasongkor"  value="etc">
                                 <label for="etc" >อื่นๆ โปรดระบุ</label>
                        </div>
                     </div>
               </div>
   </FormStruct>
</template>

<style scoped>

   p{
      font-weight: bold;
      font-size: x-large;
      margin-bottom: 1rem;
   }

   input[type="radio"]{
      margin-right: 1rem;
   }
</style>
