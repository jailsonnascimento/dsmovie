package com.devsuperior.dsmovie.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmovie.entities.Movie;

import com.devsuperior.dsmovie.entities.User;

public interface MovieRepository extends JpaRepository<Movie, Long> {

	
}
