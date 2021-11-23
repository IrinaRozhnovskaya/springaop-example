package com.springaop.basics.springaopexample.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterAopAspect {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @AfterReturning(
            value="com.springaop.basics.springaopexample.aspect.CommonJoinPointConfig.businessLayerExecution()",
            returning="result")
    public void afterReturning(JoinPoint joinPoint, Object result) {
        log.info("{} returned with value {}", joinPoint, result);
    }

//    @AfterThrowing(
//            value="execution(* com.springaop.basics.springaopexample.business.*.*(..))",
//            throwing = "exception")
//    public void afterThrowing(JoinPoint joinPoint, Exception exception) {
//        log.info("{} returned with value {}", joinPoint, exception);
//    }

    @After(value="com.springaop.basics.springaopexample.aspect.CommonJoinPointConfig.businessLayerExecution()")
    public void after(JoinPoint joinPoint) {
        log.info("after execution of {}", joinPoint);
    }

}
