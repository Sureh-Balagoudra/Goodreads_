package com.goodreads.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
		
		@FindBy(xpath="//a[normalize-space()='Sign In']")
		private WebElement signupbtn;
		
		@FindBy(xpath="//button[normalize-space()='Sign in with email']")
		private WebElement emailsigninbtn;
		
		

		@FindBy(id="ap_email")
		private WebElement emailtbx;
		
		@FindBy(name="password")
		private WebElement pwtbx;
		
		@FindBy(xpath="//input[@id='signInSubmit']")
		private WebElement signinbtn;
		
		public Loginpage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		
		


		public void setLogin(String un, String pw) {
		signupbtn.click();
		emailsigninbtn.click();
		emailtbx.sendKeys(un);
		pwtbx.sendKeys(pw);
		signinbtn.click();		
	}

	}

