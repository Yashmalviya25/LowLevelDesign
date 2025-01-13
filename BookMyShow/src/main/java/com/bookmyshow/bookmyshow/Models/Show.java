package com.bookmyshow.bookmyshow.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity(name = "shows")
@Getter
@Setter
public class Show extends  BaseEntity{
    private Date date;
    private int duration;
    private Language language;
    @ManyToOne
    private Movie movie;
    @ManyToOne
    private Theatre theatre;
    @ManyToOne
    private Screen screen;
    @OneToMany
    private List<ShowSeat> showSeatList;
    @OneToMany
    private List<ShowSeatType> showSeatTypeList;

}
