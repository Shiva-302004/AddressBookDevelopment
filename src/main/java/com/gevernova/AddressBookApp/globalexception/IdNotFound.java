package com.gevernova.AddressBookApp.globalexception;

public class IdNotFound extends RuntimeException{
    public IdNotFound(String message) {
        super(message);
    }
}
