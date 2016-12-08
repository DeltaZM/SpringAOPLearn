package com.SpringAOP_learn.unit2;

import org.springframework.stereotype.Component;

/**
 * Created by user on 2016/12/7.
 */
@Component
public class Performance2Impl implements Performance2 {
    public void perform() {
        System.out.println("performance...");
    }
}
