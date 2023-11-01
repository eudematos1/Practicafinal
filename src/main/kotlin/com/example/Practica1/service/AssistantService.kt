
package com.example.Practica1.service

import com.example.Practica1.model.Assistant
import com.example.Practica1.repository.AssistantRepository
import com.example.Practica1.repository.ConferenceRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service
class AssistantService {
    @Autowired
    lateinit var assistantRepository:AssistantRepository

    @Autowired
    lateinit var conferenceRepository:ConferenceRepository
    fun list ():List<Assistant>{
        return assistantRepository.findAll()
    }

    fun save(assistant: Assistant): Assistant{
        try{
            return assistantRepository.save(assistant)
        }
        catch (ex:Exception){
            throw ResponseStatusException(HttpStatus.NOT_FOUND,ex.message)
        }
    }

}
