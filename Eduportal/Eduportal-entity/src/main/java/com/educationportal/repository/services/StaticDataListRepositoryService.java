package com.educationportal.repository.services;

import com.educationportal.domain.StaticDataList;
import com.querydsl.core.types.Predicate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface StaticDataListRepositoryService {
    StaticDataList saveOrUpdate(StaticDataList staticDataList);
    Optional<StaticDataList> findOne(Predicate predicate);
    Optional<StaticDataList> findById(Long id);
    Page<StaticDataList> findAll(Predicate predicate, Pageable pageable);
}
