package com.SpringAOP_learn.unit2;

import com.SpringAOP_learn.SpringAopLearnApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by user on 2016/12/7.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootApplication
public class TestPerformance {

    @Autowired
    private Performance2 performance2;

    @Test
    public void testPerform(){
        performance2.perform();
    }
}
