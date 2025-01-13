package com.bookmyshow.bookmyshow.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Theatre extends  BaseEntity{
    private  String theatreName;
    private  String theatreAddress;
    @OneToMany
    private List<Screen> screenList;
    @ManyToOne
    private  Region theatreRegion;
}
