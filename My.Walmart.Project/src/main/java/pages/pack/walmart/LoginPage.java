package pages.pack.walmart;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.pack.walmart.TestBaseClass;

public class LoginPage extends TestBaseClass {

	
	@FindBy(id="username")
	WebElement Emailaddressorphonenumber;

	@FindBy(id="password")
	WebElement Password;

	@FindBy(xpath="//*[@id=\"login-form\"]/div/div[7]/button")
	WebElement Signinbtn;

	@FindBy(xpath="//*[@id=\"login-form\"]/div/div[8]/a")
	WebElement createanaccountbtn;
	
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
		public MyAccountPage login(String un,String pwd) {
			Emailaddressorphonenumber.sendKeys(un);
			Password.sendKeys(pwd);
			Signinbtn.click();

			return new MyAccountPage();
		}	

		
		
		
		
		
}	

	
	
	

