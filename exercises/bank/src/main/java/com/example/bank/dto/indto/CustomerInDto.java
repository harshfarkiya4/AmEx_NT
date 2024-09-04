package com.example.bank.dto.indto;

import com.example.bank.util.Gender;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class CustomerInDto {
    private String name;
    private double balance;
    private Gender gender;
    private LocalDate dateOfBirth;
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public String getName() {
        return name;
    }

    public void setCustomerName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setCustomerBalance(double balance) {
        this.balance = balance;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = LocalDate.parse(dateOfBirth, formatter);
    }
}
