package com.integra.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;

import com.integra.base.TestBase;

public class SupportCoordinatorSearchPage extends TestBase{
	
	
	
	@FindBy(id = "ctl00_MainBody_btnNewCaseManager")
	WebElement Click_Add_SC_btn;
	
	@FindBy(id = "ctl00_MainBody_UCDemographicsMain_gvDemographics_ctl02_tbValue")
	WebElement Enter_Email_Address;
	
	@FindBy(name = "ctl00$MainBody$UCDemographicsMain$gvDemographics$ctl03$tbValue")
	WebElement Enter_SC_FirstName;
	
	@FindBy(css = "input[title=\"Last Name\"]")
	WebElement Enter_SC_LastName;
	
	@FindBy(css = "input[name=\"ctl00$MainBody$UCDemographicsMain$gvDemographics$ctl05$tbValue\"]")
	WebElement Enter_SC_StreetName;
	
	@FindBy(xpath = "//input[starts-with(@title,'Suburb/Town/City')]")
	WebElement Enter_SC_City;
	
	@FindBy(xpath = "//input[starts-with(@title,'State/Territory/Postcode')]")
	WebElement Enter_SC_PostCode;
	
	@FindBy(xpath = "//input[starts-with(@title,'Phone No')]")
	WebElement Enter_SC_PhoneNo;
	
	@FindBy(xpath="//select[@id=\"ctl00_MainBody_UCDemographicsMain_gvDemographics_ctl10_ddValue\"]")
	WebElement Select_SCA;
	
	@FindBy(id="ctl00_MainBody_btnSave")
	WebElement Save_SC_btn;
	
	
		public SupportCoordinatorSearchPage()
		{
			PageFactory.initElements(driver, this);
		}
		
		
	public String verify_Support_CoordinatorTitle()
	{
		
		return driver.getTitle();
	}
	
	
	public void Create_New_Support_Coordinator(String Emailadd, String Fname, String Lname, String stretname, String city, String postcode, String Pno)
	{
		Click_Add_SC_btn.click();;
		Enter_Email_Address.sendKeys(Emailadd);
		Enter_SC_FirstName.sendKeys(Fname);
		Enter_SC_LastName.sendKeys(Lname);
		Enter_SC_StreetName.sendKeys(stretname);
		Enter_SC_City.sendKeys(city);
		Enter_SC_PostCode.sendKeys(postcode);
		Enter_SC_PhoneNo.sendKeys(Pno);
		
		Select SCA_Dropdown = new Select(Select_SCA);
		SCA_Dropdown.selectByValue("SCA000002");
		Save_SC_btn.click();
		
	}
	
	
	
	

}
