package com.educationportal.repository;

import com.educationportal.domain.EmployeeAttachment;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface EmployeeAttachmentRepository extends PagingAndSortingRepository<EmployeeAttachment, Long>, QuerydslPredicateExecutor<EmployeeAttachment> {
}
