package org.example.holamundo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundo {
    @GetMapping("/hola")
    public String saludo(){
        return "Hola Mundo!!!Soy María López";
    }
}
