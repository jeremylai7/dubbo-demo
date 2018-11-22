package com.londa.bank.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.londa.bank.api.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: laizc
 * @Date: Created in 15:56 2018-11-22
 */
@RestController
public class HelloController {

    @Reference(version = "1.0")
    private HelloService helloService;


    @GetMapping("/hello")
    public String doSomething(){
        return helloService.doSomething();
    }

}
