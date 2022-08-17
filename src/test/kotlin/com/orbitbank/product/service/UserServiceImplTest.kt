package com.orbitbank.product.service

import com.orbitbank.product.entity.Role
import com.orbitbank.product.entity.User
import com.orbitbank.product.repository.UserDao
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class UserServiceImplTest {

    val userDao:UserDao = mockk()
    val userServiceImpl = UserServiceImpl(userDao)
    val user = User("User1","user1@gmail.com","user", setOf(Role("Partner","Partner Role")),"Not Verified")

    @Test
    fun getUserByName() {
        //given
        every { userDao.findById("User1").get() } returns user

        //when
        val result = userServiceImpl.getUserByName("User1")

        //then
        verify(exactly = 1) { userDao.findById("User1") }
        assertEquals(user,result)

    }
}