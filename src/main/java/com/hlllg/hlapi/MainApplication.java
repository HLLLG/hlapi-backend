package com.hlllg.hlapi;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 主类（项目启动入口）
 *
 */
@SpringBootApplication()
@MapperScan("com.hlllg.hlapi.mapper")
@EnableDubbo
public class MainApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

}
