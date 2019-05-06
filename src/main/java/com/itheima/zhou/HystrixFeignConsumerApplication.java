package com.itheima.zhou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author Admin
 */
@EnableHystrix
@EnableFeignClients
@EnableHystrixDashboard
@EnableDiscoveryClient
@SpringBootApplication
public class HystrixFeignConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(HystrixFeignConsumerApplication.class, args);
    }
}
