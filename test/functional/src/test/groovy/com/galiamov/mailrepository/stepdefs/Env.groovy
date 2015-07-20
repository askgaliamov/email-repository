package com.galiamov.mailrepository.stepdefs

import com.galiamov.mailrepository.world.WorldWithDependencies
import com.galiamov.mailrepository.world.mysql.MySQL
import com.galiamov.mailrepository.world.mysql.MySQLAutoBindProvider
import com.google.inject.TypeLiteral
import com.netflix.governator.guice.AutoBindProvider
import com.netflix.governator.guice.BootstrapBinder
import com.netflix.governator.guice.LifecycleInjector

import static cucumber.api.groovy.Hooks.World

World {

    def autoBinder = { BootstrapBinder binder ->
        binder.bind(new TypeLiteral<AutoBindProvider<MySQL>>() {}).toInstance(new MySQLAutoBindProvider())
    }

    def lifecycleInjector = LifecycleInjector.builder()
            .withBootstrapModule(autoBinder)
            .usingBasePackages("com.galiamov")
            .build()

    def injector = lifecycleInjector.createInjector()

    def world = injector.getInstance(WorldWithDependencies)
    world
}