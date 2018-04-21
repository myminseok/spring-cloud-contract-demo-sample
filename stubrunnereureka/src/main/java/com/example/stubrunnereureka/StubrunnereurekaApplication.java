package com.example.stubrunnereureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.contract.stubrunner.server.EnableStubRunnerServer;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableStubRunnerServer
@EnableEurekaClient

public class StubrunnereurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(StubrunnereurekaApplication.class, args);
	}
	@AutoConfigureStubRunner
	static class Config {}
}
