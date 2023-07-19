package com.velocity.New;

import java.util.LinkedHashSet;

public class List {

	public static void main(String[] args) {
	LinkedHashSet<String>set =new LinkedHashSet<String>();
	set.add("Mumabai");
	set.add("Delhi");
	set.add("Pune");
	set.add("Nashik");
	set.add("Amravati");
	set.add("Nagpur");
	
	for(String city:set)
	{
		System.out.println(city);
	}

	}

}
