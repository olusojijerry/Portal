package com.educationportal.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class BeanFactory {
    private final Logger log = LoggerFactory.getLogger(BeanFactory.class);

    @Bean
    @ConfigurationProperties("core.service.db")
    @Primary
    public DataSource coreDataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        return dataSource;
    }
}
