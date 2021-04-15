package com.educationportal.domain;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Table(name = "users")
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Users implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(
            name = "id"
    )
    private BigInteger id;
    @Column(
            name = "name"
    )
    private String name;
    @Column(
            name = "email"
    )
    private String email;
    @Column(
            name = "password"
    )
    private String password;
    @Column(
            name = "enabled"
    )
    private boolean enabled;
    @Column(
            name = "token_expired"
    )
    private boolean tokenExpired;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "user_role",
            joinColumns = @JoinColumn(
                    name = "user_id", referencedColumnName = "id"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "role_id", referencedColumnName = "id"
            )
    )
    private Collection<Role> roles;
//    @Column(
//            name = "employee_id"
//    )
//    private String employeeId;
    @Column(
            name = "account_expired"
    )
    private boolean acctExpired;
    @Column(
            name = "account_locked"
    )
    private boolean acctLocked;


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Set<GrantedAuthority> authorities = new HashSet<>();

        roles.forEach(role -> {
            authorities.add(new SimpleGrantedAuthority(role.getName()));
            role.getPrivileges().forEach(privilege -> {
                authorities.add(new SimpleGrantedAuthority(privilege.getName()));
            });
        });

        return authorities;
     }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return name;
    }

    @Override
    public boolean isAccountNonExpired() {
        return !acctExpired;
    }

    @Override
    public boolean isAccountNonLocked() {
        return !acctLocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return !tokenExpired;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isTokenExpired() {
        return tokenExpired;
    }

    public void setTokenExpired(boolean tokenExpired) {
        this.tokenExpired = tokenExpired;
    }

    public Collection<Role> getRoles() {
        return roles;
    }

    public void setRoles(Collection<Role> roles) {
        this.roles = roles;
    }

    public boolean isAcctExpired() {
        return acctExpired;
    }

    public void setAcctExpired(boolean acctExpired) {
        this.acctExpired = acctExpired;
    }

    public boolean isAcctLocked() {
        return acctLocked;
    }

    public void setAcctLocked(boolean acctLocked) {
        this.acctLocked = acctLocked;
    }
}
