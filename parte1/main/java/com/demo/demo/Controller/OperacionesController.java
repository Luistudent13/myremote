package com.demo.demo.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calc") // prefijo común para todas las operaciones
public class OperacionesController {

    // GET /calc/suma/5/3  -> 8.0
    @GetMapping("/suma/{a}/{b}")
    public String suma(@PathVariable double a, @PathVariable double b) {
        return a + " + " + b + " = " + (a + b);
    }

    // GET /calc/resta/5/3 -> 2.0
    @GetMapping("/resta/{a}/{b}")
    public String resta(@PathVariable double a, @PathVariable double b) {
        return a + " - " + b + " = " + (a - b);
    }

    // GET /calc/multiplicacion/5/3 -> 15.0
    @GetMapping("/multiplicacion/{a}/{b}")
    public String multiplicacion(@PathVariable double a, @PathVariable double b) {
        return a + " * " + b + " = " + (a * b);
    }

    // GET /calc/division/10/2 -> 5.0
    // Maneja división entre cero con 400 Bad Request
    @GetMapping("/division/{a}/{b}")
    public ResponseEntity<String> division(@PathVariable double a, @PathVariable double b) {
        if (b == 0) {
            return ResponseEntity.badRequest().body("Error: división entre 0 no permitida");
        }
        return ResponseEntity.ok(a + " / " + b + " = " + (a / b));
    }
}
