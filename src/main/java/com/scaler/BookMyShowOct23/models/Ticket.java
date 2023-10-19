package com.scaler.BookMyShowOct23.models;

import com.scaler.BookMyShowOct23.models.constants.BaseModel;
import com.scaler.BookMyShowOct23.models.constants.SeatType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
public class Ticket extends BaseModel{
    private double TicketAmount;
    private LocalDateTime timeOfBooking;
    @ManyToMany
    private List<ShowSeat> showsSeats;
    @ManyToOne
    //@JoinColumn(name = "show_id")
    private Show show;

    @Enumerated(EnumType.STRING)
    private SeatType.TicketStatus ticketStatus;


/*
Ticket Show
1   1
M   1
Ticket ShowSeat
1   M
M   1 // if cancellation allowed
 */
}
