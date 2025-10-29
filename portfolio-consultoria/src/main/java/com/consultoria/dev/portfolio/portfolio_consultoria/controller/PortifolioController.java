package com.consultoria.dev.portfolio.portfolio_consultoria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PortifolioController {
    
    // Rota raiz ("/") para a página inicial
    
    @GetMapping("/")
    public String shoHomePage() {
        return "index";
    }
    
}
