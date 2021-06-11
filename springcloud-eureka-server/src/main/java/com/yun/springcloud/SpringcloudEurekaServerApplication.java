package com.yun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer  //当前使用eureka的server
public class SpringcloudEurekaServerApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringcloudEurekaServerApplication.class, args);
  }

}
