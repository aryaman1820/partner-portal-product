package com.orbitbank.product.repository

import com.orbitbank.product.entity.Product
import com.orbitbank.product.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ProductDao:JpaRepository<Product, String> {

    fun findByUser(user:User):List<Product>
}