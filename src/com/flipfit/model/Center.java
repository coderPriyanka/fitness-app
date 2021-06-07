package com.flipfit.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class Center {
	
	private Set<Integer> users;
	
	public Center() {
		this.users = new HashSet<>();
	}
	
	public Set<Integer> getAllUsers() {
		return users;
	}

}
