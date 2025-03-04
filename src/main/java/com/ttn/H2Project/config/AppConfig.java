package com.ttn.H2Project.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "employee")
public class AppConfig {
    private int id;
    private String name;
    private String designation;

}
