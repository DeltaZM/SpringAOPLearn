package com.SpringAOP_learn.unit3;

import com.SpringAOP_learn.unit3.Performance3;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by user on 2016/12/7.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class TestPerformance {

    @Autowired
    private Performance3 performance;

    @Test
    public void testPerform(){
        performance.perform();
    }
}
