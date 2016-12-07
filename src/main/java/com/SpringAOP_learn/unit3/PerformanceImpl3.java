package com.SpringAOP_learn.unit3;

import org.springframework.stereotype.Component;

/**
 * Created by user on 2016/12/7.
 */
@Component
public class PerformanceImpl3 implements Performance3 {
    public void perform() {
        System.out.println("performance...");
    }
}
