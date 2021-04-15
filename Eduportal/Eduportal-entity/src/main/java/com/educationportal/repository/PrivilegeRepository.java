package com.educationportal.repository;

import com.educationportal.domain.Privilege;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PrivilegeRepository extends PagingAndSortingRepository<Privilege, Long>, QuerydslPredicateExecutor<Privilege> {
}
