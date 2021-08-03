package test.pack.walmart;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.pack.walmart.TestBaseClass;
import pages.pack.walmart.CreateAccountPage;
import pages.pack.walmart.LoginPage;

public class CreatPageTest extends TestBaseClass {
	
	LoginPage loginPage;
	CreateAccountPage createaccountpage;
	public CreatPageTest() {
		super();
     
	}
	@BeforeMethod
	public void setUp() {
		initialization();
		createaccountpage = new CreateAccountPage ();
	}
	@Test
	public void createaccount() {
		loginPage =createaccountpage.login (prop.getProperty("FirstName"), prop.getProperty("LastName"),prop.getProperty("Emailaddress"),prop.getProperty("password"));
}
	
	@Test
	public void MyaccounttitlepageTest() {
		String title =  createaccountpage.validateMyaccountPage();
	   Assert.assertEquals(title, "Walmart Canada");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	
	
	
	
	
	}
	
}