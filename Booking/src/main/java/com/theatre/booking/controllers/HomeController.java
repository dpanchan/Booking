package com.theatre.booking.controllers;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.theatre.booking.DAO.BookingRepo;
import com.theatre.booking.models.database.BookingDB;
import com.theatre.booking.models.web.Booking;

@RestController
public class HomeController {
	
	@Autowired
	private BookingRepo bookingRepo;
	
	@PostMapping("/booking")
	public String bookMyShow(@RequestBody Booking b) {
		BookingDB bd = new DozerBeanMapper().map(b, BookingDB.class);
		bookingRepo.save(bd);
		return "ok";
	}
}
