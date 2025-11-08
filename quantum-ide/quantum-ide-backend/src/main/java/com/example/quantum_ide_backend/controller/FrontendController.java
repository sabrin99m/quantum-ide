package com.example.quantum_ide_backend.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FrontendController {

    @RequestMapping(value = "/{path:[^\\.]*}")
    public String redirect() {
        // Tutte le richieste non per file statici (.js, .css, .png, ecc.)
        // vengono reindirizzate all'index.html
        return "forward:/index.html";
    }
}
 
