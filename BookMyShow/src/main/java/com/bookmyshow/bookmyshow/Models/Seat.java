package com.bookmyshow.bookmyshow.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class Seat extends BaseEntity {
    private String seatNo;
    private int rowValue;
    private int columnValue;
    @ManyToOne
    private SeatType seatType;
}
