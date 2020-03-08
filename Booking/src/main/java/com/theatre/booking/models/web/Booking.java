package com.theatre.booking.models.web;

import lombok.Data;

@Data
public class Booking {
	private String movieName;
	private String userName;
	private Integer noOfSeats;
}
