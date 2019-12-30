package com.wufuqiang.spring;

import com.wufuqiang.spring.beans.Car;
import com.wufuqiang.spring.beans.HelloWorld;
import com.wufuqiang.spring.beans.Person;
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
        Person person1 = (Person) ioc.getBean("person1");
        Person person2 = (Person) ioc.getBean("person2");
        System.out.println(car);
        System.out.println(person1);
        System.out.println(person2);
//        helloWorld.hello();

//        System.out.println("name:"+helloWorld.hello());

    }
}
