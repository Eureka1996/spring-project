package com.wufuqiang.spring.aop.helloworld;

import org.springframework.stereotype.Component;

/**
 * @ author wufuqiang
 **/
@Component
public class AtithmeticCalculatorImpl implements AtithmeticCalculator {
    public int add(int i, int j) {
        System.out.println("add");
        int result = i + j;
        return result;
    }

    public int sub(int i, int j) {
        int result = i - j;
        return result;
    }

    public int mul(int i, int j) {
        int result = i * j;
        return result;
    }

    public int div(int i, int j) {
        int result = i / j;
        return result;
    }
}
