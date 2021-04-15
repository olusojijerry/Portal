package com.educationportal.repository.services;

import com.educationportal.domain.Salary;
import com.querydsl.core.types.Predicate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface SalaryRepositoryService {
    Salary saveOrUpdate(Salary salary);
    Page<Salary> findAll(Predicate predicate, Pageable pageable);
    Optional<Salary> findOne(Predicate predicate);
    Optional<Salary> findOne(Long id);
}
