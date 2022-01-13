package com.resilience4j.availability.controller;

import com.resilience4j.availability.model.Availability;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/availability")
public class AvailabilityController {

    @PostMapping(path = "/check",consumes = {MediaType.APPLICATION_JSON_VALUE},produces = {MediaType.APPLICATION_JSON_VALUE})
    public Boolean getAvailability(@RequestBody Availability availability){
        if(availability.getOrderName().equalsIgnoreCase("Air_Ticket")){
            return true;
        }
        return false;

    }

}
