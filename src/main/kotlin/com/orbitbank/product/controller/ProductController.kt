package com.orbitbank.product.controller

import com.orbitbank.product.model.ProductDto
import com.orbitbank.product.service.ProductService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@CrossOrigin
@RestController
class ProductController(private val productService: ProductService) {

    @PostMapping("/registerNewProduct")
    fun registerNewProduct(@RequestBody product: ProductDto): ResponseEntity<*> {
        productService.registerNewProduct(product)
        return ResponseEntity.ok("Product registered successfully")
    }

    @GetMapping("/allProducts")
    fun allProducts(): ResponseEntity<List<*>>? {
        return ResponseEntity.ok(productService.allProducts())
    }

    @GetMapping("/user/products/{userName}")
    fun productsByUserName(@PathVariable userName: String?): ResponseEntity<List<*>>? {
        return ResponseEntity.ok(productService.productByUserName(userName!!))
    }

    @GetMapping("/producturl/{productName}")
    fun productUrlByProduct(@PathVariable productName: String?): ResponseEntity<String?>? {
        return ResponseEntity.ok(productService.productUrlByProduct(productName!!))
    }

}