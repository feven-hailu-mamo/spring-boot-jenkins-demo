package com.spring.boot.jenkins.springbootjenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@SpringBootApplication
@RestController
public class SpringBootJenkinsApplication {

    public static Logger logger = LoggerFactory.getLogger(SpringBootJenkinsApplication.class);

    @GetMapping("/ping")
    public String message() {
        return "Application Deployed successfully!!";
    }

    @PostConstruct
    public void init(){
        logger.info("Application started...");
    }
    public static void main(String[] args) {
        logger.info("Application executed...");
        logger.info("Continuous Integration and Continuous Delivery with jenkins pipeline");
        SpringApplication.run(SpringBootJenkinsApplication.class, args);
    }

}
