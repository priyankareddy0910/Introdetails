package Day23;

import org.testng.annotations.Test;

//import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;



public class MyTest {
	
	
	public WebDriver driver=null;
	
  	

@Test

	void MobileLoginHomeLoan() throws InterruptedException {
	//WebDriverManager.chromedriver().setup();
	ChromeOptions options = new ChromeOptions();
	 WebDriver driver = new ChromeDriver(options);
	driver.get("https://demo.nopcommerce.com/login");
	Thread.sleep(3000);
	driver.close();
		 
		
		
	}
	
	@Test
	void MobileLogincarLoan() throws InterruptedException 
	{
		//System.out.println("Test Execution"+Thread.currentThread().getId());
		//WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		 driver = new ChromeDriver(options);
		 driver.get("https://www.facebook.com/");
		 Thread.sleep(5000);
		 driver.close();
		 
		 
	}
	
	
	
}

  


