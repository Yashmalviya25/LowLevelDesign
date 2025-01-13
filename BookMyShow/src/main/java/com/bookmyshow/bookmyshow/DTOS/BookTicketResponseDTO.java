package com.bookmyshow.bookmyshow.DTOS;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookTicketResponseDTO {
    private  int bookingId;
    private  int amount;
    private  ResponseStatus status;
}
