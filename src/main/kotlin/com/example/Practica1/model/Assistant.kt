package com.example.Practica1.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "assistant")
class Assistant{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    var full_name:String?=null
    var role_assistan: String? = null   //description_one en la base de datos
    var age: Long? = null   //address
    var conference_id:Long?=null
}