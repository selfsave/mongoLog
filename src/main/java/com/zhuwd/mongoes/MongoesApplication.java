package com.zhuwd.mongoes;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MongoesApplication {

    public static void main(String[] args) {
        SpringApplication.run(MongoesApplication.class, args);
        System.out.println("save SQL log to mongoDB");
    }

}
