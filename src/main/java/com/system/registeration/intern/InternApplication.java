package com.system.registeration.intern;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//需要自己配置MyBatis接口的扫描包
@SpringBootApplication
@MapperScan(basePackages = "com.system.registeration.intern.mapper")
public class InternApplication {

    public static void main(String[] args) {
        SpringApplication.run(InternApplication.class, args);
    }

}
