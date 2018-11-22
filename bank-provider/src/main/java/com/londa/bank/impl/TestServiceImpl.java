package com.londa.bank.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.londa.bank.api.TestService;

/**
 * @author
 * @create 2018-11-21 14:59
 **/
@Service(version = "1.0",cache = "lru")
public class TestServiceImpl implements TestService {
    @Override
    public String sayHi(String serverName) {
        return "this is provider===>" + serverName;
    }
}
