package com.androidgroup.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(EurekaApplication.class, args);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

}
