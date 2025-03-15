package com.examen.es.examenMarta.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {
    @GetMapping("/hello")
    public String sayHello(){
        return "Hola desde docker y spring";
    }

    @PutMapping("/put")
    public String putHello(){
        return "Hola desde peticion PUT";
    }

    @PostMapping("/post")
    public String postHello(){
        return "Hola desde peticion POST";
    }
}
