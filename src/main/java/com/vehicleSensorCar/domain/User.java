package com.vehicleSensorCar.domain;

import lombok.*;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {



    private String name;
    private String cpf;
    private String email;

}
