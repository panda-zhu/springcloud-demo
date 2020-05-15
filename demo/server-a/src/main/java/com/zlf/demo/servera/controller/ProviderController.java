package com.zlf.demo.servera.controller;

import com.zlf.demo.servera.vo.PersonVo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {
    @RequestMapping("/hello")
    public String index(@RequestParam String name) {
        System.out.println("index被远程调用了阿阿阿阿阿阿！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！");
        return name+",Hello World";
    }

    @RequestMapping("/person")
    public PersonVo getPerson(@RequestBody PersonVo personVo){
        System.out.println("getPerson被远程调用了阿阿阿阿阿阿！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！");
        personVo.setName("CJ");
        personVo.setAge(0);
        return personVo;
    }
}
