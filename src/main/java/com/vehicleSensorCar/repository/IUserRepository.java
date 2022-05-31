package com.vehicleSensorCar.repository;

import com.vehicleSensorCar.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends MongoRepository<User,String> {

   User findByCpf(String cpf);

}

