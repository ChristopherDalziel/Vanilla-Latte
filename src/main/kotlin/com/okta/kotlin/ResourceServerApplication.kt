package com.okta.kotlin

import org.springframework.boot.ApplicationRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class ResourceServerApplication {
	@Bean
	fun run(repository: CoffeeShopRepository) = ApplicationRunner {
		repository.save(CoffeeShopModel(
			name = "Ticos",
			address = "55 Street, Street, Yarraville",
			phone = "041234567",
			priceOfCoffee = 5.00,
			powerAccessible = false,
			internetReliability = 0
		))
		repository.save(CoffeeShopModel(
			name = "McDonalds",
			address = "A place somewhere",
			phone = "42849242094",
			priceOfCoffee = 3.00,
			powerAccessible = true,
			internetReliability = 9
		))
	}
}

fun main(args: Array<String>) {
	runApplication<ResourceServerApplication>(*args)
}
