package com.educationportal.repository;

import com.educationportal.domain.Users;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.math.BigInteger;

public interface UsersRepository extends PagingAndSortingRepository<Users, BigInteger>, QuerydslPredicateExecutor<Users> {
}
