package com.bookmyshow.bookmyshow.Controllers;

import com.bookmyshow.bookmyshow.DTOS.SignupRequestDTO;
import com.bookmyshow.bookmyshow.DTOS.SignupResponseDTO;
import com.bookmyshow.bookmyshow.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    private UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;

    }

    public SignupResponseDTO signUp(SignupRequestDTO signupRequestDTO) {
        return userService.signUp(signupRequestDTO);
    }
}
