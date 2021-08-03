package test.pack.walmart;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.pack.walmart.TestBaseClass;
import pages.pack.walmart.LoginPage;
import pages.pack.walmart.MyAccountPage;
import pages.pack.walmart.MyItemsPage;
import pages.pack.walmart.SearchProductPage;

public class SearchProductTest extends TestBaseClass {
	
	
	LoginPage loginPage;
	MyAccountPage myaccountpage;
	MyItemsPage myItemspage;
	SearchProductPage SearchPage;
	
	public SearchProductTest() {
		super();
	}
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		loginPage = new LoginPage ();
		myaccountpage=loginPage.login(prop.getProperty("Emailaddress"), prop.getProperty("Password"));
		Thread.sleep(3000);
		driver.get("https://www.walmart.ca/my-account/SearchProductPage");
		SearchPage	 = new SearchProductPage();
	}
		 @Test
		   public void SearchProductPageTest ()  {
			  SearchPage.addtocart(); ;   
		 }
		 @Test
		   public void addtocartTest() throws InterruptedException  {
			 SearchPage.addtocart();
		 
		 }
		 
		 @AfterMethod
			public void tearDown() {
				driver.quit();
		 
		 
		 }
		 
		 
		 
		 
	

}
