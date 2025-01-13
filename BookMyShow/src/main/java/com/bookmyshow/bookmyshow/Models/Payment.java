package com.bookmyshow.bookmyshow.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
public class Payment extends  BaseEntity{
    private  double amount;
    private Date paymentDate;
    @Enumerated(value = EnumType.ORDINAL)
    private  PaymentMode mode;
    private  String refNo;
    @Enumerated(value = EnumType.ORDINAL)
    private  PaymentStatus status;
    @Enumerated(value = EnumType.ORDINAL)
    private PaymentGateway paymentGateway;
    @ManyToOne
    private  Booking booking;

}
