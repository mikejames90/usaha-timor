<template>
  <div>
    <h1>Customer List</h1>

    <b-button variant="primary" @click="addCustomer()">
      <i class="fa fa-plus" aria-hidden="true"></i>
    </b-button>

    <table class="table table-stripped">
      <tr>
        <th>#</th>
        <th>Name</th>
        <th></th>
      </tr>
      <tr v-if="loading">
        <td colspan="3">Loading....</td>
      </tr>
      <tr v-else-if="customerListResponse.numberOfElements" v-for="customer in customerListResponse.content">
        <td>{{customer.id}}</td>
        <td>{{customer.name}}</td>
        <td>
          <b-button @click="editCustomer(customer)">
            <i class="fa fa-pencil" aria-hidden="true"></i>
          </b-button>
        </td>
      </tr>
      <tr v-else>
        <td colspan="3">Nothing to show.</td>
      </tr>
    </table>

    <customer-editor :show="customerInEditor != null" :customer="customerInEditor" @saved="fetchData"></customer-editor>

  </div>
</template>
<script>
  import axios from 'axios';
  import CustomerEditor from './CustomerEditorModal.vue';

  export default {
    components: {
        CustomerEditor
    },
    data() {
      return {
        loading: false,
        customerListResponse: null,
        error: null,
        customerInEditor: null
      }
    },
    created() {
      this.fetchData();
    },
    watch: {
      // call again the method if the route changes
      '$route': 'fetchData'
    },
    methods: {
      fetchData () {
        this.error = this.customerListResponse = null;
        this.loading = true;
        axios.get('/customer/list')
          .then(
            response => {
              this.loading = false;
              this.error = null;
              this.customerListResponse = response.data;
            })
          .catch(
            error => {
              this.loading = false;
              this.error = error.message;
              this.customerListResponse = null;
            }
          );
      },
      addCustomer() {
          this.customerInEditor = {
              name: null
          };
      },
      editCustomer(customer) {
          this.customerInEditor = customer;
      }
    }
  }
</script>
