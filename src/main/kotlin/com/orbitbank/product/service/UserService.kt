package com.orbitbank.product.service

import com.orbitbank.product.entity.User



interface UserService {
    fun getUserByName(userName:String):User
}