package com.theatre.booking.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.theatre.booking.DAO.BookingRepo;
import com.theatre.booking.DAO.MovieRepo;
import com.theatre.booking.models.database.Booking;
import com.theatre.booking.models.database.Movie;

@RestController
public class HomeController {
	
	@Autowired
	private BookingRepo bookingRepo;
	
	@Autowired
	private MovieRepo movieRepo;
	
	@GetMapping("/movies")
	public List<Movie> getAllMovies() {
		
		return movieRepo.findAll();	
	}
	
	@PostMapping("/booking")
	public String bookMyShow(@RequestBody Booking b) {

		bookingRepo.save(b);
		return "ok";
	}
	
	@PostMapping("/addMovies")
	public String addMoviesToDB(@RequestBody Movie m) {

		movieRepo.save(m);
		return "Successfully dded new movie to Movie Database !!" ;
		
	}
	
	@PostMapping("/updateMovie")
	public String updateMoviesToDB(@RequestBody Movie m) {
		movieRepo.deleteByNameAndDirector(m.getName(), m.getDirector());
		movieRepo.save(m);
		return "Successfully updated movie in the Movie Database !!" ;
	}
	
	
}
