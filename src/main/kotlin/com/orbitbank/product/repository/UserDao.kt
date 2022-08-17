package com.orbitbank.product.repository

import com.orbitbank.product.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserDao: JpaRepository<User, String> {
}