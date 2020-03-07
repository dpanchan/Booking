package com.theatre.booking.models.database;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class H {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			int number = Integer.parseInt(sc.nextLine());
			for(int i = 0; i < number; i++) {
				System.out.println(i);
			}			
		}
	}
}
