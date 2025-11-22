package com.ejemplo.mvcdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoMvcController {

    @GetMapping("/saludo")
    public String saludo(@RequestParam String nombre) throws InterruptedException {
        Thread.sleep(2000); // bloquea el hilo 2 segundos
        return "Hola " + nombre + ", tu petición se procesó de forma TRADICIONAL (MVC)";
    }
}
