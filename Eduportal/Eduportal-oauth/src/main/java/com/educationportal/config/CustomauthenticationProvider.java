package com.educationportal.config;

import com.educationportal.domain.Users;
import com.educationportal.service.CurrentUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;

import java.util.ArrayList;
import java.util.Collection;

public class CustomauthenticationProvider implements AuthenticationProvider {
    @Autowired
    CurrentUserDetailsService currentUserDetailsService;
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String username = authentication.getName();

        Users customUserDetail = currentUserDetailsService.loadUserByUsername(username);

        //TODO create a steup table so you can update users using that setup table

        Collection<GrantedAuthority> authorities = new ArrayList<>();

        //TODO get granted authorities here

        Authentication usernamePasswordAuthentication = new UsernamePasswordAuthenticationToken(username.toUpperCase(),
                null, authorities);

        ((UsernamePasswordAuthenticationToken) usernamePasswordAuthentication).setDetails(customUserDetail);

        return usernamePasswordAuthentication;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return (UsernamePasswordAuthenticationToken.class.isAssignableFrom(aClass));
    }
}
