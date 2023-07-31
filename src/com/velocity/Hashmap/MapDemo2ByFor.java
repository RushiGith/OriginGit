package com.velocity.Hashmap;

import java.util.HashMap;
import java.util.Set;

public class MapDemo2ByFor {

	public static void main(String[] args) {
		HashMap m= new HashMap();
		m.put("Super car", " Ferrari");
		m.put(" Super Bike", "Kawasaki Ninja H2r");
		m.put("Super electric truck", "tesla cyberTruck");
		Set<String> keySet = m.keySet();
		for(String car:keySet)
		{
			System.out.println("Key is ="+car);
			System.out.println("Value is ="+m.get(car));
		}
		

	}

}
