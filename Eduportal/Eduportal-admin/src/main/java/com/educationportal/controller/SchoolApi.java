package com.educationportal.controller;

import com.educationportal.config.resources.annotation.SchoolUserDetails;
import com.educationportal.config.resources.domain.SchoolOauthUser;
import com.educationportal.domain.Schools;
import com.educationportal.domain.response.ResponsePojo;
import com.educationportal.dto.SchoolDto;
import com.educationportal.repository.services.SchoolsRepositoryService;
import com.educationportal.services.SchoolService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/salary")
@Slf4j
public class SchoolApi {
    @Autowired
    SchoolsRepositoryService schoolsRepositoryService;
    @Autowired
    SchoolService schoolService;

    public ResponsePojo<Schools> createSchoolObject(@RequestBody SchoolDto schoolDto,
                                                    @SchoolUserDetails SchoolOauthUser schoolOauthUser){
        ResponsePojo<Schools> responsePojo = new ResponsePojo<>();

        return responsePojo;
    }
}
