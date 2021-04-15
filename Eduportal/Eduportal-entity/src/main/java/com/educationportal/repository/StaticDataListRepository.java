package com.educationportal.repository;

import com.educationportal.domain.StaticDataList;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface StaticDataListRepository extends PagingAndSortingRepository<StaticDataList, Long>, QuerydslPredicateExecutor<StaticDataList> {
}
