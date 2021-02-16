package com.API.MentalHealthAPI.repo;

import com.API.MentalHealthAPI.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MongoDBRepository extends MongoRepository<User, String> {
}
