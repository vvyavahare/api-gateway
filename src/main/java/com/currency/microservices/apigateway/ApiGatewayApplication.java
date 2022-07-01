package com.currency.microservices.apigateway;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class ApiGatewayApplication {

  public static void main(String[] args) {
    log.info("Started application....");
    SpringApplication.run(ApiGatewayApplication.class, args);
  }

}
