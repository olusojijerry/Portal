package com.educationportal.repository.serviceImpl;

import com.educationportal.domain.Salary;
import com.educationportal.repository.SalaryRepository;
import com.educationportal.repository.services.SalaryRepositoryService;
import com.querydsl.core.types.Predicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class SalaryRepositoryServiceImpl implements SalaryRepositoryService {
    @Autowired
    SalaryRepository salaryRepository;

    @Override
    public Salary saveOrUpdate(Salary salary) {
        return (Salary)this.salaryRepository.save(salary);
    }

    @Override
    public Page<Salary> findAll(Predicate predicate, Pageable pageable) {
        return this.salaryRepository.findAll(predicate, pageable);
    }

    @Override
    public Optional<Salary> findOne(Predicate predicate) {
        return this.salaryRepository.findOne(predicate);
    }

    @Override
    public Optional<Salary> findOne(Long id) {
        return this.salaryRepository.findById(id);
    }
}
