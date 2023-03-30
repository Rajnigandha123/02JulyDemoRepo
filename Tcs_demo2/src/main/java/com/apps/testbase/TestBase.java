package com.apps.testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver;
	
	@Parameters({"browser"})
	@Test()
	public void setUp(String browser)throws Exception
	{
		if(browser.equalsIgnoreCase("chrome"))
			
		{    WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("msedge"))
		{
			
			 WebDriverManager.chromedriver().setup();
			driver=new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			 WebDriverManager.chromedriver().setup();
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("enter correct browser name");
		}
		
		driver.get("https://demoqa.com/");
	}
	

}
