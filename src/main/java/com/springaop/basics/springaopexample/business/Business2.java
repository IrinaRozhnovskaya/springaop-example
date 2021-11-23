package com.springaop.basics.springaopexample.business;

import com.springaop.basics.springaopexample.data.Dao2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business2 {

    @Autowired
    private Dao2 dao2;

    public String calculateSomething() {
        //Business logic
        return dao2.retrieveSomething();
    }
}
