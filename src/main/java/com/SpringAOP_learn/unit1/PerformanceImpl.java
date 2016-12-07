package com.SpringAOP_learn.unit1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by user on 2016/12/7.
 */
@Component
public class PerformanceImpl implements Performance{
    public void perform() {
        System.out.println("performance...");
    }
}
