package com.educationportal.repository.services;

import com.educationportal.domain.Privilege;
import com.educationportal.domain.Role;
import com.educationportal.domain.Users;
import com.querydsl.core.types.Predicate;

import java.util.Optional;

public interface UsersRepositoryService {
    Optional<Role> findRoleByName(String name);
    Optional<Privilege> findPrivilegeByName(String name);
    Privilege saveOrUpdate(Privilege privilege);
    Role saveOrUpdate(Role role);
    Users saveOrUpdate(Users user);
    Optional<Users> findByEmail(String email);
    Optional<Users> findUserByEmployeeId(String employeeId);
    Optional<Users> findUserById(Long id);
    Optional<Users> findOne(Predicate predicate);
}
