package com.csxn.cscons;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:consumer.xml")
public class CsConsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CsConsApplication.class, args);
    }

}
