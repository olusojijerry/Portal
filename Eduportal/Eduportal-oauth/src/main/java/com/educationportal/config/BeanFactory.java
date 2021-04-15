package com.educationportal.config;

import com.educationportal.domain.OauthClientDetails;
import com.educationportal.repository.OauthClientDetailsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.util.Optional;

@Configuration
public class BeanFactory {
    private final Logger log = LoggerFactory.getLogger(BeanFactory.class);
    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    OauthClientDetailsRepository oauthClientDetailsRepository;

    @Bean("dataSource")
    @ConfigurationProperties("core.service.db")
    @Primary
    public DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        return dataSource;
    }

    @Bean
    public JdbcTemplate coreDataSourceJdbcTemplate(@Qualifier("dataSource")DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }

    @Bean("authDataSource")
    @ConfigurationProperties(prefix = "core.service.db")
    public DataSource coreDataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        return dataSource;
    }

    @Bean(name = "customTokenEnhancer")
    public TokenEnhancer tokenEnhancer(){
        return new CustomTokenEnhancer();
    }
}
