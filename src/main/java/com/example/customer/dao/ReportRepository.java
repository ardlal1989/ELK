package com.example.customer.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.customer.entity.Report;

@Repository
public interface ReportRepository extends CrudRepository<Report, Long> {}
