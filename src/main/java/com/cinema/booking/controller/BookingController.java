package com.cinema.booking.controller;

import com.cinema.booking.model.Ticket;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path="/cinema")
public class BookingController {
    List<Ticket> ticketList = new ArrayList<>();
    //@RequestMapping(path="/tickets")
    @PostMapping(path="/tickets")
    public Ticket addTicket(@RequestBody Ticket ticket){
        System.out.println("controller called");
        ticketList.add(ticket);
        return ticket;
    }

    @GetMapping (path="/tickets")
    public List<Ticket> getTickets(){
        return ticketList;
    }

}
