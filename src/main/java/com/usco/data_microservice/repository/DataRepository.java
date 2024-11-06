package com.usco.data_microservice.repository;

import com.usco.data_microservice.entity.DataEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DataRepository extends MongoRepository<DataEntity, String> {
}
