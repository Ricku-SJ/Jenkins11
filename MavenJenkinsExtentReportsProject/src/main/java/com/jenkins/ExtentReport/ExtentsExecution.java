package com.jenkins.ExtentReport;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentsExecution {
WebDriver driver;
@BeforeClass
public void open()
{
	Reporter.log("Open",true);
	WebDriverManager.edgedriver().setup();
}
@BeforeMethod
public void login()
{
	Reporter.log("Login",true);
	driver.get("https://www.facebook.com/");
}
@AfterMethod
public void logout()
{
	Reporter.log("Logout",true);
}
@AfterClass
public void close()
{
	Reporter.log("Close",true);
}
}