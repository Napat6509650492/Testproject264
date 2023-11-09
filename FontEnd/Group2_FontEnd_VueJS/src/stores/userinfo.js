import { defineStore } from 'pinia'

export const userInfoStore = defineStore('info', {
  state: () => ({
    status:false,
    info:{
      "type": "",
      "username": "",
      "tu_status": "",
      "statusid": "",
      "displayname_th": "นภัส ไถ้บ้านกวย",
      "displayname_en": "",
      "email": "",
      "department": "",
      "faculty": ""
    }
}),
  
  getters: {
    getInfo: (state) => state.info,
    getStatus: (state) => state.status
  },

  actions: {
    set(newInfo) {
      this.info = newInfo;
      this.status = true;
    },
  },
})