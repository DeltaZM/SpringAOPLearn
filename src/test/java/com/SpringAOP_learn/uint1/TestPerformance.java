package com.SpringAOP_learn.uint1;

import com.SpringAOP_learn.SpringAopLearnApplication;
import com.SpringAOP_learn.unit1.Performance;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by user on 2016/12/7.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@SpringApplicationConfiguration(SpringAopLearnApplication.class)
public class TestPerformance {

    @Autowired
    private Performance performance;

    @Test
    public void testPerform(){
        performance.perform();
    }
}
