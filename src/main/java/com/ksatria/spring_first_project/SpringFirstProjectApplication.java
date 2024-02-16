package com.ksatria.spring_first_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringFirstProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringFirstProjectApplication.class, args);
    }

    // this request URI method
    @RequestMapping(value = "/")
    public String hello() {
        return "Hello surya!";
    }

}
