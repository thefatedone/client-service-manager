package com.alex.client_service.utils;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class RentUtils {
    public static String generateRentId() {
        return UUID.randomUUID().toString();
    }

    public static double roundPrice(double price) {
        return Math.round(price * 100) / 100.0;
    }
}
