package com.odenktools.springhackathon.repositories;

import com.odenktools.springhackathon.models.ApiKeyUsersEntity;
import org.springframework.data.repository.CrudRepository;

public interface ApiKeyUsersRepository extends CrudRepository<ApiKeyUsersEntity, Long> {

}