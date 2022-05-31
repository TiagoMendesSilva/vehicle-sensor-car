package com.vehicleSensorCar.user;

import com.vehicleSensorCar.domain.User;
import com.vehicleSensorCar.gateway.IUserGateway;
import com.vehicleSensorCar.user.dto.UserDTO;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/cadastro")
public class CreateUserController {

    @Autowired
    private final IUserGateway iUserGateway;


    @PostMapping(path = "/user")
    public ResponseEntity<UserDTO> registerUser(@Valid @RequestBody UserDTO userDTO){

        User user = userDTOToUser(userDTO);
        User userDTOToUser = iUserGateway.save(user);

        UserDTO userToUserDTO = userToUserDTO(userDTOToUser);
        return ResponseEntity.ok().body(userToUserDTO);
    }

    public User userDTOToUser(UserDTO userDTO) {

        return new User(userDTO.getName(), userDTO.getCpf(), userDTO.getEmail());
    }
    public  UserDTO userToUserDTO(User userDTOToUser){
        return new UserDTO(userDTOToUser.getName(), userDTOToUser.getCpf(), userDTOToUser.getEmail());
    }
}
