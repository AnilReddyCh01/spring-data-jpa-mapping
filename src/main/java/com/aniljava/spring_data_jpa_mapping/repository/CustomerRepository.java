package com.aniljava.spring_data_jpa_mapping.repository;

import com.aniljava.spring_data_jpa_mapping.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
