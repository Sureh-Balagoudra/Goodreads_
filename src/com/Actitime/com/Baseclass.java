package com.Actitime.com;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import com.Actitime.pom.Loginpage;

public class Baseclass {
	static {
		System.setProperty("webdriver.chromr.driver", "./driver/chromedriver.exe");
	}
	
public static WebDriver driver;


@BeforeClass
public void openBrowser() {
	Reporter.log("open browser",true);
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
}
@AfterClass
public void closeBrowser() {
	Reporter.log("close browser",true);
	driver.close();
}

@BeforeMethod
public void login() throws IOException {
	Reporter.log("login",true);
	FileInputStream fis=new FileInputStream("./data/commondata.property");
	Properties p=new Properties();
	p.load(fis);
	String url = p.getProperty("url");
	String un= p.getProperty("username");
	String pwd = p.getProperty("password");
	driver.get(url);
	Loginpage l=new Loginpage(driver);
	l.setlogin(un, pwd);
	

}
@AfterMethod
public void logout() {
	Reporter.log("logout",true);
}

}

