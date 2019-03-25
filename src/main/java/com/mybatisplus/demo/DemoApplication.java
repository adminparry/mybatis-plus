package com.mybatisplus.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@MapperScan("com.mybatisplus.demo.mapper")
@RestController
public class DemoApplication {


    @GetMapping("/")
    public String hello(){
        return "hello mybatisPlus";
    }


    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
