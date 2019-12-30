package com.wufuqiang.spring;

import com.wufuqiang.spring.beans.Car;
import com.wufuqiang.spring.beans.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ author wufuqiang
 **/
public class Main {
    public static void main(String[] args) {

        //1.创建Spring的IOC容器对象
        //ApplicationContext代表IOC容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");

        //2.从IOC容器中获取Bean实例
        HelloWorld helloWorld = (HelloWorld)ioc.getBean("helloWorld");
        Car car = (Car)ioc.getBean("car");

        helloWorld.hello();

//        System.out.println("name:"+helloWorld.hello());
        System.out.println(car);
    }
}
