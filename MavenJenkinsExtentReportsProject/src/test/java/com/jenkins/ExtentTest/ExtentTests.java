package com.jenkins.ExtentTest;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.jenkins.ExtentReport.ExtentsExecution;

public class ExtentTests extends ExtentsExecution{
	@Test
	public void create()
	{
		Reporter.log("Create",true);
	}
	@Test
	public void modify()
	{
		Reporter.log("Modify",true);
	}

}




