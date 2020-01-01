package com.wufuqiang.spring.annotation.repository;

import org.springframework.stereotype.Repository;

/**
 * @ author wufuqiang
 **/
@Repository(value = "userRepository")
public class UserRepositoryImpl implements UserRepository{

    @Override
    public void save() {
        System.out.println("UserRepositoryImpl save...");
    }
}
