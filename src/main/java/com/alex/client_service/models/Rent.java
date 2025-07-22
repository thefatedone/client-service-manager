package com.alex.client_service.models;

public class Rent {
    String rent_id;
    Double rent_price;

    public Rent() {
    }

    public Rent(String rent_id, Double rent_price) {
        this.rent_id = rent_id;
        this.rent_price = rent_price;
    }

    public String getRent_id() {
        return rent_id;
    }

    public void setRent_id(String rent_id) {
        this.rent_id = rent_id;
    }

    public Double getRent_price() {
        return rent_price;
    }

    public void setRent_price(Double rent_price) {
        this.rent_price = rent_price;
    }
}


