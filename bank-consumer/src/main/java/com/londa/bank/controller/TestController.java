package com.londa.bank.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.londa.bank.api.TestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author
 * @create 2018-11-21 16:10
 **/
@RestController
public class TestController {

    @Reference(version = "1.0")
    private TestService testService;


    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test(){
        return testService.sayHi("aaaa");
    }
}
