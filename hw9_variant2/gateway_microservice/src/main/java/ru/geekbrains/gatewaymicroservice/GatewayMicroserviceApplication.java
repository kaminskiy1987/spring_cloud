package ru.geekbrains.gatewaymicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class GatewayMicroserviceApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayMicroserviceApplication.class, args);
    }
}