package com.example.pfa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@Component("com.example.pfa")
@SpringBootApplication
public class PfaApplication {

    public static void main(String[] args) {

        SpringApplication.run(PfaApplication.class, args);
    }

}
