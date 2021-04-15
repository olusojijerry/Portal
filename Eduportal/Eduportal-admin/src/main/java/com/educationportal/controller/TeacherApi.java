package com.educationportal.controller;

import com.educationportal.domain.Teacher;
import com.educationportal.domain.response.ResponsePojo;
import com.educationportal.dto.Teacherdto;
import com.educationportal.exception.ApiException;
import com.educationportal.services.TeacherService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/teachers")
@Slf4j
public class TeacherApi {
    @Autowired
    TeacherService teacherService;

    @PostMapping("")
    public ResponsePojo<Teacher> createTeacherObject(@RequestBody Teacherdto teacher) throws Exception {
        ResponsePojo<Teacher> responsePojo = new ResponsePojo<>();

        if(ObjectUtils.isEmpty(teacher)){
            throw new ApiException("Cannot Create Entity Invalid Data Supplied");
        }

        if(ObjectUtils.isEmpty(teacher.getSalary())){
            throw new ApiException("Cannot Create A Teacher Without Salary Scheme");
        }

        Teacher teacherRes = teacherService.saveteacher(teacher);

        responsePojo.setData(teacherRes);
        responsePojo.setStatus(201);
        responsePojo.setMessage(String.format("Successfully created Record For: %s. %s %s", teacherRes.getTitle(), teacherRes.getName()));

        return responsePojo;
    }

    @GetMapping("id/{id}")
    public ResponsePojo<Teacher> getTeacherObject(@PathVariable(name = "id") Long id){
        ResponsePojo<Teacher> responsePojo = new ResponsePojo<>();

        if(id == null){
            throw new ApiException("Id cannot be Null");
        }

        Teacher teacher = teacherService.getTeacherById(id);

        responsePojo.setMessage("Successfully Retrieved Data");
        responsePojo.setStatus(200);
        responsePojo.setData(teacher);

        return responsePojo;
    }
}
