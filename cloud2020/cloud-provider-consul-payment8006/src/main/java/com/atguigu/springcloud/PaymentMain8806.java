package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: yxm
 * @Date: 2020/8/6 22:53
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain8806 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8806.class,args);
    }
}
