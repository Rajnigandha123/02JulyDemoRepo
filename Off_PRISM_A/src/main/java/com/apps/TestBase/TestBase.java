package com.apps.TestBase;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import com.apps.spicejet.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver;
		
	public LoginPage LP;
	
	@Parameters({"browser"})
	@BeforeTest
		public void setUp(String browser) throws InterruptedException
	      {
			 //String br="chrome";
		    if(browser.equalsIgnoreCase("chrome")) 
		       {
		          WebDriverManager.chromedriver().setup();
		          driver=new ChromeDriver();
		       }
		  else if(browser.equalsIgnoreCase("firefox")) //error for stale element
		     {
		        WebDriverManager.firefoxdriver().setup();
		        driver=new FirefoxDriver(); 
		     }
		  else if(browser.equalsIgnoreCase("msedge")) 
		    {
		       WebDriverManager.edgedriver().setup();	
		       driver=new EdgeDriver();
		    }
		else
		 {
			System.out.println("enter correct");
		 }
		driver.get("https://spiceclub.spicejet.com/signup");

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//..........obj
		
		 LP=new LoginPage();
		 
		 /*LP.First_Name();
		 Thread.sleep(2000);
			LP.Last_Name();
			Thread.sleep(2000);
			LP.Select_Option();
			Thread.sleep(2000);
			LP.Select_DOB_cal();*/
		// LP.First_Name();
		 	 /*Thread.sleep(2000);
		 	 LP.Last_Name();
		 	 Thread.sleep(2000);
		 	 LP.Select_Option();
		 	Thread.sleep(2000);
		 	 //LP.Select_DOB_cal();*/
//method or repeted
		 
		
	}
	@AfterTest
	public void setDown()
	{
		
	}

}
