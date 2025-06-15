package com.Steven.tasknest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CategoriasController {

    @GetMapping("/login")
    public String login() {
        return "categoria/login";
    }

    @GetMapping("/registrar")
    public String registrar() {
        return "categoria/registrar";
    }
}
