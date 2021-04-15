package com.educationportal.config.resources.config;

import com.educationportal.config.resources.annotation.SchoolUserDetails;
import com.educationportal.config.resources.domain.SchoolOauthUser;
import org.springframework.core.MethodParameter;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import java.util.Map;

public class SchoolUserDetailResolver implements HandlerMethodArgumentResolver {
    @Override
    public boolean supportsParameter(MethodParameter methodParameter) {
        return methodParameter.getParameterAnnotation(SchoolUserDetails.class) != null;
    }

    private SchoolOauthUser extractSchoolOauthUser(Jwt jwt){
        Map<String, Object> jwtClaims = jwt.getClaims();

        /*todo create a constant class that includes the details needed to be returned in the
        *  to accept all the details to be gotten from the token*/
        String username = (String) jwtClaims.get("username");

        SchoolOauthUser schoolOauthUser = new SchoolOauthUser();

        /*todo set the various values for the OAuth users and return that the values*/
        return schoolOauthUser;
    }

    @Override
    public Object resolveArgument(MethodParameter methodParameter, ModelAndViewContainer modelAndViewContainer, NativeWebRequest nativeWebRequest, WebDataBinderFactory webDataBinderFactory) throws Exception {
        SecurityContext securityContext = SecurityContextHolder.getContext();
        JwtAuthenticationToken jwtAuthenticationToken = (JwtAuthenticationToken) securityContext.getAuthentication();

        Jwt jwt = jwtAuthenticationToken.getToken();
        return extractSchoolOauthUser(jwt);
    }
}
