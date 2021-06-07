package com.flipfit.factory;

import java.util.HashMap;
import java.util.Map;

import com.flipfit.exceptions.InvalidInputException;
import com.flipfit.model.BellandurCenter;
import com.flipfit.model.Center;
import com.flipfit.model.CenterName;
import com.flipfit.model.KoramangalaCenter;


public class CenterFactory {
private static Map<CenterName, Center> centerNameToCenter;
	
	public static void createCentre() {
		centerNameToCenter = new HashMap<>();
		centerNameToCenter.put(CenterName.KORAMANGALA, new KoramangalaCenter());
		centerNameToCenter.put(CenterName.BELLANDUR, new BellandurCenter());
	}
		
	public static Center getCenter(final String name) {
		if ("koramangala".equals(name.toLowerCase())) {
			return centerNameToCenter.get(CenterName.KORAMANGALA);
		}
		if ("bellandur".equals(name.toLowerCase())) {
			return centerNameToCenter.get(CenterName.BELLANDUR);
		}
		throw new InvalidInputException("Not a valid center");
	}

}
