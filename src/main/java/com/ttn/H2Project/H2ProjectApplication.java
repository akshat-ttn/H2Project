package com.ttn.H2Project;

import com.ttn.H2Project.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class H2ProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(H2ProjectApplication.class, args);
		AppConfig config = context.getBean(AppConfig.class);
//
//		System.out.println("Employee Id : " + config.getId());
//		System.out.println("Employee Name : " + config.getName());
//		System.out.println("Employee Designation : " + config.getDesignation());

	}

}
