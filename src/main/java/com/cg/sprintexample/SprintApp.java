package com.cg.sprintexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.cg.sprintexample.customer.ui.CustomerMain;

@SpringBootApplication
public class SprintApp {
    public static void main(String[] args) {
        SpringApplication.run(SprintApp.class, args);
    }
}