package com.zlf.demo.servera;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServerAApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerAApplication.class, args);
        System.out.println("feign被调用方服务启动...");
    }

}
