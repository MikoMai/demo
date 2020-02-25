package com.miko.jk_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class JkTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(JkTestApplication.class, args);
    }

}
