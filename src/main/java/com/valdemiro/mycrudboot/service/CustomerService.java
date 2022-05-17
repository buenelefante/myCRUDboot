package com.valdemiro.mycrudboot.service;

import com.valdemiro.mycrudboot.model.Customer;
import com.valdemiro.mycrudboot.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepo customerRepo;

    @Autowired
    public CustomerService(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    public Customer findById(Long id) {
        return customerRepo.findById(id).orElse(null);
    }

    public List<Customer> findAll() {
        return customerRepo.findAll();
    }

    public Customer saveCustomer(Customer customer) {

        return customerRepo.save(customer);
    }

    public void deleteById(Long id) {
        customerRepo.deleteById(id);

    }
}
