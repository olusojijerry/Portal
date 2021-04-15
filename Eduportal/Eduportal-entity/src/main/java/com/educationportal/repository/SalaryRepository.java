package com.educationportal.repository;

import com.educationportal.domain.Salary;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface SalaryRepository extends PagingAndSortingRepository<Salary, Long>, QuerydslPredicateExecutor<Salary> {
}
