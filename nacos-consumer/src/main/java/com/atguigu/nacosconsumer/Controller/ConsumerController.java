package com.atguigu.nacosconsumer.Controller;

import com.atguigu.nacosconsumer.Feign.ProducerFeign;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;


@RestController
public class ConsumerController {

    @Resource
    private ProducerFeign producerFeign;
    @GetMapping("hi")
    public String hi(){
        return  producerFeign.hello();
    }

}
