package com.educationportal.config;

import com.educationportal.domain.OauthClientDetails;
import com.educationportal.repository.OauthClientDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.annotation.PostConstruct;
import java.util.Optional;

@Configuration
public class PreloadData {

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    OauthClientDetailsRepository oauthClientDetailsRepository;


    @PostConstruct
    private void setUp(){
        clientSetUp();
    }

    private void clientSetUp(){
//        logger.debug("Setting Up Oauth Client...");
        //add an auth server client
        OauthClientDetails newClientDetails = new OauthClientDetails();


        newClientDetails.setClientId("auth-service");
//        newClientDetails.setClientId("2254ea");
        newClientDetails.setClientSecret(passwordEncoder.encode("password"));
        newClientDetails.setAuthorities("ROLE_CLIENT");
        newClientDetails.setAuthorizedGrantTypes("implicit,client_credentials,authorization_code,password");
//        newClientDetails.setClientName(clientName);
        newClientDetails.setResourceIds("auth-service");
        newClientDetails.setScope("profile");
        newClientDetails.setWebServerRedirectUris("http:://localhost:8888");

        Optional<OauthClientDetails> existingClientOption = oauthClientDetailsRepository.findOneByClientId(newClientDetails.getClientId());

        if(!existingClientOption.isPresent()){
//            logger.debug("Adding Client");
            oauthClientDetailsRepository.save(newClientDetails);
        }else{
//            logger.debug("Client already exist: Updating...");
//            OauthClientDetails existingClientDetails = existingClientOption.get();
//            newClientDetails.setId(existingClientDetails.getId());
//            oauthClientDetailsRepository.save(newClientDetails);
        }

    }
}
