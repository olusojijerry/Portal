package com.educationportal.repository.serviceImpl;

import com.educationportal.domain.*;
import com.educationportal.repository.PrivilegeRepository;
import com.educationportal.repository.RolesRepository;
import com.educationportal.repository.UsersRepository;
import com.educationportal.repository.services.UsersRepositoryService;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Predicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class UsersRepositoryServiceImpl implements UsersRepositoryService {
    @Autowired
    UsersRepository usersRepository;
    @Autowired
    RolesRepository rolesRepository;
    @Autowired
    PrivilegeRepository privilegeRepository;
    @Override
    public Optional<Role> findRoleByName(String name) {
        QRole qRole = QRole.role;
        BooleanBuilder booleanBuilder = new BooleanBuilder();
        booleanBuilder.and(qRole.name.eq(name));
        return this.rolesRepository.findOne(booleanBuilder);
    }

    @Override
    public Optional<Privilege> findPrivilegeByName(String name) {
        QPrivilege qPrivilege = QPrivilege.privilege;
        BooleanBuilder booleanBuilder = new BooleanBuilder();
        booleanBuilder.and(qPrivilege.name.eq(name));
        return this.privilegeRepository.findOne(booleanBuilder);
    }

    @Override
    public Privilege saveOrUpdate(Privilege privilege) {
        return (Privilege)this.privilegeRepository.save(privilege);
    }

    @Override
    public Role saveOrUpdate(Role role) {
        return (Role)this.rolesRepository.save(role);
    }

    @Override
    public Users saveOrUpdate(Users user) {
        return (Users)this.usersRepository.save(user);
    }

    @Override
    public Optional<Users> findByEmail(String email) {
        QUsers qUsers = QUsers.users;
        BooleanBuilder booleanBuilder = new BooleanBuilder();
        booleanBuilder.and(qUsers.email.eq(email));
        return this.usersRepository.findOne(booleanBuilder);
    }

    @Override
    public Optional<Users> findUserByEmployeeId(String employeeId) {
        return null;
    }

    @Override
    public Optional<Users> findUserById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Users> findOne(Predicate predicate) {
        return this.usersRepository.findOne(predicate);
    }
}
