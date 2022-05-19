package com;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(101, "Mango");
		map.put(118, "Orange");
		map.put(105, "Banana");
		map.put(103, "Grapes");
		map.put(105, "Banana");
		map.put(null, null);
		map.put(102, null);
		map.putIfAbsent(102, "CustardApple");
		map.putIfAbsent(101, "Watermelon");
		
		for(Map.Entry m : map.entrySet()) {	
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		map.remove(103);
		System.out.println("After removal");
		for(Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		
		

	}

}
