package com.bortmanco.euricauniversityservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaUniversityServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaUniversityServiceApplication.class, args);
    }

}
