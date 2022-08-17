package com.orbitbank.product.model

class ProductDto {

    private var productName:String
    private var productUrl:String
    private var userName:String

    constructor(productName: String,productUrl: String,userName: String){
        this.productName = productName
        this.productUrl = productUrl
        this.userName = userName
    }

    fun getProductName():String = productName

    fun setProductName(productName:String){
        this.productName = productName
    }

    fun getProductUrl():String = productUrl

    fun setProductUrl(productUrl:String){
        this.productUrl = productUrl
    }

    fun getUserName():String = userName

    fun setUserName(userName:String){
        this.userName = userName
    }
}