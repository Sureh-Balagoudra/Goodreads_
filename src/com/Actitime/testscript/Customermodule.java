package com.Actitime.testscript;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;

import com.Actitime.com.Baseclass;
import com.Actitime.pom.Homepage;
import com.Actitime.pom.Userlistpage;


@Listeners(com.Actitime.com.Listnerimplementation.class)
public class Customermodule extends Baseclass {
	
	public void crestecustomer() throws EncryptedDocumentException, IOException, InterruptedException {
		Reporter.log("createcustomer",true);
		FileInputStream fis=new  FileInputStream("./data/commondata.property");
		Workbook wb = WorkbookFactory.create(fis);	
	String customername = wb.getSheet("createcustomer").getRow(1).getCell(3).getStringCellValue();
	String customerdescription = wb.getSheet("createcustomer").getRow(1).getCell(4).getStringCellValue();
	
	Homepage h=new Homepage(driver);
	h.settasktab();
   Userlistpage u=new Userlistpage(driver);
   u.getAddnewbtn().click();
   u.getAddnewcustomeropt().click();
   u.getEntercustomer().sendKeys(customername);
	u.getCustdesc().sendKeys(customerdescription);
	u.getSelectcust().click();
	u.getSelectcompany().click();
	u.getCreatecustomer().click();
	Thread.sleep(4000);
	String actualcustomer = u.getActualcustid().getText();
	Assert.assertEquals(actualcustomer, customername); 
	

	
}
	
	}


