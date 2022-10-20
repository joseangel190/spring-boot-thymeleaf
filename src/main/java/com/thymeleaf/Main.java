package com.thymeleaf;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class Main {

    @GetMapping("/")
    public String inico(){
        log.info("Ejecutando Aplicacion");
        return "index";
    }

}
