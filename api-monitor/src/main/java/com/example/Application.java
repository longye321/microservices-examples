package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.context.annotation.Configuration;
import de.codecentric.boot.admin.config.EnableAdminServer;

/**
 * @author Jonsy
 *
 */
@SpringBootApplication
@EnableHystrixDashboard
@EnableTurbine
@EnableEurekaClient
@EnableAdminServer
@EnableAutoConfiguration
@Configuration
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}