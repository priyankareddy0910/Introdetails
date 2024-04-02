package BrowserMethods;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ankus\\Documents\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		
		boolean status =driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		
		System.out.println(status);
		
		WebElement searchbox = driver.findElement(By.id("small-searchterms"));
		System.out.println(searchbox.isDisplayed());
		System.out.println(searchbox.isEnabled());
		//assert.assertEquals("false","true");
		
		
		
		
		
		
		
		   
		
		
			
				
		
		
		

}
	
}
