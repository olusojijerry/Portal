package com.educationportal.repository;

import com.educationportal.domain.Employee;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long>, QuerydslPredicateExecutor<Employee> {
}
