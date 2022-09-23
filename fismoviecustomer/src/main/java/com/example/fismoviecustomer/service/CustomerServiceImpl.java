package com.example.fismoviecustomer.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.fismoviecustomer.model.MovieCustomer;
import com.example.fismoviecustomer.model.MovieDto;
import com.example.fismoviecustomer.repo.CustomerRepository;


@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerRepository repo;
	
	@Autowired
	FeignProxy proxy;
	
	@Override
	public List<MovieCustomer> findAllCustomer() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public MovieCustomer addMovieCustomer(MovieCustomer customer) {
		// TODO Auto-generated method stub
		return repo.save(customer);
	}

	@Override
	public String deleteCustomer(int cid) {
		// TODO Auto-generated method stub
		repo.deleteById(cid);
		return "customer data deleted";
	}

	@Override
	public MovieDto findMovieById(int mid) {
		// TODO Auto-generated method stub
		return proxy.findMovieById(mid);
	}

	@Override
	public List<MovieDto> findAllByMovietype(String mtype) {
		// TODO Auto-generated method stub
		return proxy.findByMovietype(mtype);
	}

}
