package com;

public class StringMethodExample {
	
	public void show () {
		String s = "Anudip Foundation Skill Development Center";
		String s1 = "   ANUDIP   ";
		System.out.println("Upper Case is : " +s.toUpperCase());
		System.out.println("Lower Case is : " +s1.toLowerCase());
		System.out.println(s1);
		System.out.println("Trim is : " +s1.trim());
		System.out.println("Startwith is : " +s.startsWith("Anu"));
		System.out.println("Endswith is : " +s.endsWith("err"));
		System.out.println("CharAt is : " +s.charAt(3));
		System.out.println("CharAt is : " +s.charAt(15));
		System.out.println("Length is : " +s.length());
		
		int a = 20;
		String s2 = String.valueOf(a);
		System.out.println(s2 + 30);
		
		System.out.println("Replace is : "+s.replace("Development","Career Development"));
	}
	public static void main(String[] args) {
		StringMethodExample obj = new StringMethodExample();
		obj.show();
	}

}
