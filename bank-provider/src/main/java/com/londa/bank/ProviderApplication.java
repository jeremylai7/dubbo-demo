package com.londa.bank;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author
 * @create 2018-11-21 14:50
 **/
@SpringBootApplication
@DubboComponentScan("com.londa.bank.impl")
public class ProviderApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ProviderApplication.class)
                .web(true) // true 表示为web工程。false 为非web工程，一般用于专门提供接口的jar
                .run(args);
    }
}
