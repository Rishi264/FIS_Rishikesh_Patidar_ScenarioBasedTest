package com.example.fismovieadmin.service;

import java.util.List;

import com.example.fismovieadmin.model.Movie;

public interface MovieService  {
	
	public List<Movie> findAllMovies();
	public Movie findMovieById(int mid);
	public Movie addMovie(Movie movie);
	public String deleteMovie(int mid);
	
	public List<Movie> findAllByMovietype(String mtype);
	
	
}
