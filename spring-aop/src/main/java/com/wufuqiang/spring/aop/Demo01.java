package com.wufuqiang.spring.aop;

import com.wufuqiang.spring.aop.helloworld.AtithmeticCalculator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.xml.transform.Result;

/**
 * @ author wufuqiang
 **/
public class Demo01 {
    public static void main(String[] args) {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        AtithmeticCalculator calculator = (AtithmeticCalculator) ioc.getBean("atithmeticCalculatorImpl");
        int result = calculator.add(4,5);
        System.out.println(result);
        System.out.println("------------------");
        System.out.println(calculator.div(4,0));
    }
}
