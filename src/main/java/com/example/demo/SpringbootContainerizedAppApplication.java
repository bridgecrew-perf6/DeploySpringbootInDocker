package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author jagrawal
 */
@SpringBootApplication
public class SpringbootContainerizedAppApplication {

    /**
     * @param args
     */
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        SpringApplication.run(SpringbootContainerizedAppApplication.class, args);
    }

}
