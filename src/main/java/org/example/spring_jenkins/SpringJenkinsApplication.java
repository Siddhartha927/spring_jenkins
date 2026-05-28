package org.example.spring_jenkins;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication {

    public static Logger logger = org.slf4j.LoggerFactory.getLogger(SpringJenkinsApplication.class);

    @PostConstruct
    public void intt(){
        logger.info("Application is running");
    }


    public static void main(String[] args) {
        logger.info("Application is starting");
        SpringApplication.run(SpringJenkinsApplication.class, args);
        System.out.println("Application is running");
    }

}
