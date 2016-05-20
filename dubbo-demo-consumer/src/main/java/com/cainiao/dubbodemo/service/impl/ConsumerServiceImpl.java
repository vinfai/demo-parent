package com.cainiao.dubbodemo.service.impl;

import com.cainiao.dubbodemo.service.ConsumerService;
import com.cainiao.dubbodemo.service.HelloService;

/**
 * helloworld dubbo interface invoke sample
 * @author vinfai
 * @since 2016/5/20
 */
public class ConsumerServiceImpl implements ConsumerService {

    private HelloService helloService;

    public void setHelloService(HelloService helloService) {
        this.helloService = helloService;
    }

    @Override
    public String sayHelloByDubbo(String name) {
        System.out.println("before dubbo service invoke .");
        String result = helloService.sayHello(name);
        System.out.println(result);
        System.out.println("after dubbo service invoke.");
        return result;
    }
}
