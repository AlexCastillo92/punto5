package com.ejemplo.webfluxdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.time.Duration;

@RestController
public class SaludoReactiveController {

    @GetMapping("/saludo")
    public Mono<String> saludo(@RequestParam String nombre) {
        return Mono.just("Hola " + nombre + ", tu petición se procesó de forma REACTIVA")
                .delayElement(Duration.ofSeconds(2));
    }
}
