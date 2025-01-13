package com.bookmyshow.bookmyshow.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Screen extends  BaseEntity{
    private  String screenName;
    @OneToMany
    private List<Seat> seats;
    @Enumerated(value = EnumType.ORDINAL)
    @ElementCollection
    private  List<Features> features;

}
