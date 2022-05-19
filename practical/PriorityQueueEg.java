package com;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> qu = new PriorityQueue<String>();
		qu.add("Ram");
		qu.add("Karan");
		qu.add("Mamta");
		qu.add("Sam");
		qu.add("Priya");
		qu.add("Ajay");
		
		System.out.println("peek element : " + qu.peek());
		
		Iterator<String> itr = qu.iterator();
		while (itr.hasNext()){
			System.out.println(itr.next());
		}
		
		qu.remove();
		System.out.println("queue after removing an element");
		Iterator<String> itr1 = qu.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		

	}

}
