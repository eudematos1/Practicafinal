package com.example.Practica1.assistant


import com.example.Practica1.model.Assistant
import com.example.Practica1.service.AssistantService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/assistant")   //endpoint
class AssistantControler {
    @Autowired
    lateinit var assistantService: AssistantService

    @GetMapping
    fun list ():List <Assistant>{
        return assistantService.list()
    }
    @PostMapping
    fun save (@RequestBody assistant: Assistant):ResponseEntity<Assistant>{
        return ResponseEntity(assistantService.save(assistant), HttpStatus.OK)
    }

}