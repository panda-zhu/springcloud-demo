package com.zlf.demo.servera.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hi")
    public String Hello(){
        return "Hello world,i am server-a";
    }
}
