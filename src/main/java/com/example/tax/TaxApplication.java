package com.example.tax;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class TaxApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaxApplication.class, args);
    }

}
