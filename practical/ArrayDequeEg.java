package com;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> qu = new ArrayDeque<String>();
		qu.add("Ram");
		qu.add("Karan");
		qu.add("Mamta");
		qu.add("Sam");
		qu.add("Priya");
		qu.add("Ajay");
		
		for(String s : qu) {
			System.out.println(s);
			
		}
		qu.addFirst("Shree");
		qu.addLast("Riya");
		
		System.out.println("New List");
		for(String s : qu) {
			System.out.println(s);
		}
		
		qu.removeFirst();
		qu.removeLast();
		System.out.println("New List after removal");
		for(String s : qu) {
			System.out.println(s);
		}

	}

}
