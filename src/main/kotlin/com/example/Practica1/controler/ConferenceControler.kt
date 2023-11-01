package com.example.Practica1.controler

import com.example.Practica1.service.ConferenceService
import com.example.Practica1.model.Conference
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/conference")   //endpoint
class ConferenceController {
    @Autowired
    lateinit var conferenceService: ConferenceService

    @GetMapping
    fun list ():List <Conference>{
        return conferenceService.list()
    }
    @PostMapping
    fun save (@RequestBody conference: Conference):ResponseEntity<Conference>{
        return ResponseEntity(conferenceService.save(conference), HttpStatus.OK)
    }

}