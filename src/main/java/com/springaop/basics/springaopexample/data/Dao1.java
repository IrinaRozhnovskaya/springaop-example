package com.springaop.basics.springaopexample.data;

import com.springaop.basics.springaopexample.aspect.TrackTime;
import org.springframework.stereotype.Repository;

@Repository
public class Dao1 {

    @TrackTime
    public String retrieveSomething() {
        return "Dao1";
    }
}
