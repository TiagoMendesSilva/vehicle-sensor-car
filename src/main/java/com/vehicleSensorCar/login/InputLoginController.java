package com.vehicleSensorCar.login;

import com.vehicleSensorCar.domain.Login;
import com.vehicleSensorCar.gateway.ILoginGateway;
import com.vehicleSensorCar.login.dto.LoginDTO;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@AllArgsConstructor
public class InputLoginController {

    @Autowired
    private final ILoginGateway iLoginGateway;

    @PostMapping(path = "/login")
    public ResponseEntity<String> inputLogin(@Valid @RequestBody LoginDTO loginDTO){

       Login loginDTOToLogin = loginDTOToLogin(loginDTO);
       String token = iLoginGateway.signIn(loginDTOToLogin);


       return ResponseEntity.ok(token);
    }

    public Login loginDTOToLogin(LoginDTO loginDTO){
       return new Login(loginDTO.getCpf(), loginDTO.getPassword());
    }


}
