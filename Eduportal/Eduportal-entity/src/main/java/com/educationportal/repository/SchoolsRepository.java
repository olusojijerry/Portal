package com.educationportal.repository;

import com.educationportal.domain.Schools;
import com.educationportal.domain.StaticDataList;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface SchoolsRepository extends PagingAndSortingRepository<Schools, Long>, QuerydslPredicateExecutor<Schools> {
}
