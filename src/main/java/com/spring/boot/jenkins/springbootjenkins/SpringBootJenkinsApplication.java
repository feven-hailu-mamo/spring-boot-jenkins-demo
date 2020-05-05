package com.spring.boot.jenkins.springbootjenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootJenkinsApplication {

    public static Logger logger = LoggerFactory.getLogger(SpringBootJenkinsApplication.class);

    @GetMapping("/ping")
    public String message() {
        return "Application Deployed successfully!!";
    }

    public void init(){
        logger.info("Application started...");
    }
    public static void main(String[] args) {
        logger.info("Application executed...");
        SpringApplication.run(SpringBootJenkinsApplication.class, args);
    }

}
