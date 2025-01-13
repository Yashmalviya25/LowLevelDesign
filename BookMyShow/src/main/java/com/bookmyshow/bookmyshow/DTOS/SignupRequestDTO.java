package com.bookmyshow.bookmyshow.DTOS;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class SignupRequestDTO {
    private String name;
    private String userName;
    private String email;
    private String password;
}
