package com.educationportal.controller;

import com.educationportal.domain.Salary;
import com.educationportal.domain.response.ResponsePojo;
import com.educationportal.dto.Salarydto;
import com.educationportal.exception.ApiException;
import com.educationportal.repository.services.SalaryRepositoryService;
import com.educationportal.services.SalaryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Optional;

@RestController
@RequestMapping("api/salary")
@Slf4j
public class SalaryApi {
    @Autowired
    SalaryRepositoryService salaryRepositoryService;

    @Autowired
    SalaryService salaryService;

    @PostMapping("")
    public ResponsePojo<Salarydto> createSalaryObject(@RequestBody Salarydto salarydto){
        ResponsePojo<Salarydto> responsePojo = new ResponsePojo<>();

        Salary salary = salaryService.mapperSalary(salarydto);

        salary.setCreatedDt(new Date());
        salary.setCreatedBy("SYSTEM");

        salary = salaryRepositoryService.saveOrUpdate(salary);

        salarydto = salaryService.mapperSalarydto(salary);

        responsePojo.setStatus(200);
        responsePojo.setMessage("Successfully setup Salary Object");
        responsePojo.setData(salarydto);

        return responsePojo;
    }

    @GetMapping("/id/{id}")
    public ResponsePojo<Salarydto> getSalaryById(@PathVariable(name = "id") Long id){
        ResponsePojo<Salarydto> responsePojo = new ResponsePojo<>();

        if(id == null){
            responsePojo.setStatus(400);
            responsePojo.setMessage("Id is to be supplied");

            return responsePojo;
        }
        Optional<Salary> optionalSalary = salaryRepositoryService.findOne(id);

        optionalSalary.orElseThrow(() -> new ApiException("Cannot Retrieve Record with Id: %d"));

        Salary salary = optionalSalary.get();

        Salarydto salarydto = salaryService.mapperSalarydto(salary);

        responsePojo.setMessage("Successfully Retrieved Record");
        responsePojo.setStatus(200);
        responsePojo.setData(salarydto);

        return responsePojo;
    }
}
