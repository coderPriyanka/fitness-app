package com.flipfit.controller;

import java.util.List;

import com.flipfit.model.Booking;
import com.flipfit.service.UserService;

public class UserController {
	
	private UserService userService;
	
	public List<Booking> getAllBookings(int userId) {
		return userService.getAllBookings(userId);
	}
	
}
