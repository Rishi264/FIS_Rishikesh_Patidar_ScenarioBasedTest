package com.example.fismoviecustomer.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.fismoviecustomer.model.MovieDto;

@FeignClient(name="fismovieadmin",url="http://localhost:9091/admin")
public interface FeignProxy {
	@GetMapping("search/{mid}")
	public MovieDto findMovieById(@PathVariable("mid") int mid);
	@GetMapping("searchtype/{mtype}")
	public List<MovieDto> findByMovietype(@PathVariable("mtype") String mtype);
}
