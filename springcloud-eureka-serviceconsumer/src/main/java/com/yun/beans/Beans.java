package com.yun.beans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author huah
 * @since 2021年06月10日
 */

@Configuration
public class Beans {
  //管理简单对象
  @Bean
  @LoadBalanced
  public RestTemplate getRestTemplate(){
    return new RestTemplate();
  }
}
