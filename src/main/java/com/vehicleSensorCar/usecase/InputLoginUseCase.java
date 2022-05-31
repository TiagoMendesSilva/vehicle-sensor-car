package com.vehicleSensorCar.usecase;

import com.vehicleSensorCar.domain.Login;
import com.vehicleSensorCar.domain.User;
import com.vehicleSensorCar.domain.UserLogin;
import com.vehicleSensorCar.gateway.ILoginGateway;
import com.vehicleSensorCar.repository.IUserInputLoginRepository;
import com.vehicleSensorCar.repository.IUserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class InputLoginUseCase implements ILoginGateway{

    @Autowired
    private final IUserRepository iUserRepository;

    @Autowired
    private final IUserInputLoginRepository iUserInputLoginRepository;

    @Override
    public String signIn(Login login) {

        User user = userByCpf(login.getCpf());
        return null;
    }

    private User userByCpf(String cpf){
        return iUserRepository.findByCpf(cpf);
    }
}
