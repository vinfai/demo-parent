package com.cainiao.dubbodemo.service;

/**
 * @author vinfai
 * @since 2016/5/20
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        System.out.println("hahah.");
        return String.format("hello,%s",name);
    }
}
