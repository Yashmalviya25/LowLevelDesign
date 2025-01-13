package com.bookmyshow.bookmyshow.DTOS;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SignupResponseDTO {
    private boolean success;
    private ResponseStatus status;
}
