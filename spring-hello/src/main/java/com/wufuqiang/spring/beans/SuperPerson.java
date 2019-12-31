package com.wufuqiang.spring.beans;

import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @ author wufuqiang
 **/
@Data
@ToString
public class SuperPerson {
    private String name;
    private int age;
    private List<Car> cars;
}
