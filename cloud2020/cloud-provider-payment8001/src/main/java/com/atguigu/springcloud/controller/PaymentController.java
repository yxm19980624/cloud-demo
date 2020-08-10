package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entity.CommonResult;
import com.atguigu.springcloud.entity.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Author: yxm
 * @Date: 2020/8/5 22:33
 */
@RestController
@Slf4j
@EnableDiscoveryClient
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
//    @RequestBody 需要加在payment上面
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("****插入结果 payment8001 ****"+result);
        if (result > 0){
            return new CommonResult(200,"插入数据成功！",result);
        }else{
            return new CommonResult(400,"插入数据失败！",null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("****查询结果 payment8001 ****"+payment);
        if (payment != null) {
            return new CommonResult(200,"查询成功！",payment);
        }else{
            return new CommonResult(400,"查询失败！",null);
        }
    }
}
