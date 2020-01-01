package com.wufuqiang.spring.factory;

import com.wufuqiang.spring.beans.Car;
import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.FactoryBean;

/**
 * @ author wufuqiang
 **/
@Data
@ToString
public class CarFactoryBean implements FactoryBean {

    private String brand;

    @Override
    public Car getObject() throws Exception {
        return new Car(this.brand,"degou",50000,320.76);
    }

    @Override
    public Class<?> getObjectType() {
        return Car.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
