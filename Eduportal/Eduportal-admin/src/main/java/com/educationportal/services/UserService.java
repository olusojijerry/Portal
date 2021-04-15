package com.educationportal.services;

import com.educationportal.domain.Role;
import com.educationportal.repository.services.UsersRepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UsersRepositoryService usersRepositoryService;

    public Role createRoleIfNotFound(String name, String description) {
        Role role1 = new Role();
        Optional<Role> role = usersRepositoryService.findRoleByName(name);
        if (!role.isPresent()) {
            role1.setName(name);
            role1.setDescription(description);
//            role1.setPrivileges(privileges);
            role1 = usersRepositoryService.saveOrUpdate(role1);
        }
        return role1;
    }
}
