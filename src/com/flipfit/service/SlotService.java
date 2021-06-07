package com.flipfit.service;

import com.flipfit.model.Slot;
import com.flipfit.model.Workout;

public class SlotService {
	
	private Slot slot;
	
	public int bookSlot(Workout workout) {
		if (slot.isSlotAvailable(workout)) {
			int seats = slot.getWorkouts().get(workout) - 1;
			if (seats == 0) {
				slot.removeWorkout(workout);
			} else {
				slot.getWorkouts().put(workout, seats);
			}
			return slot.getId();
		}
		return -1;
	}
}
