package com.zlf.demo.serverb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hi")
    public String Hello(){
        return "Hello world,i am server-b";
    }

    @RequestMapping(value = "/hellol", method= RequestMethod.GET)
    public String hello(@RequestParam String name) {
        return "Hello " + name;
    }
}
