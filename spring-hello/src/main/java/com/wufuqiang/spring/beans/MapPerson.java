package com.wufuqiang.spring.beans;

import lombok.Data;
import lombok.ToString;

import java.util.Map;

/**
 * @ author wufuqiang
 **/
@Data
@ToString
public class MapPerson {
    private String name;
    private int age;
    private Map<String,Car> mapCars;
}
