package com.bookmyshow.bookmyshow.Services;

import com.bookmyshow.bookmyshow.DTOS.ResponseStatus;
import com.bookmyshow.bookmyshow.DTOS.SignupRequestDTO;
import com.bookmyshow.bookmyshow.DTOS.SignupResponseDTO;
import com.bookmyshow.bookmyshow.Models.User;
import com.bookmyshow.bookmyshow.Repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;

    }

    public SignupResponseDTO signUp(SignupRequestDTO signupRequestDTO) {
        Optional<User> user = userRepository.findByEmail(signupRequestDTO.getEmail());
        SignupResponseDTO signupResponseDTO = new SignupResponseDTO();
        if(!user.isPresent()) {
            User newUser = new User();
            newUser.setName(signupRequestDTO.getName());
            newUser.setEmail(signupRequestDTO.getEmail());
            newUser.setUserName(signupRequestDTO.getUserName());
            newUser.setBookings(new ArrayList<>());
            userRepository.save(newUser);
            signupResponseDTO.setStatus(ResponseStatus.SUCCESS);
            signupResponseDTO.setSuccess(Boolean.TRUE);
        }
        else{
            signupResponseDTO.setStatus(ResponseStatus.FAILURE);
            signupResponseDTO.setSuccess(Boolean.FALSE);
        }
        return signupResponseDTO;

    }
}
