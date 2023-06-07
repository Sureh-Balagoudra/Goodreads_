package com.Actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	@FindBy(xpath="//a[@id='logoutLink']")
	private WebElement logout;
	
	@FindBy(xpath="//div[@id='container_tasks']") 
	private WebElement tasktab;
	
	
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	
	public void setlogin() {
		logout.click();
	}
	
	public void settasktab() {
		tasktab.click();
	}
	
	

}
