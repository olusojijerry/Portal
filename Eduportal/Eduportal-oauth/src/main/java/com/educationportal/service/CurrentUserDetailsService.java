package com.educationportal.service;

import com.educationportal.domain.QUsers;
import com.educationportal.domain.Users;
import com.educationportal.repository.services.UsersRepositoryService;
import com.querydsl.core.BooleanBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CurrentUserDetailsService implements UserDetailsService {
//    @Autowired
//    @Qualifier("coreDataSourceJdbcTemplate")
//    JdbcTemplate jdbcTemplate;
    @Autowired
    UsersRepositoryService usersRepositoryService;

    @Override
    public Users loadUserByUsername(String s) throws UsernameNotFoundException {
        QUsers qUsers = QUsers.users;
        BooleanBuilder booleanBuilder = new BooleanBuilder();

        booleanBuilder.and(qUsers.name.eq(s));
        Users users = usersRepositoryService.findOne(booleanBuilder)
                .orElseThrow(()-> new UsernameNotFoundException(String.format("Username Not Found")));

//        CustomUserDetail customUserDetails = new CustomUserDetail();
//
////        customUserDetails.setEmployeeId(users.getEmployeeId());
//        customUserDetails.setUsername(users.getName());
//        customUserDetails.setEmail(users.getEmail());
//        customUserDetails.setOrganization("School Name");

        return users;
    }

//    private static final String updateSql = "UPDATE users "


}
