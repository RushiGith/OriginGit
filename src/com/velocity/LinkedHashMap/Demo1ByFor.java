package com.velocity.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Set;

public class Demo1ByFor {

	public static void main(String[] args) {
	LinkedHashMap<Integer,String> map=new LinkedHashMap<Integer,String>();
	map.put(1,"Rushi");
	map.put(2, " Bhavesh");
	map.put(3, "Ayub");
	Set<Integer> keySet = map.keySet();
	for(Integer Rollno:keySet)
	{
		System.out.println("Key is="+Rollno);
		System.out.println("Value is="+map.get(Rollno));
	}
	}

}
