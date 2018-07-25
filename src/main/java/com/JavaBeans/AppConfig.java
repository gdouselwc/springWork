package com.JavaBeans;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class AppConfig
{
    @Bean
    public MyService myService(){
        return new MyService();
    }
}
