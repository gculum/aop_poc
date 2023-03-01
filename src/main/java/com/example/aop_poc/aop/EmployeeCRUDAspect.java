package com.example.aop_poc.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeCRUDAspect {

    @Before("execution(* com.example.aop_poc.service.EmployeeService.*(..))")     //point-cut expression
    public void logBeforeV1(JoinPoint joinPoint)
    {
        System.out.println("EmployeeCRUDAspect.logBeforeV1() : " + joinPoint.getSignature().getName());
    }


    @After("execution(* com.example.aop_poc.service.EmployeeService.*(..))")     //point-cut expression
    public void logAfterV1(JoinPoint joinPoint)
    {
        System.out.println("EmployeeCRUDAspect.logAfterV1() : " + joinPoint.getSignature().getName());
    }



    @Around("@annotation(com.example.aop_poc.annotations.TrackExecutionTime)")
    public Object executionTime(ProceedingJoinPoint point) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object object = point.proceed();
        long endtime = System.currentTimeMillis();
        System.out.println("Class Name: "+ point.getSignature().getDeclaringTypeName() +". Method Name: "+
                point.getSignature().getName() + ". Time taken for Execution is : " + (endtime-startTime) +"ms");
        return object;
    }




}