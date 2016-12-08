package com.SpringAOP_learn.unit3;

import com.SpringAOP_learn.unit3.Audience3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by user on 2016/12/7.
 */
@Configuration
@EnableAspectJAutoProxy
public class ConcertConfig3 {
    @Bean
    public Audience3 audience3(){
        return new Audience3();
    }
}
