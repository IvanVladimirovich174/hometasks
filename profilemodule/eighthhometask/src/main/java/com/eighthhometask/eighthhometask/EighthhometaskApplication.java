package com.eighthhometask.eighthhometask;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class EighthhometaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(EighthhometaskApplication.class, args);
        log.info("Swagger-ui run on: http://localhost:8080/swagger-ui.html");
    }
}