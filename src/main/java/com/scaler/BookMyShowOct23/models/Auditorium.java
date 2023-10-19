package com.scaler.BookMyShowOct23.models;

import com.scaler.BookMyShowOct23.models.constants.AuditoriumFeature;
import com.scaler.BookMyShowOct23.models.constants.BaseModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Auditorium extends BaseModel {
    private String name;
    private int capacity;
    @OneToMany
    private List<Show> shows;
    @OneToMany
    private List<Seat> seats;
    @ElementCollection // creates mapping
    @Enumerated(EnumType.STRING) // collection of elements
    private List<AuditoriumFeature> auditoriumFeatures;  // list of enum
    /*
    For single enum, this is fine but for list of enums need @ElementCollection too
    @Enumerated(EnumType.STRING) // collection of elements
    private List<AuditoriumFeature> auditoriumFeatures;
     */
}
