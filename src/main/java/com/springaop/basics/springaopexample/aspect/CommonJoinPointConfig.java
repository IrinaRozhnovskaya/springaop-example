package com.springaop.basics.springaopexample.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {

    @Pointcut("execution(* com.springaop.basics.springaopexample.data.*.*(..))")
    public void dataLayerExecution() {}

    @Pointcut("execution(* com.springaop.basics.springaopexample.business.*.*(..))")
    public void businessLayerExecution() {}

    @Pointcut("com.springaop.basics.springaopexample.aspect.CommonJoinPointConfig.dataLayerExecution() && com.springaop.basics.springaopexample.aspect.CommonJoinPointConfig.businessLayerExecution()")
    public void allLayerExecution() {}

    @Pointcut("bean(*dao*)")
    public void beanContainingDao() {}

    @Pointcut("within(com.springaop.basics.springaopexample.data..*)")
    public void dataLayerExecutionWithWithin() {}

    @Pointcut("@annotation(com.springaop.basics.springaopexample.aspect.TrackTime)")
    public void trackTimeAnnotation() {}
}
