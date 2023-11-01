package com.example.Practica1.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "conference")
class Conference{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    var title:String?=null
    var description: String? = null   //description_one en la base de datos
    var city: String? = null   //address
    var total_assistants:Long?=null
}