package com.theatre.booking.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.theatre.booking.models.database.Movie;

@Repository
public interface MovieRepo extends JpaRepository<Movie, Long> {

	Movie findByName(String movieName);
	void deleteByNameAndDirector(String movieName, String director);
	
}
