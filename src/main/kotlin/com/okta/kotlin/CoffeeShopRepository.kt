package com.okta.kotlin

import org.springframework.data.repository.CrudRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

// Repository rest resource grants us CRUD ?
@RepositoryRestResource(collectionResourceRel = "coffeeshops", path = "coffeeshops")
interface CoffeeShopRepository : CrudRepository<CoffeeShopModel, Long> {}