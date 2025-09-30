package com.demo.demo.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class saludoController {

    // URL: http://localhost:8080/hola/Luis
    @GetMapping("/hola/{nombre}")
    public String hola(@PathVariable String nombre) {
        return "Hola, " + nombre + " desde la UCC";
    }
}
