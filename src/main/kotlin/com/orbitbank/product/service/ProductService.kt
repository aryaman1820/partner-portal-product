package com.orbitbank.product.service

import com.orbitbank.product.entity.Product
import com.orbitbank.product.entity.User
import com.orbitbank.product.model.ProductDto
import com.orbitbank.product.repository.ProductDao
import org.springframework.beans.BeanUtils
import org.springframework.stereotype.Service


@Service
class ProductService(private val productDao: ProductDao, private val userServiceImpl: UserServiceImpl) {

    fun registerNewProduct(product: ProductDto) {
        val tempProduct = Product()
        BeanUtils.copyProperties(product, tempProduct)
        tempProduct.setUser(userServiceImpl.getUserByName(product.getUserName()))
        productDao.save(tempProduct)
    }

    fun allProducts(): List<Product> {
        return productDao.findAll()
    }

    fun productByUserName(userName: String): List<Product> {
        val user: User = userServiceImpl.getUserByName(userName)
        return productDao.findByUser(user)
    }

    fun productUrlByProduct(productName: String): String {
        val product = productDao.findById(productName).get()
        return product.getProductUrl()
    }
}