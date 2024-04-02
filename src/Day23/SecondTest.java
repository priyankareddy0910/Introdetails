package Day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SecondTest {
WebDriver driver;
	@BeforeClass
	void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ankus\\Documents\\chromedriver.exe");
		 driver = new ChromeDriver();
		 
	}
	
	
	@Test(dataProvider="dp")
	void testLogin(String email , String pwd) {
		
		driver.get("https://demo.nopcommerce.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
		String exp_title="nopCommerce demo store";
		String act_title=driver.getTitle();
		
		Assert.assertEquals(act_title, exp_title);
		
		}
	
	
	@AfterClass
	void tearDown() {
		driver.quit();
	}
	
	
	@DataProvider(name="dp")
	 String[][] loginData()  {
	
	String data[][]={
			{"abc@gmail.com","test123"},
			{"priyankareddy0910@gmail.com","Testing123"},
			{"priyankareddy0910@gmail.com","123"}
			
			
	};
	
	return data;
	
	
	}
}


		
	
	
	
	
	
	
	



