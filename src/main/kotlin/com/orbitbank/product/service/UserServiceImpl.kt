package com.orbitbank.product.service

import com.orbitbank.product.entity.User
import com.orbitbank.product.repository.UserDao
import org.springframework.stereotype.Service

@Service
class UserServiceImpl(private val userDao: UserDao): UserService {
    override fun getUserByName(userName: String): User {
        return userDao.findById(userName).get()
    }

}