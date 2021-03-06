package com.integra.testscript;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.integra.base.TestBase;
import com.integra.pages.Login_Page;
import com.integra.pages.ProgramAndRole;

public class LoginPageTestCase extends TestBase
{
	Login_Page loginpage;
	ProgramAndRole program_and_role;
	// creating constructor to call testbase class to read data from config file 
	public LoginPageTestCase()
	{
		super();
	}

	@BeforeMethod
	public void setup()
	{
		// to call initilization method in testbase class
		initilization();
		// creating object of login_Page
		loginpage = new Login_Page();
	}

	@Test(priority=1)
	public void LoginPageTitleTest() 
	{
		String title = loginpage.verify_loginpage_title();
		Assert.assertEquals(title, "Integra Choice & Control");
	}
	
	@Test(priority=2)
	public void LoginTest()
	{
		program_and_role=loginpage.Login_to_Portal(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	
	@AfterMethod
	public void TearDown()
	{
		driver.quit();
	}

}
