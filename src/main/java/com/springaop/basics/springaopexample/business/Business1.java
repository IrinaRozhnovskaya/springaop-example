package com.springaop.basics.springaopexample.business;

import com.springaop.basics.springaopexample.aspect.TrackTime;
import com.springaop.basics.springaopexample.data.Dao1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business1 {

    @Autowired
    private Dao1 dao1;

    @TrackTime
    public String calculateSomething() {
        //Business logic
        return dao1.retrieveSomething();
    }
}
