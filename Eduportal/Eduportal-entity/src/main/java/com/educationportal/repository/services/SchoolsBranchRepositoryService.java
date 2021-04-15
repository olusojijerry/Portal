package com.educationportal.repository.services;

import com.educationportal.domain.SchoolBranch;
import com.querydsl.core.types.Predicate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface SchoolsBranchRepositoryService {
    SchoolBranch saveOrUpdate(SchoolBranch schoolBranch);
    Optional<SchoolBranch> findById(Long id);
    Optional<SchoolBranch> findOne(Predicate predicate);
    Page<SchoolBranch> findAll(Predicate predicate, Pageable pageable);
}
