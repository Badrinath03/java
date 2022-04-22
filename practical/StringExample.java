package com;

public class StringExample {
	public void show() {
		char [] arr = {'j','a','v','a'};
		String s = new String (arr);
		System.out.println("Value is : " + s);
		System.out.println(arr);
	}
	
	public void myFunction() {
		String m = "Mamta";
		String m1 = "Mamta B";
		String m2 = new String ("Mamta");
    }
	
	
	public static void main(String[] args) {
		StringExample obj = new StringExample();
		obj.show();
		obj.myFunction();
	}
	
}
	