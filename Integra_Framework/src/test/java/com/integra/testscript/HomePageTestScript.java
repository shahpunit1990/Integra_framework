package com.integra.testscript;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.integra.base.TestBase;
import com.integra.pages.HomePage;
import com.integra.pages.Login_Page;
import com.integra.pages.ProgramAndRole;

public class HomePageTestScript extends TestBase {
	Login_Page loginpage;
	ProgramAndRole program_role;
	HomePage homepage;
	
	public HomePageTestScript()
	{
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException
	{
		initilization();
		loginpage = new Login_Page();
		program_role = loginpage.Login_to_Portal(prop.getProperty("username"), prop.getProperty("password"));
		homepage = program_role.Program_And_Role(prop.getProperty("program"), prop.getProperty("role"));
		
	}
	@Test(priority=1)
	public void validate_SC_Search_title() 
	{
		String title = homepage.validate_Home_Page_title();
		Assert.assertEquals(title, "Participant Profile List");
	}
	
	@Test(priority=2)
	public void Click_On_Support_Coordinator() 
	{
		homepage.SC_search_tab();
		
	}
	
	@AfterMethod
	public void TearDown()
	{
		driver.quit();
	}
}
