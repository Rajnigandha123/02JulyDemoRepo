package com.tech.demo;

public class ReverString {
 
	public static void main(String []aa)
	{
		String s="rajni13";
		String d="";
		String d1="";
		
		
		for(int i=0; i<s.length();i++)
		{
			char c=s.charAt(i);
			
			if(Character.isDigit(c))
			{
				d=d+c;
			}
			if(Character.isAlphabetic(c))
			{
				d1=d1+c;
			}
			
		}
	//	String c1=rev;
		System.out.println(d+d1);
		
		System.out.println();
		
	}
	
}
