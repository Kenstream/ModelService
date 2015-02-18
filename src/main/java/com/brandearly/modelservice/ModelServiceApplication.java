package com.brandearly.modelservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by shikhar on 2015-02-17.
 */
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
public class ModelServiceApplication {
    public static void main(String []args){
        SpringApplication.run(ModelServiceApplication.class, args);
    }

}
