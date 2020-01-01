package com.wufuqiang.spring;

import com.wufuqiang.spring.beans.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ author wufuqiang
 **/
public class Demo03_BeanFromFactory {
    public static void main(String[] args) {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("beans-factory.xml");
        Car car = (Car) ioc.getBean("car");
        System.out.println(car);

    }
}
