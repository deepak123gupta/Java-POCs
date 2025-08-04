package com.immutableExample;

import java.time.LocalDate;

public final class Passport {

    private final String passportNumber;
    private final String holderName;
    private final String nationality;
    private final LocalDate dateOfBirth;

    public Passport(String passportNumber, String holderName, String nationality, LocalDate dateOfBirth) {
        this.passportNumber = passportNumber;
        this.holderName = holderName;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public String getNationality() {
        return nationality;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "passportNumber='" + passportNumber + '\'' +
                ", holderName='" + holderName + '\'' +
                ", nationality='" + nationality + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }

    public static void main(String[] args) {
        Passport passport = new Passport("123456789", "John Doe", "American", LocalDate.of(1990, 1, 1));
        System.out.println(passport);


    }
}
