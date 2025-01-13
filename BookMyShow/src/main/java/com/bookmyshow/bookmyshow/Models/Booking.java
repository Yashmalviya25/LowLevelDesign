package com.bookmyshow.bookmyshow.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Booking extends  BaseEntity{
    private Date bookingDate;
    @ManyToOne
    private  User user;
    @ManyToOne
    private  Show show;
    // this can be many to many if cancelation is also in req.
    @OneToMany
    private  List<ShowSeat> showSeatList;
    @OneToMany
    private List<Payment> paymentList;
    private  int amount;
    @Enumerated(EnumType.ORDINAL)
    private  BookingStatus bookingStatus;

}
