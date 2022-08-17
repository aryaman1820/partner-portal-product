package com.orbitbank.product.entity

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Role {

    @Id
    private lateinit var roleName:String
    private lateinit var roleDescription:String

    constructor(roleName: String, roleDescription: String){
        this.roleName = roleName
        this.roleDescription = roleDescription
    }

    fun getRoleName():String = roleName

    fun setRoleName(roleName:String){
        this.roleName = roleName
    }

    fun getRoleDescription():String = roleDescription

    fun setRoleDescription(roleDescription:String){
        this.roleDescription = roleDescription
    }
}