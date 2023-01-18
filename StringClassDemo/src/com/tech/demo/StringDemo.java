package com.tech.demo;
public class StringDemo {
	
	
	public static void main(String []argS)
	{
		String s ="My Name is Rjnigandha 13";
		String m="";
		String n="";
	for(int i=0; i<s.length(); i++)
	{
		 char c =s.charAt(i);
			 	
		 if(Character.isAlphabetic(c))
		 {
			 n=n+c;
		 }
		 if(Character.isDigit(c))
		 {
			 m=m+c;
		 }
			}
	 System.out.println("count of staring="+m+n);
	// System.out.println("count of staring="+n);
	 

}
	}
