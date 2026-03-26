package com.aniljava.spring_data_jpa_mapping.controller;

import com.aniljava.spring_data_jpa_mapping.dto.OrderRequest;
import com.aniljava.spring_data_jpa_mapping.entity.Customer;
import com.aniljava.spring_data_jpa_mapping.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class OrderController {

    private static final Logger logger = LoggerFactory.getLogger(OrderController.class);

    @Autowired
    private OrderService service;

    @PostMapping("/placeOrder")
    public Customer placeOrder(@RequestBody OrderRequest request){
        logger.info("Received order request: {}", request);
        return service.saveOrder(request);
    }

    @GetMapping("/findAllOrders")
    public List<Customer> findAllOrders(){
        logger.info("Received request to find all orders");
        return service.findAllOrders();
    }
}
