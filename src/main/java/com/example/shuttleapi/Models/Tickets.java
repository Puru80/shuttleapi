package com.example.shuttleapi.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Tickets")
public class Tickets 
{
    @Id
    public String Id;

    public String destination;
    public String email;
    public int num_booking;

    public Tickets(String id, String destination, String email, int num_booking) {
        this.Id = id;
        this.destination = destination;
        this.email = email;
        this.num_booking = num_booking;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNum_booking() {
        return num_booking;
    }

    public void setNum_booking(int num_booking) {
        this.num_booking = num_booking;
    }

}
