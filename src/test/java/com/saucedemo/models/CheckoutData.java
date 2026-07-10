package com.saucedemo.models;

public class CheckoutData {

    private final String firstName;
    private final String lastName;
    private final String zipCode;

    public CheckoutData(String firstName,
                        String lastName,
                        String zipCode) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.zipCode = zipCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getZipCode() {
        return zipCode;
    }
}