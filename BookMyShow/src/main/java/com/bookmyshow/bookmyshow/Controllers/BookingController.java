package com.bookmyshow.bookmyshow.Controllers;
import com.bookmyshow.bookmyshow.DTOS.BookTicketRequestDTO;
import com.bookmyshow.bookmyshow.DTOS.BookTicketResponseDTO;
import com.bookmyshow.bookmyshow.DTOS.ResponseStatus;
import com.bookmyshow.bookmyshow.Models.Booking;
import com.bookmyshow.bookmyshow.Services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookingController {
    private BookingService bookingService;
    @Autowired
    BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }
    public BookTicketResponseDTO bookTicket(BookTicketRequestDTO requestDTO) {
        BookTicketResponseDTO responseDTO = new BookTicketResponseDTO();
        try{
            Booking booking = bookingService.bookTicket(requestDTO.getShowId(), requestDTO.getUserId(), requestDTO.getShowSeatIds());
            responseDTO.setBookingId(booking.getId());
            responseDTO.setAmount(booking.getAmount());
            responseDTO.setStatus(ResponseStatus.SUCCESS);
        }
        catch(Exception e){
            responseDTO.setStatus(ResponseStatus.FAILURE);
        }
        return responseDTO;
    }
}
