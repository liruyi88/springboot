package com.lagou.bootmybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lagou.bootmybatis.mapper")  //mapper映射扫描
public class BootmybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootmybatisApplication.class, args);
    }

}
