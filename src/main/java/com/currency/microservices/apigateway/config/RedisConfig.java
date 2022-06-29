package com.currency.microservices.apigateway.config;

import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.Objects;

@Configuration
public class RedisConfig {

//  private final Environment env;
//
//  public RedisConfig(Environment env) {
//    this.env = env;
//  }
//
//
////  @Bean
////  public JedisConnectionFactory jedisConnectionFactory() {
////    RedisStandaloneConfiguration redisStandaloneConfiguration = new RedisStandaloneConfiguration(
////        Objects.requireNonNull(env.getProperty("spring.redis.host")),
////        Integer.parseInt(Objects.requireNonNull(env.getProperty("spring.redis.port"))));
////    return new JedisConnectionFactory(redisStandaloneConfiguration);
////  }
//
//  @Bean
//  RedisConnectionFactory redisConnectionFactory(RedisProperties props) {
//    RedisStandaloneConfiguration config = new RedisStandaloneConfiguration();
//
//    config.setPassword(props.getPassword());
//
//    return new LettuceConnectionFactory(config);
//  }
//
//  @Bean
//  public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory redisConnectionFactory) {
//    RedisTemplate<String, Object> template = new RedisTemplate<>();
//    template.setConnectionFactory(redisConnectionFactory);
//    template.setEnableTransactionSupport(true);
//    return template;
//  }
}