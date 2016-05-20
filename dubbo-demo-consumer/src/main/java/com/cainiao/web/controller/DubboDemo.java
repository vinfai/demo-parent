package com.cainiao.web.controller;

import com.cainiao.dubbodemo.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author vinfai
 * @since 2016/5/20
 */
@Controller
public class DubboDemo {

    @Autowired@Qualifier("consumerService")
    private ConsumerService consumerService;

    @RequestMapping("/dubbo/sayhello.xhtml")
    @ResponseBody
    public String sayHello(String name){
        String result = consumerService.sayHelloByDubbo(name);
        return result;
    }


}
