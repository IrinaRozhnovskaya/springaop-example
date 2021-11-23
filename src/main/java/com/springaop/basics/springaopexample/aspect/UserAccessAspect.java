package com.springaop.basics.springaopexample.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

// AOP
// Aspect = Pointcut + Advice
// Configuration
@Aspect
@Configuration
public class UserAccessAspect {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    // What kind of method calls I would intercept
    // execution(* PACKAGE.*.*(..)) - Pointcut
    // Weaving is a process of implementing AOP around the method & Weaver is a framework which implements it
    @Before("com.springaop.basics.springaopexample.aspect.CommonJoinPointConfig.dataLayerExecution()")
    public void before(JoinPoint joinPoint) { // joinPoint is a specific interception of method call (a specific execution instance)
        // What to do?
        // Advice
        log.info("Check for User Access");
        log.info("Allowed execution for {}", joinPoint);
    }
}
