package com.taha.hospticalBackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication(scanBasePackages={
"com.taha.controller", "com.taha.service","com.taha.model"})
//@ComponentScan(basePackages = {"com.taha.controller"})

public class HospticalBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospticalBackendApplication.class, args);
	}

}


@RestController
class MyController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }
}

