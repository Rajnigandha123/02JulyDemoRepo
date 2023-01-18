package com.apps.spicejet;

import org.testng.annotations.Test;

import com.apps.TestBase.TestBase;

public class LoginTest extends TestBase{
	
	
@Test
	public void Verify() throws Exception
	{
		LoginPage LP=new LoginPage();
		LP.First_Name();
		 Thread.sleep(2000);
		LP.Last_Name();
		 Thread.sleep(2000);
		LP.Select_Option();
		 Thread.sleep(2000);
		LP.Select_DOB_cal();
		Thread.sleep(2000);
		LP.Select_year();
		Thread.sleep(2000);
		LP.Select_Month();
	}
	
}
