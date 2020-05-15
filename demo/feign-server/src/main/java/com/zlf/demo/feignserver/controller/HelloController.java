package com.zlf.demo.feignserver.controller;

import com.zlf.demo.feignserver.service.HelloRemote;
import com.zlf.demo.feignserver.vo.PersonVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @Autowired
    HelloRemote helloRemote;

    @RequestMapping("/hi")
    public String Hello(){
        return "Hello world,i am server-b";
    }

    @RequestMapping(value = "/hellol", method= RequestMethod.GET)
    public String hello(@RequestParam String name) {
        return "Hello " + name;
    }

    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        System.out.println("接受到请求参数:"+name+",进行转发到其他服务");
        return helloRemote.hello(name);
    }

    @RequestMapping("/person")
    public PersonVo getP(){
        return helloRemote.getPerson(new PersonVo());
    }

}
