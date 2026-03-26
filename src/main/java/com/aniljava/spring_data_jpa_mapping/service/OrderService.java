package com.aniljava.spring_data_jpa_mapping.service;

import com.aniljava.spring_data_jpa_mapping.dto.OrderRequest;
import com.aniljava.spring_data_jpa_mapping.entity.Customer;
import com.aniljava.spring_data_jpa_mapping.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer saveOrder(OrderRequest request){
       return customerRepository.save(request.getCustomer());
    }

    public List<Customer> findAllOrders() {
        return customerRepository.findAll();
    }
}
