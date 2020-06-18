package com.zlf.demo.serverc8087.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class RibbonTestController {
    @Resource
    private RestTemplate restTemplate;
    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/ribbon/test")
    public ResponseEntity<String> testRibbon(String name){
        System.out.println("working...."+name);
        return restTemplate.getForEntity("http://service-provider/hi",String.class);
    }
    @GetMapping("/ribbon/server/info")
    public void logUserInstance() {
        ServiceInstance serviceInstance = loadBalancerClient.choose("service-provider");
        //打印当前选择的是哪个节点
        System.out.println(serviceInstance.getServiceId()+serviceInstance.getHost()+serviceInstance.getPort());
    }
}
