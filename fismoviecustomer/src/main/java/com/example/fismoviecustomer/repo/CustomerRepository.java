package com.example.fismoviecustomer.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.fismoviecustomer.model.MovieCustomer;

public interface CustomerRepository extends JpaRepository<MovieCustomer,Integer>{

}
