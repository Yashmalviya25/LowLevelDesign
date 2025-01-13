package com.bookmyshow.bookmyshow.Models;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Movie extends BaseEntity{

    private String title;
    private int duration;
    private String genre;
    private double rating;
    @Enumerated(value = EnumType.ORDINAL)
    @ElementCollection
    private List<Features> features;
    @Enumerated(value = EnumType.STRING)
    @ElementCollection
    private List<Language> languages;
    @ElementCollection
    private  List<String> actors;


}
