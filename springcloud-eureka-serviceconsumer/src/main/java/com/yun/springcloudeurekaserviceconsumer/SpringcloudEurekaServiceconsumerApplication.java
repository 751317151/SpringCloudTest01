package com.yun.springcloudeurekaserviceconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.yun"})
@EnableDiscoveryClient //当前使用eureka的server
public class SpringcloudEurekaServiceconsumerApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringcloudEurekaServiceconsumerApplication.class, args);
  }

}
