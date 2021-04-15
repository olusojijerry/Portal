package com.educationportal.repository.services;

import com.educationportal.domain.Employee;
import com.querydsl.core.types.Predicate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface EmployeeRepositoryService {
    Employee saveOrUpdate(Employee employee);
    Optional<Employee> findOne(Predicate predicate);
    Optional<Employee> findById(Long id);
    Page<Employee> findAll(Predicate predicate, Pageable pageable);
}
