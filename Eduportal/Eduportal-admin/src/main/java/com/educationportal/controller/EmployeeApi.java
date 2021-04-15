package com.educationportal.controller;

import com.educationportal.config.resources.annotation.SchoolUserDetails;
import com.educationportal.domain.Employee;
import com.educationportal.domain.response.ResponsePojo;
import com.educationportal.dto.EmployeeDto;
import com.educationportal.repository.services.EmployeeRepositoryService;
import com.educationportal.services.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/employees")
@Slf4j
public class EmployeeApi {
    @Autowired
    EmployeeRepositoryService employeeRepositoryService;
    @Autowired
    EmployeeService employeeService;

    @PostMapping("")
    public ResponsePojo<Employee> createEmployee(@RequestBody EmployeeDto employeeDto){
        ResponsePojo<Employee> responsePojo = new ResponsePojo<>();

        //todo employee id to to be auto generated
        Employee employee = employeeService.mapper(employeeDto);

        employee = employeeRepositoryService.saveOrUpdate(employee);

        responsePojo.setData(employee);
        responsePojo.setMessage("Successful");

        return responsePojo;
    }
}
