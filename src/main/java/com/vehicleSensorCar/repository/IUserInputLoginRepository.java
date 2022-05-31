package com.vehicleSensorCar.repository;

import com.vehicleSensorCar.domain.UserLogin;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IUserInputLoginRepository extends MongoRepository<UserLogin,String> {

    UserLogin findByUserId(String id);
}
