<template>
  <b-modal id="customerEditorModal"
           ref="customerEditorModal"
           title="Edit Customer"
           size="lg"
           @ok="saveCustomer"
           @shown="reset"
           v-model="show">
    <b-alert variant="danger"
             :show="error">
      An Error has occured!
    </b-alert>

    <template v-if="customer != null">
      <form @submit.stop.prevent="saveCustomer">
        <label>Name</label>
        <b-form-input type="text"
                      placeholder="Enter customer name"
                      v-model="customer.name"></b-form-input>
      </form>
    </template>
    <div slot="modal-footer">
      <b-button variant="primary" @click="saveCustomer">Save</b-button>
    </div>
  </b-modal>
</template>
<script>
  import axios from 'axios';

  export default {
    props: ['customer', 'show'],
    data() {
      return {
          error: false
      };
    },
    methods: {
      reset() {
          this.error = false;
      },
      saveCustomer() {

        axios.post('/customer', this.customer)
          .then(
            response => {
              this.$refs.customerEditorModal.hide();
              this.$emit('saved');
            })
          .catch(
            error => {
              this.error = true;
            }
          );
      }
    }
  }

</script>
