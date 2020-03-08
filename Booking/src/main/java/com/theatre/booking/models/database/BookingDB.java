package com.theatre.booking.models.database;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@Entity(name = "booking")
public class BookingDB {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long ID;
	
	private String userName;
	private String movieName;
	private int noOfSeats;
	
//	public static enum MovieType{
//		Drama,Classic,Comedy,Action,Horror
//	}
}
