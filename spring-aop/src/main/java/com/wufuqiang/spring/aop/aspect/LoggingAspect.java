package com.wufuqiang.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
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

    /**
     * 定义一个方法，用于声明切入点表达式。一般地，该方法中再不需要添入其他的代码
     * 使用@Pointcut来声明切入点表达式。
     */
    @Pointcut("execution(public int com.wufuqiang.spring.aop.helloworld.AtithmeticCalculator.*(..))")
    public void declareJointPointExpression(){}

//    @Before("execution(public int com.wufuqiang.spring.aop.helloworld.AtithmeticCalculatorImpl.add(int,int))")
    @Before("declareJointPointExpression()")
    public void beforeMethod(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("The method "+methodName +" begins with "+args);
    }

//    后置通知：在目标方法执行后（无论是否发生异常），执行的通知
//    在后置通知中还不能访问目标方法执行的结果
    @After("execution(public int com.wufuqiang.spring.aop.helloworld.AtithmeticCalculator.*(int,int))")
    public void afterMethod(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("the method " +methodName+" ends with " +args);
    }

    /**
     * 在方法正常结束后执行的代码
     * 返回通知是可以访问到方法的返回值 的。
     */
    @AfterReturning(value="execution(public int com.wufuqiang.spring.aop.helloworld.AtithmeticCalculator.*(int,int))",
                    returning = "result")
    public void afterReturning(JoinPoint joinPoint,Object result){
        String methodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("the method after returning.result:"+result);
    }

    /**
     * 在目标方法出现异常时会执行的代码。
     * 可以访问到异常对象；且可以指定在出现 特定异常时再执行通知代码
     */
    @AfterThrowing(value="execution(public int com.wufuqiang.spring.aop.helloworld.AtithmeticCalculator.*(int,int))",
            throwing="ex")
    public void afterThrowing(JoinPoint joinPoint,Exception ex){
        String methodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("the method after throwing.Exception:"+ex);
    }

    /**
     * 环绕通知需要携带ProceedingJoinPoint类型的参数
     * 环绕通知类似于动态代理的全过程：ProceedingJoinPoint类型的参数可以决定是否执行目标方法
     * 且环绕通知必须有返回值，返回值即为目标方法的返回值
     * @param pjd
     */
    @Around(value="execution(public int com.wufuqiang.spring.aop.helloworld.AtithmeticCalculator.*(int,int))")
    public Object aroundMethod(ProceedingJoinPoint pjd){
        Object result = null;
        String methodName = pjd.getSignature().getName();
        try {
            //前置通知
            System.out.println("The method " + methodName +" begins with " +Arrays.asList(pjd.getArgs()));
            //执行目标函数
            result = pjd.proceed();
            //返回通知
            System.out.println("The method ends with " + result);
        } catch (Throwable throwable) {
            //异常通知
            System.out.println("The method occurs exception:" + throwable);
            throwable.printStackTrace();
        }
        //后置通知
        System.out.println("the method ends." );
        return result;
    }
}
