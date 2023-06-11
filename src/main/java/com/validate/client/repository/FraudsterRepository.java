package com.validate.client.repository;

import com.validate.client.entity.Fraudster;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface FraudsterRepository extends MongoRepository<Fraudster, Long> {
    Optional<Fraudster> findByClient(String client);

}
