package io.haru.dummer.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@EnableResourceServer
//@EnableAuthorizationServer
@SpringBootApplication
public class DummerApplication {

    public static void main(String[] args) {
		SpringApplication.run(DummerApplication.class, args);
	}
}
