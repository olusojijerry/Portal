package com.educationportal.repository.services;

import com.educationportal.domain.Teacher;
import com.querydsl.core.types.Predicate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface TeacherRepositoryService {
    Page<Teacher> findAll(Predicate predicate, Pageable pageable);
    Optional<Teacher> findOne(Predicate predicate);
    Optional<Teacher> findById(Long id);
    Teacher saveOrUpdate(Teacher teacher);
}
