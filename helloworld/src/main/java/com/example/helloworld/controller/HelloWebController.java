package com.example.helloworld.controller;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller

public class HelloWebController {

    @GetMapping("/web")
    public String sayHello() {
        return "hello.html";
    }

    @GetMapping("/web/message")
    public String message(Model model){
        model.addAttribute("hello","This is a custom message");
        return "message";
    }

}
