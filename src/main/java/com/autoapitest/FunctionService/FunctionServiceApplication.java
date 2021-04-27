package com.autoapitest.FunctionService;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.autoapitest.FunctionService.mapper")
public class FunctionServiceApplication {

    public static void main(String[] args){ SpringApplication.run(FunctionServiceApplication.class,args) ;}
}
