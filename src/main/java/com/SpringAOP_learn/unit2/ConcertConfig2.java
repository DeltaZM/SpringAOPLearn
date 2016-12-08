package com.SpringAOP_learn.unit2;

import com.SpringAOP_learn.unit1.Audience;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by user on 2016/12/7.
 */
@Configuration
@ImportResource({"classpath*:SpringApplication.xml"})
public class ConcertConfig2 {}
