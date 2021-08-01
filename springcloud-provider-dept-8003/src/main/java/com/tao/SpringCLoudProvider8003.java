package com.tao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCLoudProvider8003 {
    public static void main(String[] args) {
        SpringApplication.run(SpringCLoudProvider8003.class,args);
    }
}
