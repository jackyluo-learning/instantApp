package com.androidgroup.uac;

import tk.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;



@EnableEurekaClient
@SpringBootApplication(scanBasePackages = "com.androidgroup")
@MapperScan(basePackages = "com.androidgroup.uac.dao")
public class UacApplication {

    public static void main(String[] args) {
        SpringApplication.run(UacApplication.class, args);
    }

}
