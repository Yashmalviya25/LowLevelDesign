package com.bookmyshow.bookmyshow.Services;

import com.bookmyshow.bookmyshow.Models.*;
import com.bookmyshow.bookmyshow.Repositories.BookingRepository;
import com.bookmyshow.bookmyshow.Repositories.ShowRepository;
import com.bookmyshow.bookmyshow.Repositories.ShowSeatRepository;
import com.bookmyshow.bookmyshow.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class BookingService {
    private UserRepository userRepository;
    private ShowRepository showRepository;
    private ShowSeatRepository showSeatRepository;
    private BookingRepository bookingRepository;
    @Autowired
    BookingService(UserRepository userRepository, ShowRepository showRepository,ShowSeatRepository showSeatRepository,BookingRepository bookingRepository) {
        this.userRepository = userRepository;
        this.showRepository = showRepository;
        this.showSeatRepository = showSeatRepository;
        this.bookingRepository = bookingRepository;
    }

    @Transactional(isolation = Isolation.SERIALIZABLE)
    public Booking bookTicket(int showId, int userId, List<Integer> showSeatIds){
        Optional<User> userOptional =  userRepository.findById(userId);
        if(userOptional.isEmpty()){
            throw  new RuntimeException("User not found");
        }
        User user = userOptional.get();
        Optional<Show> showOptional = showRepository.findById(showId);
        if(showOptional.isEmpty()){
            throw  new RuntimeException("Show not found");
        }
        Show show = showOptional.get();
        List<ShowSeat> showSeats = showSeatRepository.findAllById(showSeatIds);
        for(ShowSeat showSeat : showSeats){
            if (showSeat.getSeatStatus() != SeatStatus.EMPTY){
                throw  new RuntimeException("Show seat not available at the moment");

            }
        }
        for(ShowSeat showSeat : showSeats){
            showSeat.setSeatStatus(SeatStatus.BLOCKED);
            showSeat.setBlockedAt(new Date());
        }
        showSeatRepository.saveAll(showSeats);
        Booking booking = new Booking();
        booking.setUser(user);
        booking.setShow(show);
        booking.setBookingDate(new Date());
        booking.setAmount(2000);
        booking.setPaymentList(new ArrayList<>());
        booking.setShowSeatList(showSeats);
        return bookingRepository.save(booking);
    }
}
