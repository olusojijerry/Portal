package com.educationportal.config;

import com.educationportal.service.CurrentUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.provider.*;
import org.springframework.security.oauth2.provider.request.DefaultOAuth2RequestFactory;
import org.springframework.security.oauth2.provider.token.TokenStore;

import java.util.Map;

public class CustomOauth2RequestFactory extends DefaultOAuth2RequestFactory {
    @Autowired
    private TokenStore tokenStore;

    @Autowired
    CurrentUserDetailsService currentUserDetailsService;

    public CustomOauth2RequestFactory(ClientDetailsService clientDetailsService) {
        super(clientDetailsService);
    }

    @Override
    public TokenRequest createTokenRequest(Map<String, String> authorizationRequest, ClientDetails authenticatedClient) {
        if(authorizationRequest.get("grant_type").equals("refresh_token")){
            OAuth2Authentication authentication = tokenStore.readAuthenticationForRefreshToken(
                    tokenStore.readRefreshToken(authorizationRequest.get("refresh_token")));

            SecurityContextHolder.getContext()
                    .setAuthentication(new UsernamePasswordAuthenticationToken(authentication.getName(), null,
                          currentUserDetailsService.loadUserByUsername(authentication.getName()).getAuthorities()  ));
        }

        return super.createTokenRequest(authorizationRequest, authenticatedClient);
    }
}
