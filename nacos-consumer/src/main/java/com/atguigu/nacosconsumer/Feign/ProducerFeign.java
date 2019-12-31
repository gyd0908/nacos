package com.atguigu.nacosconsumer.Feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@FeignClient("service-producer")
public interface ProducerFeign {
    @GetMapping("hello")
    public String hello();
}
