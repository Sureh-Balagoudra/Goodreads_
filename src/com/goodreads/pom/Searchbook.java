package com.goodreads.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchbook {
	
	
	      @FindBy(xpath="//input[@class='searchBox__input searchBox__input--navbar']")
	      private WebElement searchtbx;


		@FindBy(xpath="//input[@class='searchBox__input searchBox__input--navbar']")
		private WebElement bookname;
		
		@FindBy(xpath="//tbody/tr[1]")
		private WebElement openbook;
		
		
		
		@FindBy(xpath="//div[@class='Sticky']//button[@aria-label='Tap to shelve book as want to read']")
        private WebElement wanttoreadopt;
		
		
		@FindBy(xpath="//a[normalize-space()='My Books']")
		private WebElement mybookopt;
		
		@FindBy(xpath="//img[@title='Remove from my books']")
		private WebElement removeopt;
		
		
		public Searchbook(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}


		public WebElement getSearchtbx() {
			return searchtbx;
		}


		public void setSearchtbx(WebElement searchtbx) {
			this.searchtbx = searchtbx;
		}


		public WebElement getBookname() {
			return bookname;
		}


		public void setBookname(WebElement bookname) {
			this.bookname = bookname;
		}


		public WebElement getOpenbook() {
			return openbook;
		}


		public void setOpenbook(WebElement openbook) {
			this.openbook = openbook;
		}


		public WebElement getWanttoreadopt() {
			return wanttoreadopt;
		}


		public void setWanttoreadopt(WebElement wanttoreadopt) {
			this.wanttoreadopt = wanttoreadopt;
		}


		public WebElement getMybookopt() {
			return mybookopt;
		}


		public void setMybookopt(WebElement mybookopt) {
			this.mybookopt = mybookopt;
		}


		public WebElement getRemoveopt() {
			return removeopt;
		}


		public void setRemoveopt(WebElement removeopt) {
			this.removeopt = removeopt;
		}


	
			
			
			
			
			
		
		}



		






