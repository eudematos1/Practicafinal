package com.example.Practica1.service

import com.example.Practica1.model.Conference
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException
import com.example.Practica1.repository.ConferenceRepository

@Service
class ConferenceService {
    @Autowired
    lateinit var conferenceRepository: ConferenceRepository

    fun list ():List<Conference>{
        return conferenceRepository.findAll()
    }

    fun save(conference: Conference): Conference {
        try{
            return conferenceRepository.save(conference)
        }
        catch (ex:Exception){
            throw ResponseStatusException(HttpStatus.NOT_FOUND,ex.message)
        }
    }

}
