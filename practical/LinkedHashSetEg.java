package com;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetEg {
	
	public static void main(String[] args) {
		Set<String> s = new LinkedHashSet<String>();
		s.add("Pen");
		s.add("Pencil");
		s.add("Mouse");
		s.add("Phone");
		s.add(null);
		s.add("Ac");
		s.add("Bottle");
		s.add("Pen");
		
		Iterator<String> itr = s.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		
			
		}
	}	
	}


