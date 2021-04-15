package com.educationportal.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.oauth2.provider.ClientDetails;

import javax.persistence.*;
import java.util.*;

/**
 * Created by toyelami on 30/09/2019
 */

@Entity
@Table(name = "oauth_client_details")
public class OauthClientDetails implements ClientDetails {
    private static final long serialVersionUID = -2287510725041851818L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private Long id;

//    @NotNull
//    @Column(name = "client_name")
//    private String clientName;

    @NotNull
    @Column(name = "CLIENT_ID")
    private String clientId;

    @NotNull
    @Column(name = "CLIENT_SECRET")
    private String clientSecret;

    @NotNull
    @Column(name = "SCOPE")
    private String scope = "profile";

    @NotNull
    @Column(name = "RESOURCE_IDS")
    private String resourceIds;    // comma separated list of accessible resource server ids

    @Column(name = "AUTHORIZED_GRANT_TYPES")
    private String authorizedGrantTypes = "implicit,client_credentials,password";

    @Column(name = "WEB_SERVER_REDIRECT_URI")
    private String webServerRedirectUris;

    @Column(name = "AUTOAPPROVE")
    private String autoApproveScopes;

    @Column(name = "AUTHORITIES")
    private String authorities;

    @Column(name = "ACCESS_TOKEN_VALIDITY")
    private Integer accessTokenValiditySeconds = 86400 * 30;    // 1 month token validity

    @Column(name = "REFRESH_TOKEN_VALIDITY")
    private Integer refreshTokenValiditySeconds;

    @Column(name = "ADDITIONAL_INFORMATION")
    private String additionalInformation;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getClientId() {
        return this.clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    @Override
    public Set<String> getResourceIds() {
        return new HashSet<>(Arrays.asList(this.resourceIds.split(",")));
    }

    public void setResourceIds(String resourceIds) {
        this.resourceIds = resourceIds;
    }

    @Override
    public boolean isSecretRequired() {
        return this.clientSecret != null;
    }

    @Override
    public String getClientSecret() {
        return this.clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    @Override
    public boolean isScoped() {
        return this.scope != null && !this.scope.isEmpty();
    }

    @Override
    public Set<String> getScope() {
        return new HashSet<>(Arrays.asList(this.scope.split(",")));
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    @Override
    public Set<String> getAuthorizedGrantTypes() {
        return new HashSet<>(Arrays.asList(this.authorizedGrantTypes.split(",")));
    }

    public void setAuthorizedGrantTypes(String authorizedGrantTypes) {
        this.authorizedGrantTypes = authorizedGrantTypes;
    }

    @Override
    public Set<String> getRegisteredRedirectUri() {
        return new HashSet<>(Arrays.asList(this.webServerRedirectUris.split(",")));
    }

    @Override
    public Collection<GrantedAuthority> getAuthorities() {
        String[] auths = this.authorities.split(",");
        List<SimpleGrantedAuthority> gAuths = new ArrayList<>();
        for (String authority : auths) {
            gAuths.add(new SimpleGrantedAuthority(authority));
        }
        return new ArrayList<>(gAuths);

    }

    public String getAuthorizedGrantTypesAsString() {
        return this.authorizedGrantTypes;
    }

    public String getResourceIdsAsString() {
        return this.resourceIds;
    }


    public String getAuthoritiesAsString() {
        return this.authorities;
    }

    public void setAuthorities(String authorities) {
        this.authorities = authorities;
    }

    @Override
    public Integer getAccessTokenValiditySeconds() {
        return this.accessTokenValiditySeconds;
    }

    public void setAccessTokenValiditySeconds(Integer accessTokenValiditySeconds) {
        this.accessTokenValiditySeconds = accessTokenValiditySeconds;
    }

    @Override
    public Integer getRefreshTokenValiditySeconds() {
        return this.refreshTokenValiditySeconds;
    }

    public void setRefreshTokenValiditySeconds(Integer refreshTokenValiditySeconds) {
        this.refreshTokenValiditySeconds = refreshTokenValiditySeconds;
    }

    @Override
    public boolean isAutoApprove(String scope) {
        return false;
    }

    @Override
    public Map<String, Object> getAdditionalInformation() {
        return null;
    }

//
//    public String getClientName() {
//        return clientName;
//    }
//
//    public void setClientName(String clientName) {
//        this.clientName = clientName;
//    }


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    public String getWebServerRedirectUris() {
        return webServerRedirectUris;
    }

    public void setWebServerRedirectUris(String webServerRedirectUris) {
        this.webServerRedirectUris = webServerRedirectUris;
    }

    public String getAutoApproveScopes() {
        return autoApproveScopes;
    }

    public void setAutoApproveScopes(String autoApproveScopes) {
        this.autoApproveScopes = autoApproveScopes;
    }

    @Override
    public String toString() {
        return "OauthClientDetails{" +
                "id=" + id +
                ", clientId='" + clientId + '\'' +
                ", clientSecret='" + clientSecret + '\'' +
                ", scope='" + scope + '\'' +
                ", resourceIds='" + resourceIds + '\'' +
                ", authorizedGrantTypes='" + authorizedGrantTypes + '\'' +
                ", webServerRedirectUris='" + webServerRedirectUris + '\'' +
                ", autoApproveScopes='" + autoApproveScopes + '\'' +
                ", authorities='" + authorities + '\'' +
                ", accessTokenValiditySeconds=" + accessTokenValiditySeconds +
                ", refreshTokenValiditySeconds=" + refreshTokenValiditySeconds +
                ", additionalInformation='" + additionalInformation + '\'' +
                '}';
    }

    public String getScopeAsString() {
        return this.scope;
    }
}

