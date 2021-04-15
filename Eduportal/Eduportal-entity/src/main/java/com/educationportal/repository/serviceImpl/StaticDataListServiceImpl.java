package com.educationportal.repository.serviceImpl;

import com.educationportal.domain.StaticDataList;
import com.educationportal.repository.StaticDataListRepository;
import com.educationportal.repository.services.StaticDataListRepositoryService;
import com.querydsl.core.types.Predicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class StaticDataListServiceImpl implements StaticDataListRepositoryService {
    @Autowired
    StaticDataListRepository staticDataListRepository;
    @Override
    public StaticDataList saveOrUpdate(StaticDataList staticDataList) {
        return (StaticDataList)this.staticDataListRepository.save(staticDataList);
    }

    @Override
    public Optional<StaticDataList> findOne(Predicate predicate) {
        return this.staticDataListRepository.findOne(predicate);
    }

    @Override
    public Optional<StaticDataList> findById(Long id) {
        return this.staticDataListRepository.findById(id);
    }

    @Override
    public Page<StaticDataList> findAll(Predicate predicate, Pageable pageable) {
        return this.staticDataListRepository.findAll(predicate, pageable);
    }
}
