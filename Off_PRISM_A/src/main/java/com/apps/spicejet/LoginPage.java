package com.apps.spicejet;
import java.util.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.apps.TestBase.TestBase;

public class LoginPage extends TestBase {
	
	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@id='first_name']")
	private WebElement F_name_txt;
	
	public void First_Name()
	{
		F_name_txt.sendKeys("nisha");
	}
	
	@FindBy(xpath="//input[@id='last_name']")
	private WebElement L_name_txt;
	
	public void Last_Name()
	{
		L_name_txt.sendKeys("zine");
	}
	
	@FindBy(xpath="//select[@class='form-control form-select']")
	private WebElement select;
	
	public void Select_Option()
	
	{
		select.click();
		
		Select s=new Select(select);

		s.selectByIndex(13);
		
	}
	
	@FindBy(xpath="//input[@id='dobDate']")
	private WebElement DOB_cal;
	
	public void Select_DOB_cal()
	{
		DOB_cal.click();
		
	}
	@FindBy(xpath="select[@class=\"react-datepicker__month-select\"]")
	private WebElement select_year;
	
	////select[@class="react-datepicker__year-select"]
	public void Select_year()
	{   select_year.click();
		Select s2=new Select(select_year);
		s2.selectByValue("2023");	
	}
	
	@FindBy(xpath="select[@class=\"react-datepicker__month-select\"]")
	private WebElement select_mon;
	
	public void Select_Month()
	{
		select_mon.click();
		Select s1=new Select(select_mon);
		s1.selectByValue("12");	
	}
	
	/*@FindBy(xpath="select[@class=\"react-datepicker__month-select\"]")
	private WebElement select_day;
	
	public void Select_day()
	{
		Select s3=new Select(select_day);
		s3.selectByValue("13");	
	}*/
	
	
	

}
