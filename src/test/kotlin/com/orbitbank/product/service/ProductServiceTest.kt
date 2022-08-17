package com.orbitbank.product.service

import com.orbitbank.product.entity.Product
import com.orbitbank.product.entity.Role
import com.orbitbank.product.entity.User
import com.orbitbank.product.model.ProductDto
import com.orbitbank.product.repository.ProductDao
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ProductServiceTest {

    val productDao:ProductDao = mockk()
    val userServiceImpl:UserServiceImpl = mockk()
    val user = User("User1","user1@gmail.com","user", setOf(Role("Partner","Partner Role")),"Not Verified")
    val productService = ProductService(productDao,userServiceImpl)

    val testProduct = Product("Product1", "productUrl1",user)
    val testProductDto = ProductDto("Product2","productUrl2","User1")

    /*@Test
    fun registerNewProduct() {

        //given
        every { productDao.save(testProduct) } returns testProduct
        every{userServiceImpl.getUserByName(testProductDto.getUserName())} returns user

        //when
        val result = productService.registerNewProduct(testProductDto)

        //then
        verify(exactly = 1) { productDao.save(testProduct) }
        assertEquals(testProduct,result)
    }*/

    /*@Test
    fun allProducts() {
    }*/

    /*@Test
    fun productByUserName() {
    }*/

    @Test
    fun productUrlByProduct() {

        //given
        every { productDao.findById("Product1").get() } returns testProduct

        //when
        val result = productService.productUrlByProduct("Product1")

        //then
        verify(exactly = 1) { productDao.findById("Product1") }
        assertEquals(testProduct.getProductUrl(),result)
    }
}