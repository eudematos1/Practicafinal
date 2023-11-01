package com.example.Practica1.repository

import com.example.Practica1.model.Assistant
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AssistantRepository : JpaRepository<Assistant, Long?> {

    fun findById (id: Long?): Assistant?
}
