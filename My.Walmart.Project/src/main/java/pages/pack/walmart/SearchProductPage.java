package pages.pack.walmart;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import base.pack.walmart.TestBaseClass;

public class SearchProductPage extends TestBaseClass  {

	
	public  SearchProductPage() {
		PageFactory.initElements(driver,this);
	}
	
	public   void ToCartPage() {
		
		driver.get("https://www.walmart.ca/en/ip/<img alt=\"Brooke Bond Red Label Tea Bags\"");
		driver.getTitle();
	}

	public void addtocart()  {

		driver.findElement(By.xpath("//*[@id='my-account-content']")).click();

		driver.get("https://www.walmart.ca/en/ip/<img alt=\"Super Mario Bros. Back Pack\" ");
	
	
	
	
	
	
	
	}

		
	}
	
	
	
	
	
	
	
	
	
	
	

