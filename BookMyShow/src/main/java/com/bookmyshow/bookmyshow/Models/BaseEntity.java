package com.bookmyshow.bookmyshow.Models;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@MappedSuperclass
@Getter
@Setter
public class BaseEntity {
    @Id
    private Integer id;
    private Date createdAt;
    private Date updatedAt;
}
