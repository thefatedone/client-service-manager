package com.alex.client_service.services;

import com.alex.client_service.models.Rent;
import com.alex.client_service.utils.RentUtils;
import org.springframework.stereotype.Service;

@Service
public class RentService {

    public Rent createRent(double rent_price) {
        String rent_id = RentUtils.generateRentId();
        double rounded_price = RentUtils.roundPrice(rent_price);

        return new Rent(rent_id, rounded_price);
    }
}
