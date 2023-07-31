package com.velocity.HashMapTreemap;

import java.util.Set;
import java.util.TreeMap;

public class Demo1byFor {

	public static void main(String[] args) {
    TreeMap<Integer,Integer> map=new TreeMap<Integer,Integer>();
    map.put(1, 1000);
    map.put(2, 2000);
    map.put(3, 3000);
    Set<Integer> keySet = map.keySet();
     for(Integer num:keySet)
     {
    	 System.out.println("Key is="+num);
    	 System.out.println("Value is="+map.get(num));
     }
	}

}
