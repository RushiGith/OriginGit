package com.velocity.Hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapDemo1ByIterator {

	public static void main(String[] args) {
	  HashMap m=new HashMap();
	 m.put(1, "Ram");
	 m.put(2, "Lakshman");
	 m.put(3, " Hanuman");
	 m.put(4,"sita");
	 m.put(5, "Jay Shree Ram!!"); // Done By Bhavesh ??done by bhumi
	 m.put(6, "Ramayan"); // End of Ramayan!!
	 m.put(7, "Jatayu"); // Solve The Conflict Hare 
	    Set<Integer> keySet = m.keySet();
         Iterator<Integer>itr = keySet.iterator();
	     while(itr.hasNext())
	  {
	    	 int i= itr.next();
		  System.out.println("Key is ="+i);
		  System.out.println("value is="+m.get(i));
	  }
	}

}
