package test.pack.walmart;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.pack.walmart.TestBaseClass;
import pages.pack.walmart.LoginPage;
import pages.pack.walmart.MyAccountPage;
import pages.pack.walmart.MyItemsPage;

public class MyItemsPageTest  extends TestBaseClass{
	LoginPage loginPage;
	MyAccountPage myaccountpage;
	MyItemsPage myItemspage;

	public MyItemsPageTest() {
		super();
	}	
	@BeforeMethod
	  public void setUp() throws InterruptedException {
		initialization();
		loginPage = new LoginPage ();
		myaccountpage=loginPage.login(prop.getProperty("Emailaddress"), prop.getProperty("Password"));
		Thread.sleep(3000);
		myItemspage = new MyItemsPage();
		
	}
	 @Test
	   public void myitemspage()  {
		 myItemspage.listbutton();   
	 }	
	 @Test
	   public void searchfunctionTest()  {
		myItemspage.searchbarbutton();
		
	 }
	 @AfterMethod
		public void tearDown() {
			driver.quit();
		
		
		
		
		
		
		
	}	
		
		
}