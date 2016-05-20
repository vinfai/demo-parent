package com.cainiao.web.controller;

import com.cainiao.dubbodemo.service.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * dubbo 接口测试
 * @author vinfai
 * @since 2016/5/20
 */
public class MainTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring/dubbo.remote.consumer.xml"});
        context.start();

        HelloService helloService = (HelloService)context.getBean("helloService");
        String result = helloService.sayHello("中国");
        System.out.println(result);

        context.destroy();

        System.exit(-1);
    }
}
