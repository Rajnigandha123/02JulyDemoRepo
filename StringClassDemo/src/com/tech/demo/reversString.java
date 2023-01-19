package com.tech.demo;

public class reversString {
	
	public  static void main(String rg[])
	{
		String s="my name rajni";
		String w=" "; 	s+=" ";
		
		for(int i=0;i<s.length();i++)
		{
			char c =s.charAt(i);
			if(c!=' ')
			{
				w += c;
				
			}
			else 
			{
				if(w.startsWith("r"))
				{
					System.out.println(w);
					w += " ";
				}
				
			
			}
			
		}
		
	
	}

}
