package com.tracker.studylog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Main application class for StudyLog Microservice.
 * 
 * Includes @EnableFeignClients to allow declarative REST calls 
 * to student-service for student verification.
 */
@SpringBootApplication
@EnableFeignClients
public class StudyLogServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudyLogServiceApplication.class, args);
    }
}
