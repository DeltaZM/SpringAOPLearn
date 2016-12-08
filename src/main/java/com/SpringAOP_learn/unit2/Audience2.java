package com.SpringAOP_learn.unit2;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by user on 2016/12/7.
 */
@Aspect
public class Audience2 {
    @Before("execution(** com.SpringAOP_learn.unit1.Performance.perform(..))")
    public void silenceCellPhone(){
        System.out.println("Silencing cell phone");
    }
    @Before("execution(** com.SpringAOP_learn.unit1.Performance.perform(..))")
    public void takeSeats(){
        System.out.println("Taking sets");
    }
    @AfterReturning("execution(** com.SpringAOP_learn.unit1.Performance.perform(..))")
    public void applause(){
        System.out.println("CLAP,CLAP,CLAP!!!");
    }
    @AfterThrowing("execution(** com.SpringAOP_learn.unit1.Performance.perform(..))")
    public void demandRefound(){
        System.out.println("Demanding a refound");
    }
}
