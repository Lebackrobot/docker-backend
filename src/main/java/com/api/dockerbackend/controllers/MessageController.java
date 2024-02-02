package com.api.dockerbackend.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.dockerbackend.domain.MessageRepository;

@RestController
@RequestMapping("/message")
public class MessageController {
    
    @Autowired
    private MessageRepository repository; 

    @CrossOrigin(origins = "*")
    @GetMapping
    public ResponseEntity getAll() {
        return ResponseEntity.ok(repository.findAll());
    }

    @CrossOrigin(origins = "*")
    @GetMapping("{id}") 
    public ResponseEntity getById(@PathVariable int id) {
        var message = repository.findById(id);

        if (message.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(message.get());
    }
}
