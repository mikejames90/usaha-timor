<template>
    <nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
        <a class="navbar-brand" href="#">Usaha Timor</a>
    </nav>
    <div class="container-fluid">
        <div class="row">
            <nav class="col-sm-3 col-md-2 d-none d-sm-block bg-light sidebar">
                <ul class="nav nav-pills flex-column">
                    <li class="nav-item">
                        <router-link to="/customer" class="nav-link">Customer</router-link>
                    </li>
                </ul>
            </nav>
            <main class="col-sm-9 ml-sm-auto col-md-10 pt-3" role="main">
                <router-view class="view"></router-view>
            </main>
        </div>
    </div>
</template>