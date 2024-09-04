package com.example.bank.service;

import com.example.bank.dto.indto.CustomerInDto;
import com.example.bank.dto.outdto.CustomerOutDto;
import com.example.bank.entity.Customer;
import com.example.bank.repo.CustomerRepo;
import com.example.bank.util.Gender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepo customerRepo;
    public String add(CustomerInDto customerInDto) {
        Customer customer = new Customer();
        customer.setName(customerInDto.getName());
        customer.setBalance(customerInDto.getBalance());
        customer.setGender(customerInDto.getGender());
        customer.setDateOfBirth(customerInDto.getDateOfBirth());
        customerRepo.save(customer);
        return "Customer added Successfully";
    }
    public List<CustomerOutDto> getCustomers(){
        List<Customer> customers = customerRepo.findAll();
        List<CustomerOutDto> customerOutDtos = new ArrayList<>();
        for (Customer customer : customers) {
            CustomerOutDto customerOutDto = new CustomerOutDto();
            customerOutDto.setCustomerName(customer.getName());
            customerOutDto.setCustomerBalance(customer.getBalance());
            customerOutDto.setCustomerId(customer.getId());
            customerOutDtos.add(customerOutDto);
        }
        return customerOutDtos;
    }

}
