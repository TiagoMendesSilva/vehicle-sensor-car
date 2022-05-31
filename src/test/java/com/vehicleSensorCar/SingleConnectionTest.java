package com.vehicleSensorCar;

import com.vehicleSensorCar.connection.SingleConnection;
import org.junit.jupiter.api.Test;

public class SingleConnectionTest {

    @Test
    public void initDatabase(){
        SingleConnection.getConnection();
    }
}
