package pages.pack.walmart;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.pack.walmart.TestBaseClass;

public class MyItemsPage extends TestBaseClass {
	
	@FindBy(xpath="//*[@id='accounts-home-page']")
	WebElement Lists;

      @FindBy(xpath="//body/div[@id='wrap']/div[@id='main-wrap']/div[@id='Apple, Gala']/div[3]/div[1]/form[1]/input[1]")
      WebElement searchbar;

      @FindBy(xpath="//button[contains(text(),'Search')]")
  	WebElement searchbutton;

      public MyItemsPage() {
  		PageFactory.initElements(driver,this);
  	}

      public void listbutton() {
			Lists.click();
      }

      public void searchbarbutton() {
    	  driver.get("https://www.walmart.ca/en/shopping-list");
    	  searchbar.sendKeys("apple,Gala");
    	  searchbutton.click();
    	
    	 
    	  
      }

}
