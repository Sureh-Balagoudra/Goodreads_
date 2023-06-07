package com.Actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	@FindBy(xpath="//input[@id='username']")
	private WebElement untbx;

	@FindBy(xpath="//input[@placeholder='Password']") 
	private WebElement pwtbx;
	
	
	@FindBy(xpath="//div[normalize-space()='Login']")
	private WebElement lgbtn;
	
	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void setlogin(String un ,String pw) {
		untbx.sendKeys(un);
		pwtbx.sendKeys(pw);
		lgbtn.click();
	}

}
