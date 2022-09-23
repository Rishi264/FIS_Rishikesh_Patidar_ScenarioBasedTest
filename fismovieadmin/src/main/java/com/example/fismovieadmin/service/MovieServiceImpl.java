package com.example.fismovieadmin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.fismovieadmin.model.Movie;
import com.example.fismovieadmin.repo.MovieRepository;



@Service
public class MovieServiceImpl implements MovieService {
	
	@Autowired
	MovieRepository repo;
	
	
	@Override
	public List<Movie> findAllMovies() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Movie addMovie(Movie movie) {
		// TODO Auto-generated method stub
		return repo.save(movie);
	}

	@Override
	public String deleteMovie(int mid) {
		// TODO Auto-generated method stub
		repo.deleteById(mid);
		return "Movie Deleted";
	}

	@Override
	public Movie findMovieById(int mid) {
		// TODO Auto-generated method stub
		return repo.findById(mid).orElse(null);
	}

	@Override
	public List<Movie> findAllByMovietype(String mtype) {
		// TODO Auto-generated method stub
		return repo.findAllByMovietype(mtype);
	}

	

}
