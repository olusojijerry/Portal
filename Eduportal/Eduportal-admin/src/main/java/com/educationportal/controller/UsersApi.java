package com.educationportal.controller;

import com.educationportal.domain.Privilege;
import com.educationportal.domain.QUsers;
import com.educationportal.domain.Role;
import com.educationportal.domain.Users;
import com.educationportal.domain.response.ResponsePojo;
import com.educationportal.dto.AssignRoleToUserDto;
import com.educationportal.dto.EduUserDto;
import com.educationportal.dto.AssignPrivilegeDto;
import com.educationportal.dto.enumeration.UsersProduct;
import com.educationportal.exception.ApiException;
import com.educationportal.repository.services.UsersRepositoryService;
import com.educationportal.services.UserService;
import com.querydsl.core.BooleanBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/users")
@Slf4j
public class UsersApi {

    @Autowired
    UsersRepositoryService usersRepositoryService;
    @Autowired
    UserService userService;

    @Bean
    public PasswordEncoder encoder(){
        return new BCryptPasswordEncoder();
    }

    @PostMapping("")
    public ResponsePojo<Users> createUser(@RequestBody EduUserDto eduUserDto){
        ResponsePojo<Users> responsePojo = new ResponsePojo<>();
//        Privilege readPrivilege
//                = createPrivilegeIfNotFound("READ_PRIVILEGE");
//        Privilege writePrivilege
//                = createPrivilegeIfNotFound("WRITE_PRIVILEGE");
//
//        List<Privilege> adminPrivileges = Arrays.asList(
//                readPrivilege, writePrivilege);
//        createRoleIfNotFound("ROLE_ADMIN", adminPrivileges);
//        createRoleIfNotFound("ROLE_USER", Arrays.asList(readPrivilege));
        Users user = new Users();

        UsersProduct usersProduct = UsersProduct.getEnumFromString(eduUserDto.getRole());

        switch (usersProduct){
            case TEACHER:
                Optional<Role> opRole = usersRepositoryService.findRoleByName(UsersProduct.TEACHER.getValue());
                Role adminRole = opRole.get();
                user.setRoles(Arrays.asList(adminRole));
        }

        user.setName(eduUserDto.getName());
//        user.setTokenExpired(false);
        user.setPassword(encoder().encode(eduUserDto.getPassword()));
        user.setEmail(eduUserDto.getEmail());
        user.setEnabled(true);
        user = usersRepositoryService.saveOrUpdate(user);

        responsePojo.setData(user);
        responsePojo.setMessage(String.format("Successfully Created User %s", eduUserDto.getName()));

        return responsePojo;
    }

    @PostMapping("/priviledge")
    public ResponsePojo<Privilege> createPriviledge(@RequestBody Privilege privilege){
        ResponsePojo<Privilege> responsePojo = new ResponsePojo<>();

        if(ObjectUtils.isEmpty(privilege)){
            throw new ApiException("Please fill in the required details");
        }

        Optional<Privilege> opPrivilege = usersRepositoryService.findPrivilegeByName(privilege.getName());

        if(opPrivilege.isPresent()){
            throw new ApiException("Privilege Created Already");
        }

        privilege = usersRepositoryService.saveOrUpdate(privilege);

        responsePojo.setData(privilege);
        responsePojo.setMessage("Successfully Created Privilege");

        return responsePojo;
    }

    @PostMapping("/role")
    public ResponsePojo<Role> createRole(@RequestBody Role role){
        ResponsePojo<Role> responsePojo = new ResponsePojo<>();

        if(ObjectUtils.isEmpty(role)){
            throw new ApiException("Input the neccessary fields");
        }

        Optional<Role> optionalRole = usersRepositoryService.findRoleByName(role.getName());

        if(optionalRole.isPresent()){
            throw new ApiException("Role Has Been Created Already");
        }

        role = usersRepositoryService.saveOrUpdate(role);

        responsePojo.setData(role);
        responsePojo.setMessage("Successfully Created Role");

        return responsePojo;
    }

    @PostMapping("privilege/assign")
    public ResponsePojo<Role> assignPrivilegeToRole(@RequestBody AssignPrivilegeDto assignPrivilegeDto){
        ResponsePojo<Role> responsePojo = new ResponsePojo<>();
        //get the role described
        Role role = usersRepositoryService.findRoleByName(assignPrivilegeDto.getRoleName())
                .orElseThrow(()-> new ApiException("Role Does Not Exist"));

        //update role record with the privilege given
        Privilege privilege = usersRepositoryService.findPrivilegeByName(assignPrivilegeDto.getPrivilegeName())
                .orElseThrow(()-> new ApiException(String.format("Cannot find privilege with Name: %s", assignPrivilegeDto.getPrivilegeName())));

        List<Privilege> privileges = Arrays.asList(privilege);

        role.setPrivileges(privileges);

        role = usersRepositoryService.saveOrUpdate(role);

        responsePojo.setData(role);
        responsePojo.setMessage("Successful");

        return responsePojo;
    }

    @PostMapping("role/assign")
    public ResponsePojo<Users> assignRoleToUser(@RequestBody AssignRoleToUserDto assignRoleToUserDto){
        ResponsePojo<Users> responsePojo = new ResponsePojo<>();

        QUsers qUsers = QUsers.users;

        if(ObjectUtils.isEmpty(assignRoleToUserDto)){
            throw new ApiException("Select the Employee to Assign Role To: ");
        }

        if(ObjectUtils.isEmpty(assignRoleToUserDto.getEmployeeId())){
            throw new ApiException("Select the Employee");
        }

        BooleanBuilder booleanBuilder = new BooleanBuilder();
//        booleanBuilder.and(qUsers.employeeId.eq(assignRoleToUserDto.getEmployeeId()));

        //get the user
        Users user = usersRepositoryService.findOne(booleanBuilder)
                .orElseThrow(()->new ApiException("Cannot Find the Users Details"));
        Role role = usersRepositoryService.findRoleByName(assignRoleToUserDto.getRoleName())
                .orElseThrow(()-> new ApiException("Role Does Not Exist"));
        user.setRoles(Arrays.asList(role));

        user = usersRepositoryService.saveOrUpdate(user);

        responsePojo.setData(user);
        responsePojo.setMessage(String.format("Successfully Added Role %s", assignRoleToUserDto.getRoleName()));

        return responsePojo;
    }
}
