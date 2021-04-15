package com.educationportal.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("encrpytion.keystore")
@Getter
@Setter
public class KeyStoreConfig {
    private String alias;
    private String location;
    private String password;
    private String secret;
    private String classpathLocation;

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getClasspathLocation() {
        return classpathLocation;
    }

    public void setClasspathLocation(String classpathLocation) {
        this.classpathLocation = classpathLocation;
    }
}
