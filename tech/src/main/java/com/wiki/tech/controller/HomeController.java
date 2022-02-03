package com.wiki.tech.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping(value={"/","main"})
    public String mainPage(){
        return "main";
    }

}
