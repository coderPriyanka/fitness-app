package com.flipfit.service;

import com.flipfit.model.Center;
import com.flipfit.model.Slot;
import com.flipfit.model.Workout;

public class CentreService {
	
	private Center centre;
	
	public CentreService(Center centre) {
		this.centre = centre;
	}
	
	public boolean registerUser(int userId) {
		return centre.getAllUsers().add(userId);
	}
	
	public boolean exists(int userId) {
		return centre.getAllUsers().contains(userId);
	}

	public Slot bookSlot(int userId, Workout workout) {
		
		return null;
	}

}
