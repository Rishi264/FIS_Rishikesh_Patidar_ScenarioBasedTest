package com.example.fismovieadmin.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.fismovieadmin.model.Movie;

public interface MovieRepository extends JpaRepository<Movie,Integer> {
		@Query("Select m from Movie m where m.mtype=?1")
		public List<Movie> findAllByMovietype(String mtype);
}
