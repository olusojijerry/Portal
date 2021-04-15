package com.educationportal.repository.services;

import com.educationportal.domain.Schools;
import com.querydsl.core.types.Predicate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface SchoolsRepositoryService {
    Schools SaveOrUpdate(Schools schools);
    Optional<Schools> findById(Long id);
    Optional<Schools> findOne(Predicate predicate);
    Page<Schools> findAll(Predicate predicate, Pageable pageable);
}
