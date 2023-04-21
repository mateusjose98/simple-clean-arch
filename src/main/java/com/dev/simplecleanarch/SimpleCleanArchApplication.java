package com.dev.simplecleanarch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SimpleCleanArchApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleCleanArchApplication.class, args);
    }

}
