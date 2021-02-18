package com.example.shuttleapi.Controllers;

import com.example.shuttleapi.Models.Tickets;
import com.example.shuttleapi.Repositories.TicketRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ticket")
public class TicketController 
{
    @Autowired
    private TicketRepository ticketRepo;

    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public class ResourceNotFoundException extends RuntimeException 
    {
        /**
             *
             */
        private static final long serialVersionUID = 1L;

        public ResourceNotFoundException() {
        }
    }

    @PostMapping(path = "/booking")
    @ResponseStatus(HttpStatus.CREATED)
    public Tickets book(@RequestBody Tickets ticket)
    {
        return ticketRepo.save(ticket);
    }

    @DeleteMapping(path = "/cancellation")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void cancellation(@RequestParam(value = "Id") String Id)
    {
        Tickets ticket = ticketRepo.findById(Id)
            .orElseThrow(() -> new ResourceNotFoundException());
        ticketRepo.delete(ticket);
        
    }
}
