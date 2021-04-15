package com.educationportal.repository;

import com.educationportal.domain.Role;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface RolesRepository extends PagingAndSortingRepository<Role, Long>, QuerydslPredicateExecutor<Role> {
}
