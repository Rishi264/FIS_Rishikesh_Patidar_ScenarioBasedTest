package com.example.fismoviecustomer.service;

import java.util.List;

import com.example.fismoviecustomer.model.MovieCustomer;
import com.example.fismoviecustomer.model.MovieDto;


public interface CustomerService {
	public List<MovieCustomer> findAllCustomer();
	public MovieCustomer addMovieCustomer(MovieCustomer customer);
	public String deleteCustomer(int cid);
	
	public MovieDto findMovieById(int mid);
	public List<MovieDto> findAllByMovietype(String mtype);
}
