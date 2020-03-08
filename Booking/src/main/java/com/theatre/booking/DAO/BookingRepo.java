package com.theatre.booking.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.theatre.booking.models.database.BookingDB;

public interface BookingRepo extends JpaRepository<BookingDB,Long>{

	
}
