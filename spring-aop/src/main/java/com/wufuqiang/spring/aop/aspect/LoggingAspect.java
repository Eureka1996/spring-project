package com.wufuqiang.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @ author wufuqiang
 * 把这个类声明为一个切面：需要把该类放入于是IOC容器中，再声明为一个切面
 **/
@Aspect
@Component
public class LoggingAspect {
//    @Before("execution(public int com.wufuqiang.spring.aop.helloworld.AtithmeticCalculatorImpl.add(int,int))")
    @Before("execution(public int com.wufuqiang.spring.aop.helloworld.AtithmeticCalculatorImpl.*(int,int))")
    public void beforeMethod(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("The method "+methodName +" begins with "+args);
    }
}
