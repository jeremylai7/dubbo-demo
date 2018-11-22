package com.londa.bank.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.londa.bank.api.HelloService;

/**
 * @Author: laizc
 * @Date: Created in 15:53 2018-11-22
 */
@Service(version = "1.0")
public class Hello1ServiceImpl implements HelloService {
    @Override
    public String doSomething() {
        return "you should do anything!!";
    }
}
