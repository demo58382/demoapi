package com.practice.controller;


import com.practice.entity.Flight;
import com.practice.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/home")
public class Practice {
    @Autowired
    private FlightRepository flightRepo;

    @PostMapping
    public Flight saveOne(@RequestBody Flight flight){
        Flight save = flightRepo.save(flight);
        return save;
    }

    @GetMapping
    public List<Flight> getAllLeads(){
        List<Flight> leads = flightRepo.findAll();
        return leads;
    }
}
