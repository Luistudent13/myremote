package com.demo.demo.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class holaController {
    @GetMapping("/")
    public String hola(){
        return "Hola Mundo desde la UCC";

    }
    
}
