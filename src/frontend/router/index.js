import Vue from 'vue'
import Router from 'vue-router'
import CustomerList from '@/components/CustomerList'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      redirect: '/customer'
    },
    {
      path: '/customer',
      name: 'CustomerList',
      component: CustomerList
    }
  ]
})
