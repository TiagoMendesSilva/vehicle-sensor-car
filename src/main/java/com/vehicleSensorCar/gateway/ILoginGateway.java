package com.vehicleSensorCar.gateway;

import com.vehicleSensorCar.domain.Login;

public interface ILoginGateway {
    String signIn(Login login);
}
