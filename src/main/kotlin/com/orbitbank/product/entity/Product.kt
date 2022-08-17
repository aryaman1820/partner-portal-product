package com.orbitbank.product.entity


import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne

@Entity
class Product {
    @Id
    private lateinit var productName:String
    private lateinit var productUrl:String

    @ManyToOne
    @JoinColumn(name = "user_name")
    private lateinit var user: User

    constructor()

    constructor(productName: String,productUrl: String, user: User){
        this.productName = productName
        this.productUrl = productUrl
        this.user = user
    }

    fun getProductName():String  = productName

    fun setProductName(productName:String){
        this.productName = productName
    }

    fun getProductUrl():String = productUrl

    fun setProductUrl(productUrl:String){
        this.productUrl = productUrl
    }

    fun getUser():User = user

    fun setUser(user:User){
        this.user = user
    }


}