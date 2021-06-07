package com.flipfit.model;

import java.util.Set;

public class User {
	
	private int id;
	private String name;
	private Set<Integer> bookings;
	
	public User(int id, String name, Set<Integer> bookings) {
		this.id = id;
		this.name = name;
		this.bookings = bookings;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Set<Integer> getBookings() {
		return bookings;
	}
	
	// TODO
	public boolean bookSlot() {
		return false;
	}

}
