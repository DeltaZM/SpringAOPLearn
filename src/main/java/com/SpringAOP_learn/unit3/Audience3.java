package com.SpringAOP_learn.unit3;

import com.sun.org.apache.xpath.internal.SourceTree;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * Created by user on 2016/12/7.
 */
@Aspect
public class Audience3 {
    @Pointcut("execution(** com.SpringAOP_learn.unit3.Performance3.perform(..))")
    public void performance(){};

    @Around("performance()")
    public void demandRefound(ProceedingJoinPoint pj){
        try{
            System.out.println("Silencing cell phone");
            System.out.println("Taking seats");
            pj.proceed();
            System.out.println("CLAP,CLAP!!!");
        }catch (Throwable e){
            System.out.println("Demanding a refund");
        }
    }
}
