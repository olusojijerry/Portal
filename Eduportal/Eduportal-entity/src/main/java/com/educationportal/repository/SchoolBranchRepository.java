package com.educationportal.repository;

import com.educationportal.domain.SchoolBranch;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface SchoolBranchRepository extends PagingAndSortingRepository<SchoolBranch, Long>, QuerydslPredicateExecutor<SchoolBranch> {
}
