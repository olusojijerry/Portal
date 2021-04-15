package com.educationportal.repository.serviceImpl;


import com.educationportal.domain.SchoolBranch;
import com.educationportal.repository.SchoolBranchRepository;
import com.educationportal.repository.services.SchoolsBranchRepositoryService;
import com.querydsl.core.types.Predicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class SchoolBranchRepositoryServiceImpl implements SchoolsBranchRepositoryService {
    @Autowired
    SchoolBranchRepository schoolBranchRepository;

    @Override
    public SchoolBranch saveOrUpdate(SchoolBranch schoolBranch) {
        return (SchoolBranch)this.schoolBranchRepository.save(schoolBranch);
    }

    @Override
    public Optional<SchoolBranch> findById(Long id) {
        return this.schoolBranchRepository.findById(id);
    }

    @Override
    public Optional<SchoolBranch> findOne(Predicate predicate) {
        return this.schoolBranchRepository.findOne(predicate);
    }

    @Override
    public Page<SchoolBranch> findAll(Predicate predicate, Pageable pageable) {
        return this.schoolBranchRepository.findAll(predicate, pageable);
    }
}
