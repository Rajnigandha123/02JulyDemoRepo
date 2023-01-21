package com.apps.testbase;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

import io.github.bonigarcia.wdm.WebDriverManager;
 public class TestBase {
	 
	public static WebDriver driver;
		
		
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
		//..............lounching browser
		driver.get("https://apps.dalalstreet.ai/login");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	   	}
	
	@AfterTest
	public void setDown()
	{
		driver.close();

	}
	
    @AfterClass
      public void end()
        {
	      //logger.info("framework end");
        }
	
}//