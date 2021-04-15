package com.educationportal.repository.serviceImpl;

import com.educationportal.domain.Salary;
import com.educationportal.domain.Teacher;
import com.educationportal.repository.SalaryRepository;
import com.educationportal.repository.TeacherRepository;
import com.educationportal.repository.services.SalaryRepositoryService;
import com.educationportal.repository.services.TeacherRepositoryService;
import com.querydsl.core.types.Predicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class TeacherRepositoryServiceImpl implements TeacherRepositoryService {
    @Autowired
    TeacherRepository teacherRepository;

    @Override
    public Page<Teacher> findAll(Predicate predicate, Pageable pageable) {
        return this.teacherRepository.findAll(predicate, pageable);
    }

    @Override
    public Optional<Teacher> findOne(Predicate predicate) {
        return this.teacherRepository.findOne(predicate);
    }

    @Override
    public Optional<Teacher> findById(Long id) {
        return this.teacherRepository.findById(id);
    }

    @Override
    public Teacher saveOrUpdate(Teacher teacher) {
        return (Teacher)this.teacherRepository.save(teacher);
    }
}
