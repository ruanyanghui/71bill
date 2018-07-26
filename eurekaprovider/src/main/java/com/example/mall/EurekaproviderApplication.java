package com.example.mall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient  //表示发现服务和向注册中心进行服务注册
public class EurekaproviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaproviderApplication.class, args);
	}
}
