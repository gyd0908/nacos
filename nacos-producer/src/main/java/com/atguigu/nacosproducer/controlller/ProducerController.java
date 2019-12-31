package com.atguigu.nacosproducer.controlller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RefreshScope
public class ProducerController {
    @Value("${myName}")
    private String myName;
    @Value("${jdbc.url}")
    private String jdbcUrl;
    @Value("${redis.url}")
    private String redisUrl;
    @Autowired
    private HttpServletRequest request;
    @GetMapping("hello")

    public String hello(){
        System.out.println(request.getRequestURI());
        return  "hello"+myName+"redis.url= "+redisUrl+" jdbc.url= "+jdbcUrl;
    }
}
