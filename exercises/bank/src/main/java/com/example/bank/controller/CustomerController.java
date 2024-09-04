package com.example.bank.controller;

import com.example.bank.dto.indto.CustomerInDto;
import com.example.bank.dto.outdto.CustomerOutDto;
import com.example.bank.entity.Customer;
import com.example.bank.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @PostMapping("/customer")
    public String add(@RequestBody CustomerInDto customerInDto) {
        return customerService.add(customerInDto);
    }
    @GetMapping("/customers")
    public List<CustomerOutDto> getCustomers() {
        return customerService.getCustomers();
    }

}
