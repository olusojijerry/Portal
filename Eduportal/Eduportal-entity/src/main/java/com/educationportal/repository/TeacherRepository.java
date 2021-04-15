package com.educationportal.repository;

import com.educationportal.domain.Teacher;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TeacherRepository extends PagingAndSortingRepository<Teacher, Long>, QuerydslPredicateExecutor<Teacher> {
}
