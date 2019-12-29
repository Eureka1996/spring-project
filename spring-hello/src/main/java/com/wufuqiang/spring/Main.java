package com.wufuqiang.spring;

import com.wufuqiang.spring.beans.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ author wufuqiang
 **/
public class Main {
    public static void main(String[] args) {

        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorld helloWorld = (HelloWorld)ioc.getBean("helloWorld");

        helloWorld.hello();
//        System.out.println("name:"+helloWorld.hello());
        System.out.println("WuFuqiang");
    }
}
