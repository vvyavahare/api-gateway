package com.currency.microservices.apigateway;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class ApiGatewayConfiguration {

  @Bean
  public RouteLocator gatewayRouter(RouteLocatorBuilder builder) {
    String v = null;
    if (v.equals("test")) {
      log.trace("fail test");
    }
    log.trace("Routing via gateway router");
    return builder.routes()
        .route(p -> p
            .path("/get")
            .filters(f -> f
                .addRequestHeader("MyHeader", "MyURI")
                .addRequestParameter("Param", "MyValue"))
            .uri("http://httpbin.org:80"))
        .route(p -> p.path("/currency-exchange/**")
            .uri("lb://currency-exchange"))
        .route(p -> p.path("/currency-conversion/**")
            .uri("lb://currency-conversion"))
        .route(p -> p.path("/currency-conversion-feign/**")
            .uri("lb://currency-conversion"))
        .route(p -> p.path("/currency-conversion-new/**")
            .filters(f -> f.rewritePath(
                "/currency-conversion-new/(?<segment>.*)",
                "/currency-conversion-feign/${segment}"))
            .uri("lb://currency-conversion"))
        .build();
  }

}
