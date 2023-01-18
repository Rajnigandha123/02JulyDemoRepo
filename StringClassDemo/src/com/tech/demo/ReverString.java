package com.tech.demo;

public class ReverString {
 
	public static void main(String []aa)
	{
		String s="rajni";
		String rev="";
		
		
		for(int i=0; i<s.length();i++)
		{
			char c=s.charAt(i);
			rev=c+rev;
			
		}
	//	String c1=rev;
		System.out.println(rev);
		
	}
	
}
