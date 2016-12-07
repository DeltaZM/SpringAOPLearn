package com.SpringAOP_learn.unit1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by user on 2016/12/7.
 */
@Configuration
@EnableAspectJAutoProxy
public class ConcertConfig {
    @Bean
    public Audience audience(){
        return new Audience();
    }
}
