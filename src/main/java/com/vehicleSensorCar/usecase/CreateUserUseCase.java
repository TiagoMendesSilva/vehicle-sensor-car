package com.vehicleSensorCar.usecase;

import com.vehicleSensorCar.domain.User;
import com.vehicleSensorCar.gateway.IUserGateway;
import com.vehicleSensorCar.repository.IUserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class CreateUserUseCase implements IUserGateway {

    @Autowired
    private final IUserRepository iUserRepository;

    @Override
    public User save(User user) {
        return iUserRepository.save(user);
    }


}
