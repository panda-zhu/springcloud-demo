package com.zlf.demo.feignserver.service;

import com.zlf.demo.feignserver.vo.PersonVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name= "service-a")
public interface HelloRemote {
    @RequestMapping(value = "/hello")
    String hello(@RequestParam(value = "name") String name);

    @RequestMapping(value = "/person")
    PersonVo getPerson(@RequestBody PersonVo personVo);
}
