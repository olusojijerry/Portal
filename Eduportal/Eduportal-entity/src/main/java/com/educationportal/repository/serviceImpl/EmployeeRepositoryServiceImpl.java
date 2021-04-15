package com.educationportal.repository.serviceImpl;

import com.educationportal.domain.Employee;
import com.educationportal.domain.EmployeeAttachment;
import com.educationportal.repository.EmployeeAttachmentRepository;
import com.educationportal.repository.EmployeeRepository;
import com.educationportal.repository.services.EmployeeRepositoryService;
import com.querydsl.core.types.Predicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class EmployeeRepositoryServiceImpl implements EmployeeRepositoryService {
    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    EmployeeAttachmentRepository employeeAttachmentRepository;
    @Override
    public Employee saveOrUpdate(Employee employee) {
        return (Employee)this.employeeRepository.save(employee);
    }

    @Override
    public Optional<Employee> findOne(Predicate predicate) {
        return this.employeeRepository.findOne(predicate);
    }

    @Override
    public Optional<Employee> findById(Long id) {
        return this.employeeRepository.findById(id);
    }

    @Override
    public Page<Employee> findAll(Predicate predicate, Pageable pageable) {
        return this.employeeRepository.findAll(predicate,pageable);
    }

    public EmployeeAttachment saveOrUpdate(EmployeeAttachment employeeAttachment){
        return (EmployeeAttachment)this.employeeAttachmentRepository.save(employeeAttachment);
    }

    public Optional<EmployeeAttachment> findAttachmentById(Long id){
        return employeeAttachmentRepository.findById(id);
    }

    public Page<EmployeeAttachment> findAllAttachment(Predicate predicate, Pageable pageable){
        return this.employeeAttachmentRepository.findAll(predicate, pageable);
    }
}
