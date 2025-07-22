package com.alex.client_service.controllers;

import com.alex.client_service.models.Rent;
import com.alex.client_service.services.RentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rent")
public class RentController {

    private final RentService rentService;

    @Autowired//иньекция
    public RentController(RentService rentService) {
        this.rentService = rentService;
    }

    @GetMapping("/{itemName}/{price}")
    public Rent createRent(@PathVariable String itemName, @PathVariable double price) {
        return rentService.createRent(price);
    }
}
