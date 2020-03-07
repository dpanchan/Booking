package com.theatre.booking.models.database;

import lambok.Data;

@Data
@RequiredArgsConstructor
public class Booking {

	private Long ID;
	private String userName;
	private String movieName;
	private String noOfSeats;
}
