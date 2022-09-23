package com.example.fismoviecustomer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.fismoviecustomer.model.MovieCustomer;
import com.example.fismoviecustomer.model.MovieDto;
import com.example.fismoviecustomer.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class Controller {
		@Autowired
		CustomerService service;
		
		@GetMapping("/all")
		public List<MovieCustomer> getAll()
		{
			return service.findAllCustomer();
		}
		
		@GetMapping("/search/{mid}")
		public MovieDto findMovieById(@PathVariable("mid")int mid)
		{
			return service.findMovieById(mid);
		}
		@GetMapping("searchtype/{mtype}")
		public List<MovieDto> findByMovietype(@PathVariable("mtype") String mtype)
		{
			return service.findAllByMovietype(mtype);
		}
		
		@PostMapping("/register")
		public MovieCustomer addCustomer(@RequestBody MovieCustomer customer)
		{
			return service.addMovieCustomer(customer);
		}
		
		@DeleteMapping("/delete/{cid}")
		public String deleteCustomer(@PathVariable("cid") int cid)
		{
			service.deleteCustomer(cid);
			return "Customer account is deleted";
		}
}

