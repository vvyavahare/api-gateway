package com.currency.microservices.apigateway.config;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class Config {
  private String id;
  private String name;

  public String getIDName() {
    String v = null;
    if (v.equals("test")) {
      log.trace("fail test");
    }
    return v;
  }
}
