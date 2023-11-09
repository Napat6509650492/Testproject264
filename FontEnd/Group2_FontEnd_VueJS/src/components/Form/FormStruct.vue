<script setup>

</script>

<template>
      <div class="main">
         <div class="head-1"><slot name="top"></slot></div>
         <div class="head-2">คณะวิทยาศาสตร์และเทคโนโลยี มหาวิทยาลัยธรรมศาสตร์ ศูนย์รังสิต</div>

         <form>
            <div class="topic">
                  <div>
                     <label for="เรื่อง" >เรื่อง</label>
                     <input type="text" id="เรื่อง" name="เรื่อง">
                  </div>
            </div>
      
            <div > 
                  <div >
                     <label for="เรียน" >เรียน</label>
                     <input type="text" id="เรียน" name="เรียน" >
                  </div>
            </div>
            <p>ข้อมูลลส่วนตัว</p>
            <div class="profile-1 title">
                  <div >
                     <div style="display: inline;">
                           <input type="radio" id="นาย" name="คำนำหน้าชื่อ" value="นาย">
                           <label for="นาย">นาย</label>
                     </div>
                     <div style="display: inline;">
                           <input type="radio" id="นาง" name="คำนำหน้าชื่อ" >
                           <label for="นาง" >นาง</label>
                     </div>
                     <div style="display: inline;">
                           <input type="radio" id="นางสาว" name="คำนำหน้าชื่อ"  value="นางสาว">
                           <label for="นางสาว" >นางสาว</label>
                     </div>
                  </div>
            </div>
            
            <div class="profile-1">
                     <div style="width: auto;">
                        <label for="first_name" >ชื่อ</label>
                        <input type="text" id="first_name" name="first_name" >
                        <label for="last_name">นามสกุล</label>
                        <input type="text" id="last_name" name="last_name" >
                     </div>
                     <div>
                        <label for="เลขทะเบียน" >เลขทะเบียน</label>
                        <input type="text" id="เลขทะเบียน" name="เลขทะเบียน" >
                     </div>
            </div>
      
      
            <div class="profile-1"> 
                  <div>
                     <label for="studentYear" >ชั้นปีที่</label>
                  <select id="studentYear" name="studentYear">
                     <option value="1">1</option>
                     <option value="2">2</option>
                     <option value="3">3</option>
                     <option value="4">4</option>
                     <option value="5">5</option>
                     <option value="6">6</option>
                     <option value="7">7</option>
                     <option value="8">8</option>
                  </select>
                     <label for="สาขาวิชา" >สาขาวิชา</label>
                     <input type="text" id="สาขาวิชา" name="สาขาวิชา" >
                  </div>
                  <div class="profile-1-item">
                        <label for="teacher" >อาจารย์ที่ปรึกษา</label>
                        <input type="text" id="teacher" name="teacher" >
                     </div>
            </div>
            <p >ที่อยู่ที่ติดต่อได้ทางไปรษณีย์</p>
            <div class="address"> 
                  <div>
                     <label for="บ้านเลขที่" >บ้านเลขที่</label>
                     <input type="text" id="บ้านเลขที่" name="บ้านเลขที่" >
                  </div>
      
                  <div>
                     <label for="แขวง" >แขวง/ตำบล</label>
                     <input type="text" id="แขวง" name="แขวง" >
                  </div>

                  <div>
                  <label for="เขต" >เขต/อำเภอ</label>
                     <input type="text" id="เขต" name="เขต" >
                  </div>
            </div>
      
            <div class="address"> 
                  <div>
                     <label for="จังหวัด" >จังหวัด</label>
                     <input type="text" id="จังหวัด" name="จังหวัด" >
                  </div>
                  <div>
                     <label for="postcode" >รหัสไปรษณีย์</label>
                     <input type="text" id="postcode" name="postcode" >
                  </div>
                  <div>
                     <label for="phone_student" >เบอร์โทรศัพท์นักศึกษา</label>
                     <input type="text" id="phone_student" name="phone_student" >
                  </div>
            </div>
   
            <div class="address"> 
                  <div >
                     <label for="phone_parent" >เบอร์โทรศัพท์ผู้ปกครอง</label>
                     <input type="text" id="phone_parent" name="phone_parent" >
                  </div>
                  
            </div>
            <div ></div>
            <slot></slot>
            <div class="reason">
                  <label for="reason" >เหตุผล</label>
                  <textarea id="reason" name="reason"  rows="2" cols="25"></textarea>
            </div>
      
      


            <p>แนบเอกสาร</p>
            <div>
                  <input type="file" id="attachment" name="attachment">
            </div>
            <br>
            <div>
            <input type="submit" value="ยื่นคำร้อง">
            </div>
         </form>
      </div>
</template>

<style scoped>
   .main{
      min-width: 811px;
      max-width: 1200px;
      border: 2px solid black;
      padding: 2rem;

      border-radius: 2rem;
   }

   .head-1{
      text-align: center;
      margin-bottom: 1rem;
      font-size: x-large;
      font-weight: bold;
      
   }
   .head-2{
      text-align: center;
      margin-bottom: 1rem;
      font-size: x-large;
      
   }

   

   input{
      border: 0.5px solid rgb(148, 148, 148);
      border-radius: 5px;
      padding: 0.5rem;
      margin-left: 1rem;
      background-color:  aliceblue;
   }

   .topic{
      margin-bottom: 0.5rem;
   }

   form{
      margin-top: 3rem;
   }
   form > div{
      margin-bottom: 1rem;
   }

   
   .profile-1{
      display: flex;
      flex-wrap: wrap;
      gap: 1rem;
   }
   .profile-1 > div{
      margin: 0px;
      width: 50%;
      margin-left: 1rem;
   }
   
   input[id="เรื่อง"],input[id="เรียน"]{
      min-width: 175px;
      max-width: 450px;
      width: 75%;
   }

   input[type="radio"]{
      margin-right: 0.5rem;
   }
   
   p{
      font-weight: bold;
      font-size: x-large;
      margin-bottom: 1rem;
   }

   .address{
      display: flex;
      flex-wrap: wrap;
   }
   .address > div{
      margin: 0px;
      height: fit-content;
      margin-left: 1rem;
      margin-bottom: 1rem;
   }
   
   .address > div > input{
      float: right;
   }
   
   #studentYear{
      display: inline-block;
      margin-left: 1rem;
      width: 50px;
      border: 0.5px solid rgb(148, 148, 148);
      border-radius: 5px;
      padding: 0.5rem;
      background-color:  aliceblue;
   }
   
   label[for="last_name"]{
      margin-left: 1rem;
   }

   label[for="สาขาวิชา"]{
      margin-left: 1rem;
   }

   .reason{
      display: flex;
      flex-direction:column;
      gap: 1rem;
   }

   .reason > label,textarea{
      margin: 0px;
   }
   
   .reason > textarea
   {
      margin-left: 1rem;
   }

   input[type="submit"]{
      float: right;
   }

   @media (max-width: 760px) {
      .main{
         min-width: 100px;
         max-width:500px
      }
      
      input[type="text"]{
         display: block;
      }
      
      label[for="last_name"]{
         margin-left: 0px;
      }
      
      label[for="สาขาวิชา"]{
         margin-top: 1rem;
         margin-left: 0px;
         display: block;
      }
      .title{ flex-wrap: nowrap;}

      

   .address{
      display: block;
   }

   .address > div{
      display: flex;
      justify-content: left;
      flex-direction: column;
      margin-bottom: 1rem;
   }

   .address > div > label{
      margin: 0px;
   }

   .address > div > input{

      float: left;
   }
   
}
</style>
