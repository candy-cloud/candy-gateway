package com.fintech.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@EnableEurekaClient
@EnableZuulProxy
@SpringBootApplication
@RestController
public class FintechGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(FintechGatewayApplication.class, args);
    }

    @RequestMapping(value = "test/aaa", method = {RequestMethod.POST, RequestMethod.GET })
    public String getDicItem(String code) {

        return "aaaaa";
    }


}
