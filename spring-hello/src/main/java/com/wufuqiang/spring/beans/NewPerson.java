package com.wufuqiang.spring.beans;

import lombok.Data;
import lombok.ToString;

/**
 * @ author wufuqiang
 **/
@Data
@ToString
public class NewPerson {
    private String name;
    private Address address;
    private Car car;
}
