package org.emsspring.emsmansys;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.emsspring.emsmansys.Mapper")
public class EmpmansysApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpmansysApplication.class, args);
	}

}
