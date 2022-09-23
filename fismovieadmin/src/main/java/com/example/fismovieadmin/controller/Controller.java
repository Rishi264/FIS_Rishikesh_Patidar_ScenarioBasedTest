package com.example.fismovieadmin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.fismovieadmin.model.Movie;
import com.example.fismovieadmin.service.MovieService;

@RestController
@RequestMapping("/admin")
public class Controller {
		@Autowired
		MovieService service;
		
		@GetMapping("/all")
		public List<Movie> getAll()
		{
			return service.findAllMovies();
		}
		@GetMapping("/search/{mid}")
		public Movie getMovie(@PathVariable("mid")int mid)
		{
			return service.findMovieById(mid);
		}
		
		@GetMapping("/searchtype/{mtype}")
		public List<Movie> getMovieByRating(@PathVariable("mtype")String mtype)
		{
			return service.findAllByMovietype(mtype);
		}
		@PostMapping("/add")
		public Movie addMovie(@RequestBody Movie movie)
		{
			return service.addMovie(movie);
		}
		@DeleteMapping("/delete/{mid}")
		public String deleteMovie(@PathVariable("mid")int mid)
		{
			return service.deleteMovie(mid);
		}
		
}
