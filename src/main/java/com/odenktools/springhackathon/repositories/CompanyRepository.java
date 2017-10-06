package com.odenktools.springhackathon.repositories;

import com.odenktools.springhackathon.models.CompanyEntity;
import org.springframework.data.repository.CrudRepository;

public interface CompanyRepository extends CrudRepository<CompanyEntity, Long> {

}