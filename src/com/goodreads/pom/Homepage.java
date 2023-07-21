package com.goodreads.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


	

	public class Homepage {
		//a[@class='dropdown__trigger dropdown__trigger--profileMenu dropdown__trigger--personalNav']
		
		
		@FindBy(xpath="//a[@class='dropdown__trigger dropdown__trigger--profileMenu dropdown__trigger--personalNav']")
		private WebElement logoutoptn;

		@FindBy(xpath="//div[@class='siteHeader__subNav siteHeader__subNav--profile gr-box gr-box--withShadowLarge']//a[@class='siteHeader__subNavLink'][normalize-space()='Sign out']")
		private WebElement logout;

		@FindBy(xpath="//input[@class='searchBox__input searchBox__input--navbar']")
		private WebElement searchtbx;
		
		public Homepage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		public void setLogout() {
			logoutoptn.click();
			logout.click();
		}
		public void setTaskTab() {
			searchtbx.click();
		}
		
	}



