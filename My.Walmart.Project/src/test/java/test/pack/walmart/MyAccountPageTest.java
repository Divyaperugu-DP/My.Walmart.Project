package test.pack.walmart;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.pack.walmart.TestBaseClass;
import pages.pack.walmart.LoginPage;
import pages.pack.walmart.MyAccountPage;

    public class MyAccountPageTest extends TestBaseClass{
	
	
	LoginPage loginPage;
	MyAccountPage myaccountpage;
	public MyAccountPageTest() {
		super();
	}
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		loginPage = new LoginPage ();
		myaccountpage=loginPage.login(prop.getProperty("Emailaddress"), prop.getProperty("Password"));
		Thread.sleep(3000);
	}
	 @Test
	   public void cartaccessTest() throws InterruptedException  {
				   myaccountpage.cartaccess();
     }
	 @AfterMethod
		public void tearDown() {
			driver.quit();
			
	 }	
 }		
			