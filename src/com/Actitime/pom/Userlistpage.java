package com.Actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Userlistpage {
	
	
	@FindBy(xpath="//div[@class='title ellipsis']") 
	private WebElement addnewbtn ;
	
	@FindBy(xpath="//div[@class='item createNewCustomer']") 
	private WebElement addnewcustomeropt;
	
	@FindBy(xpath="//div[@class='item createNewCustomer']") 
	private WebElement entercustomer;
	
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement custdesc;
	
	
	@FindBy(xpath="//div[@class='emptySelection']")
	private WebElement selectcust;
	
	
	@FindBy(xpath="//div[@class='emptySelection']") 
	private WebElement selectcompany;
	
	@FindBy(xpath="//div[contains(text(),'Create Customer')]")
	private WebElement createcustomer;
	
	@FindBy(xpath="//div[@class='nameLabel'][normalize-space()='HDFC_001']") 
	private WebElement actualcustid;
	
	
	


	public Userlistpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	public WebElement getAddnewbtn() {
		return addnewbtn;
	}

	public WebElement getAddnewcustomeropt() {
		return addnewcustomeropt;
	}

	public WebElement getEntercustomer() {
		return entercustomer;
	}

	public WebElement getCustdesc() {
		return custdesc;
	}


	public WebElement getSelectcust() {
		return selectcust;
	}

	public WebElement getSelectcompany() {
		return selectcompany;
	}

	public WebElement getCreatecustomer() {
		return createcustomer;
	}

	public WebElement getActualcustid() {
		return actualcustid;
	}


	

}
