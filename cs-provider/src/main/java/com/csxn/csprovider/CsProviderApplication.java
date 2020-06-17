package com.csxn.csprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations = {"classpath:provider.xml"})
public class CsProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(CsProviderApplication.class, args);
    }

}
