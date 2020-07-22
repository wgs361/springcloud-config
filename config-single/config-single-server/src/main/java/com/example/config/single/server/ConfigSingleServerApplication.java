package com.example.config.single.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigSingleServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigSingleServerApplication.class, args);
    }

}
