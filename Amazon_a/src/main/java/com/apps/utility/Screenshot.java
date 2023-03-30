package com.apps.utility;

import java.io.File;
import java.io.IOException;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.apps.testbase.TestBase;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {
	
	public static void main(String rr[]) throws IOException
	{
		
		/*System.setProperty("webDriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();*/
		
		   WebDriverManager.chromedriver().setup();

	        WebDriver driver = new ChromeDriver();
	        
		driver.get("www.google.com");
		TakesScreenshot ts= (( TakesScreenshot)driver); 
		
		File scr = ts.getScreenshotAs(OutputType.FILE);
		
		File des=new File("C:\\Users\\Icon\\Desktop\\project\\02JulyDemoRepo\\Amazon_a\\screenshots");
		
		FileHandler.copy(scr, des);
	}
	

}
