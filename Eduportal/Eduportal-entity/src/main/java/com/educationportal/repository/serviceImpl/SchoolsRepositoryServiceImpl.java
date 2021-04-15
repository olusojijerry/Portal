package com.educationportal.repository.serviceImpl;

import com.educationportal.domain.Schools;
import com.educationportal.repository.SchoolsRepository;
import com.educationportal.repository.services.SchoolsRepositoryService;
import com.querydsl.core.types.Predicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class SchoolsRepositoryServiceImpl implements SchoolsRepositoryService {
    @Autowired
    SchoolsRepository schoolsRepository;


    @Override
    public Schools SaveOrUpdate(Schools schools) {
        return (Schools)this.schoolsRepository.save(schools);
    }

    @Override
    public Optional<Schools> findById(Long id) {
        return this.schoolsRepository.findById(id);
    }

    @Override
    public Optional<Schools> findOne(Predicate predicate) {
        return this.schoolsRepository.findOne(predicate);
    }

    @Override
    public Page<Schools> findAll(Predicate predicate, Pageable pageable) {
        return this.schoolsRepository.findAll(predicate, pageable);
    }
}
