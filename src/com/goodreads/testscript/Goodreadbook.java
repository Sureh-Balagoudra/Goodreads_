package com.goodreads.testscript;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.goodreads.generic.Baseclass_;
import com.goodreads.pom.Homepage;
import com.goodreads.pom.Searchbook;


public class Goodreadbook {
	
	@Listeners(com.goodreads.generic.ListenerImplementation.class)
	public class CustomerModule extends Baseclass_{

		@Test
		public void Bookdetails() throws InterruptedException, EncryptedDocumentException, IOException {
			Reporter.log("Goodreadbook",true);
			
			FileInputStream fis=new FileInputStream("./Data/Bookdata.xlsx");
			 Workbook wb = WorkbookFactory.create(fis);
			String Bookname = wb.getSheet("Bookname").getRow(0).getCell(1).getStringCellValue();
			
			
			
			//String customerDescp = wb.getSheet("CreateCustomer").getRow(1).getCell(4).getStringCellValue();
			
			Homepage h=new Homepage(driver);
			h.setTaskTab();
			
			Searchbook s=new Searchbook(driver);
			
			s.getSearchtbx().sendKeys(Bookname);
			s.getBookname().click();
			s.getOpenbook().click();
			s.getWanttoreadopt().click();
			s.getMybookopt().click();
			s.getRemoveopt().click();
			Baseclass_.driver.switchTo().alert().accept();
			Thread.sleep(2000);
			
			
			}
		
		
	}


}
