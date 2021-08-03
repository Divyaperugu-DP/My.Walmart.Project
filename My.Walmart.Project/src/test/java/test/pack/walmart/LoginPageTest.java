package test.pack.walmart;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.pack.walmart.TestBaseClass;
import pages.pack.walmart.LoginPage;
import pages.pack.walmart.MyAccountPage;

  public class LoginPageTest extends TestBaseClass {
	
	
	LoginPage loginPage;
	   MyAccountPage  myaccountpage;

		public LoginPageTest() {
			super();
		}
		@BeforeMethod
		public void setUp() {
			initialization();
			loginPage = new LoginPage();

    }
		@Test(priority=1)
		public void loginTest() {
			myaccountpage=loginPage.login(prop.getProperty("Emailaddress1"), prop.getProperty("Password1"));
       
     }
       
			
		
	@AfterMethod
   	public void tearDown() {
   		driver.quit();
       }	
 }