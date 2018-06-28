package com.xc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xc.dao")
public class TtApplication {

	public static void main(String[] args) {
		SpringApplication.run(TtApplication.class, args);
	}
}
