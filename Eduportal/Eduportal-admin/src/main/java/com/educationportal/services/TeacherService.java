package com.educationportal.services;

import com.educationportal.domain.QSalary;
import com.educationportal.domain.Salary;
import com.educationportal.domain.Teacher;
import com.educationportal.dto.Teacherdto;
import com.educationportal.exception.ApiException;
import com.educationportal.repository.services.SalaryRepositoryService;
import com.educationportal.repository.services.TeacherRepositoryService;
import com.querydsl.core.BooleanBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TeacherService {
    @Autowired
    TeacherRepositoryService teacherRepositoryService;
    @Autowired
    SalaryRepositoryService salaryRepositoryService;

    public Teacher saveteacher(Teacherdto teacherDto){
        Teacher teacher = new Teacher();

        BooleanBuilder booleanBuilder = new BooleanBuilder();

        QSalary qSalary = QSalary.salary;

        Salary salary = teacherDto.getSalary();

        teacher = mapTeacherToTeacherDto(teacherDto);

        if(salary.getId() == null){
            booleanBuilder.and(qSalary.basic.eq(salary.getBasic()));
            booleanBuilder.and(qSalary.dressing.eq(salary.getDressing()));

            Page<Salary> salaries = salaryRepositoryService.findAll(booleanBuilder, Pageable.unpaged());

            if(salaries.getTotalElements() == 0){
                salary = salaryRepositoryService.saveOrUpdate(salary);
            }else{
                salary = salaries.getContent().get(0);
            }
        }

        teacher.setSalaryId(salary);
        teacher.setName(teacherDto.getFirstName()+"."+teacherDto.getLastName());

        teacherRepositoryService.saveOrUpdate(teacher);
        return teacher;
    }

    public Teacher mapTeacherToTeacherDto(Teacherdto teacherDto){
        Teacher teacher = new Teacher();

        teacher.setDateOfBirth(teacherDto.getDateOfBirth());
        teacher.setMaritalStatus(teacherDto.getMaritalStatus());
        teacher.setName(teacherDto.getName());
        teacher.setResumptionDt(teacherDto.getResumptionDt());
        teacher.setTitle(teacherDto.getTitle());
        teacher.setAddress(teacherDto.getAddress());
        teacher.setAddressNok(teacherDto.getAddressNok());
        teacher.setPhone(teacherDto.getPhone());
        teacher.setPhoneNok(teacherDto.getPhoneNok());
        teacher.setCreated_by(teacherDto.getCreatedBy());
        teacher.setMaritalStatus(teacherDto.getMaritalStatus());

        return teacher;
    }

    public Teacher getTeacherById (Long id){
        Optional<Teacher> teacher = teacherRepositoryService.findById(id);

        teacher.orElseThrow(() -> new ApiException("Cannot Find the Element Requested"));

        return teacher.get();
    }
}
