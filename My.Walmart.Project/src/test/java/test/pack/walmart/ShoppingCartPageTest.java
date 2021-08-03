package test.pack.walmart;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.pack.walmart.TestBaseClass;
import pages.pack.walmart.LoginPage;
import pages.pack.walmart.MyAccountPage;
import pages.pack.walmart.ShoppingCartPage;

public class ShoppingCartPageTest extends TestBaseClass {
	
	LoginPage loginPage;
	MyAccountPage myaccountpage;
	ShoppingCartPage shoppingcartpage;

	public ShoppingCartPageTest () {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		loginPage = new LoginPage ();
		myaccountpage=loginPage.login(prop.getProperty("Emailaddress"), prop.getProperty("Password"));
		Thread.sleep(3000);
		shoppingcartpage = new ShoppingCartPage ();
 }
	@Test(priority=1)
	   public void addtocartfromcartpageTest()   {
		shoppingcartpage.addtocartfromcartpage();  
		}
	@Test(priority=2)
	   public void removefromcartTest()  {
		 shoppingcartpage.removefromcart();
		 
	}	 
	@Test(priority=3)
	   public void removeallfromcartTest()  {
		 shoppingcartpage.removeallfromcart(); 
	}
	 @AfterMethod
		public void tearDown() {
			driver.quit();
		}	 
		 
		 
		 
	
}