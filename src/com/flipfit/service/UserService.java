package com.flipfit.service;

import java.util.List;

import com.flipfit.model.Booking;
import com.flipfit.model.Slot;
import com.flipfit.model.User;
import com.flipfit.model.Workout;

public class UserService {
	
	private CentreService centreService;

	public List<Booking> getAllBookings(int userId) {
		
		return null;
	}

	public Slot bookSlot(int userId, int centreId, int slotId, Workout workout) {
		if (centreService.exists(userId)) {
			return centreService.bookSlot(userId, workout);
		}
		return null;
	}

}
