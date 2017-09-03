<template>
  <div id="app">
    <nav class="navbar navbar-expand-md navbar-inverse fixed-top bg-inverse">
      <router-link to="/" class="navbar-brand">Usaha Timor</router-link>
    </nav>
    <div class="container-fluid">
      <div class="row">
        <nav class="col-sm-3 col-md-2 d-none d-sm-block bg-light sidebar">
          <ul class="nav nav-pills flex-column">
            <li class="nav-item">
              <router-link to="/customer" class="nav-link">Customers</router-link>
            </li>
          </ul>
        </nav>
        <main class="col-sm-9 ml-sm-auto col-md-10 pt-3" role="main">
          <router-view></router-view>
        </main>
      </div>
    </div>
  </div>
</template>

<script>
  export default {
    name: 'app'
  }
</script>

<style lang="scss">
  @import '~bootstrap/scss/bootstrap';
  @import '~font-awesome/css/font-awesome.min.css';
  @import '~bootstrap-vue/dist/bootstrap-vue.css';

  body {
    padding-top: 3.5rem;
  }
  h1 {
    margin-bottom: 20px;
    padding-bottom: 9px;
    border-bottom: 1px solid #eee;
  }

  /*
 * Sidebar
 */

  .sidebar {
    position: fixed;
    top: 51px;
    bottom: 0;
    left: 0;
    z-index: 1000;
    padding: 20px 0px;
    overflow-x: hidden;
    overflow-y: auto; /* Scrollable contents if viewport is shorter than content. */
    border-right: 1px solid #eee;

    .nav {
      margin-bottom: 20px;
    }
    .nav-item {
      width: 100%;
    }
    .nav-item + .nav-item {
      margin-left: 0;
    }
    .nav-link {
      border-radius: 0;
    }
    .router-link-active {
      @extend .nav-link.active;
    }
  }

  /*
   * Dashboard
   */

  /* Placeholders */
  .placeholders {
    padding-bottom: 3rem;
    img {
      padding-top: 1.5rem;
      padding-bottom: 1.5rem;
    }
  }

</style>
