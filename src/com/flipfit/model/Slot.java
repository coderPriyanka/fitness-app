package com.flipfit.model;

import java.util.HashMap;
import java.util.Map;

public class Slot {
	
	private int id;
	private Map<Workout, Integer> workouts;
	private int startTime;
	
	public Slot(int id, int startTime) {
		this.id = id;
		this.workouts = new HashMap<>();
		this.startTime = startTime;
	}
	
	public int getId() {
		return id;
	}
	
	public Map<Workout, Integer> getWorkouts() {
		return workouts;
	}
	
	public int getStartTime() {
		return startTime;
	}

	public void addWorkout(Workout workout, int seats) {
		if (workouts.containsKey(workout)) {
			seats += workouts.get(workout);
		}
		workouts.put(workout, seats);
	}
	
	public void removeWorkout(Workout workout) {
		if (workouts.containsKey(workout)) {
			workouts.remove(workout);
		}
	}
	
	public boolean isSlotAvailable(Workout workout) {
		if (workouts.containsKey(workout)) {
			return true;
		}
		return false;
	}

}
