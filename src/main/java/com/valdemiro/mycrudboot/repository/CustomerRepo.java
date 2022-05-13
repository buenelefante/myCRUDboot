package com.valdemiro.mycrudboot.repository;

import com.valdemiro.mycrudboot.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Long> {

}
