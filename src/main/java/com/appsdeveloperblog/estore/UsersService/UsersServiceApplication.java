package com.appsdeveloperblog.estore.UsersService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.appsdeveloperblog.estore.core.config.XStreamConfig;

@Import({ XStreamConfig.class })
@SpringBootApplication
public class UsersServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsersServiceApplication.class, args);
	}

}
