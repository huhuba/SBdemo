package com.example.zsq.sbdemo.starter;

import com.example.zsq.sbdemo.entity.Person;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(name = "enable.autoConfiguration",matchIfMissing = true )
public class MyStarter {
    @Bean
    public Person  person(){
        System.out.println("mystarter  init....");
        return  new Person();
    }
}
