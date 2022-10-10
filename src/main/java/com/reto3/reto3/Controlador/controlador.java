package com.reto3.reto3.Controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// Colocamos las anotaciones respectivas
@RestController
@RequestMapping("/Reto3")
public class controlador {

    //Método de ejemplo para enviar un mensaje
    @GetMapping("/mensaje")
    public String mensaje(){
        return " <h1> Enviando mensaje del Reto 3 </h1> ";
    }
}
