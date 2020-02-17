package com.wufuqiang.spring.annotation;

import com.wufuqiang.spring.annotation.config.MainConfig;
import com.wufuqiang.spring.annotation.entries.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ author wufuqiang
 **/
public class MainTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ioc = new AnnotationConfigApplicationContext(MainConfig.class);
        Person person = (Person) ioc.getBean("person");
        System.out.println(person);
    }
}
