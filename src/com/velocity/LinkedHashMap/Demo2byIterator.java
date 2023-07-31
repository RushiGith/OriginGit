package com.velocity.LinkedHashMap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class Demo2byIterator {

	public static void main(String[] args) {
		LinkedHashMap m= new LinkedHashMap();
		m.put("Car", "Maruti");
		m.put("bike", " Honda");
		m.put("cycle"," Hero");
		Set<String> keySet = m.keySet();
		Iterator<String> itr = keySet.iterator();
		while(itr.hasNext())
		{
			String i= itr.next();
			System.out.println("Key is ="+i);
			System.out.println("Value is ="+m.get(i));
		}

	}

}
