package com.example.wmrmaven;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@ComponentScan(basePackages = "com.example.wmrmaven.*")
@MapperScan("com.example.wmrmaven.testmysql.mapper")
public class WmrmavenApplication {

    public static void main(String[] args) {
        SpringApplication.run(WmrmavenApplication.class, args);
    }

}
