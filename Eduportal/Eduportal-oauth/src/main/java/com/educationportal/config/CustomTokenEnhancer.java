package com.educationportal.config;

import com.educationportal.domain.Users;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class CustomTokenEnhancer extends JwtAccessTokenConverter {
    @Override
    public OAuth2AccessToken enhance(OAuth2AccessToken oAuth2AccessToken, OAuth2Authentication oAuth2Authentication) {

        Users userDetail = (Users) oAuth2Authentication.getPrincipal();

        Map<String, Object> additionalInfo = new HashMap<>(oAuth2AccessToken.getAdditionalInformation());

        additionalInfo.put("organisation", "userDetail.getOrganization()");
        additionalInfo.put("username", userDetail.getUsername());
        additionalInfo.put("email", userDetail.getEmail());
        additionalInfo.put("employeeId", "userDetail.getEmployeeId()");
        additionalInfo.put("isActive", true);
        additionalInfo.put("authorities", userDetail.getAuthorities());

        DefaultOAuth2AccessToken oAuth2AccessToken1 = new DefaultOAuth2AccessToken(oAuth2AccessToken);
        oAuth2AccessToken1.setAdditionalInformation(additionalInfo);

        return super.enhance(oAuth2AccessToken1, oAuth2Authentication);

    }

//    @Override
//    public TokenRequest createTokenRequest(Map<String, String> authorizationRequest, ClientDetails authenticatedClient) {
//        if (authorizationRequest.get("grant_type").equals("refresh_token")) {
//            OAuth2Authentication authentication = tokenStore.readAuthenticationForRefreshToken(
//                    tokenStore.readRefreshToken(authorizationRequest.get("refresh_token")));
//
//            SecurityContextHolder.getContext()
//                    .setAuthentication(new UsernamePasswordAuthenticationToken(authentication.getName(), null,
//                            currentUserDetailsService.loadUserByUsername(authentication.getName()).getAuthorities()));
//        }
//
//        return super.createTokenRequest(authorizationRequest, authenticatedClient);
//    }
}
