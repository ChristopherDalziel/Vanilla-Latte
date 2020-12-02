package com.okta.kotlin

import org.springframework.context.annotation.Configuration
import org.springframework.data.rest.core.config.RepositoryRestConfiguration
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer

// Extends the rest config and exposes the idea for the coffee shop model class and updates the base path
@Configuration
open class RestConfig : RepositoryRestConfigurer {
    override fun configureRepositoryRestConfiguration(config: RepositoryRestConfiguration?) {
        config?.exposeIdsFor(CoffeeShopModel::class.java)
        config?.setBasePath("/api")
    }
}