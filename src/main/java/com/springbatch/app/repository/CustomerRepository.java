package com.springbatch.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbatch.app.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
