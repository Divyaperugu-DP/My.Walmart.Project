package base.pack.walmart;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class TestBaseClass {
	
	
	public static WebDriver driver;
	 public static Properties prop;
	

	
	
	
	 
	 
	 public TestBaseClass() {
		 try {
		 FileInputStream File= new FileInputStream("C:\\Users\\rahul\\eclipse-workspace\\My.Walmart.Project\\src\\main\\java\\config\\pack\\walmart\\config.properties");
		 prop.load(File);
		 
		 }catch (FileNotFoundException e) {
				e.printStackTrace();
			}catch (IOException a) {
				a.printStackTrace();
			}
			}
		 
		 public static void initialization() {
			 String browserName= prop.getProperty("browser");

				if (browserName.equals("firefox")) {
					System.setProperty("webdriver.gecko.driver", "C:\\Users\\rahul\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
					driver = new FirefoxDriver();
					
				}
				else if (browserName.equals("chrome")) {
					System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Downloads\\chromedriver_win32\\chromedriver.exe");
					driver = new  ChromeDriver();
				}
					
				
				
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICITY_WAIT, TimeUnit.SECONDS);
			     
					driver.get(prop.getProperty("url"));
					
					
					
					
					
					
				
					
					
		 
		 
		 
		 
}
}