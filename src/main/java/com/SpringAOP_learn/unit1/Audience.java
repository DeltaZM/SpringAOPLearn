package com.SpringAOP_learn.unit1;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Bean;

/**
 * Created by user on 2016/12/7.
 */
@Aspect
public class Audience {
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
