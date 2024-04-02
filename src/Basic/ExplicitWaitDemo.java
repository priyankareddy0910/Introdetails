package Basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ankus\\Desktop\\chromedriver.exe");	
		
		WebDriver driver = new ChromeDriver();
		

		
		driver.get("https://omayo.blogspot.com/");
		
		driver.manage().window().maximize();
		

		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//button[text()='Dropdown']")).click();
		
		WebElement facebook = driver.findElement(By.xpath("//a[contains(@href,'http://facebook.com')]"));
		
	    wait.until(ExpectedConditions.visibilityOf(facebook));
	    
	 
	    
	    facebook.click();
		
		

}
	
}
