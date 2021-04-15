package com.educationportal.service;

import com.educationportal.domain.OauthClientDetails;
import com.educationportal.repository.OauthClientDetailsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.provider.ClientAlreadyExistsException;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;


/**
 * Created by toyelami on 04/10/2019
 */
@Service
public class OauthClientDetailsService implements ClientDetailsService,
        ClientRegistrationService {
    Logger logger = LoggerFactory.getLogger(getClass().getName());

    @Autowired
    OauthClientDetailsRepository oauthClientDetailRepository;
    @Autowired
    PasswordEncoder passwordEncoder;


    @Override
    public void addClientDetails(ClientDetails client) {
        try {
            OauthClientDetails clientData = (OauthClientDetails) client;
            Optional<OauthClientDetails> oauthClientDetails = oauthClientDetailRepository.findOneByClientId(client.getClientId());
            if (!oauthClientDetails.isPresent()) {
                throw new ClientAlreadyExistsException("Client already exists");
            }
            clientData.setClientSecret(passwordEncoder.encode(clientData.getClientSecret()));
            oauthClientDetailRepository.save(clientData);
//            updateClient(clientData
        } catch (Exception e) {
            logger.error("error----", e);
        }
    }

    @Override
    public List<ClientDetails> listClientDetails() {

        Iterable<OauthClientDetails> cosmosOAuthClients = null;

        cosmosOAuthClients = oauthClientDetailRepository.findAll();
        List<ClientDetails> details = new ArrayList<>();
        cosmosOAuthClients.forEach((tuple)->{ details.add(tuple); });
        return details;
    }

    @Override
    public void removeClientDetails(String clientId) {
        oauthClientDetailRepository.deleteByClientId(clientId);
    }

    @Override
    public void updateClientDetails(ClientDetails clientDetails) {

        OauthClientDetails oauthClientDetails = (OauthClientDetails) clientDetails;
        OauthClientDetails existingDetails = (OauthClientDetails) loadClientByClientId(oauthClientDetails.getClientId());

        //load id of existing client details so object will be updated
        if (existingDetails != null) {
//            oauthClientDetails.setId(existingDetails.getId());
        } else {
            logger.error("Unable to update existing Client details. Client ID not found");
            return;
        }

        oauthClientDetails.setClientSecret(passwordEncoder.encode(oauthClientDetails.getClientSecret()));

//        bulkUpdate(oauthClientDetails);
        oauthClientDetailRepository.save(oauthClientDetails);

    }

    @Override
    public void updateClientSecret(String clientId, String clientSecret) {
        String hashedSecret = passwordEncoder.encode(clientSecret);
        oauthClientDetailRepository.updateClientSecret(clientId, hashedSecret);

    }

    @Override
    public ClientDetails loadClientByClientId(String clientId) {
        Optional<OauthClientDetails> clientOption = oauthClientDetailRepository.findOneByClientId(clientId);
        return clientOption.isPresent()? clientOption.get() :  null;
    }

}

