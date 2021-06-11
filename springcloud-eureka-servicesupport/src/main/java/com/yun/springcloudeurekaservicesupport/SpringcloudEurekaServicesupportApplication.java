package com.yun.springcloudeurekaservicesupport;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.yun"})
@EnableDiscoveryClient//代表自己是一个服务提供方
public class SpringcloudEurekaServicesupportApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringcloudEurekaServicesupportApplication.class, args);
  }

}
