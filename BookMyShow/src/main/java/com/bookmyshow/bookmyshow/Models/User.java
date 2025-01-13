package com.bookmyshow.bookmyshow.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class User extends BaseEntity{
    private String name;
    private String userName;
    private String email;
    @OneToMany
    private List<Booking> bookings;

}
