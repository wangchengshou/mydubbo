package com.csxn.cscons.config;

import com.csxn.comapi.pnyb.service.IUserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wangchengshou
 * @version 1.0
 * @date 2020/6/15 17:16
 */
public class Consumer {
    public static void main(String[] args) {
        //测试常规服务
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        System.out.println("consumer start");
        IUserService demoService = context.getBean(IUserService.class);
        System.out.println("consumer");
        System.out.println(demoService.queryUserById(007));
    }
}
