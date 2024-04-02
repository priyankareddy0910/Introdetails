import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class Locators {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//invoking browser
				System.setProperty("webdriver.chrome.driver","C:\\Users\\ankus\\Documents\\chromedriver.exe");//114
				
				RemoteWebDriver driver = new ChromeDriver();
				
				WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));//
								
				driver.get("https://the-internet.herokuapp.com/javascript_alerts");
				
				
				
				
				
				driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
				
				Alert alertwindow = mywait.until(ExpectedConditions.alertIsPresent());
				
				alertwindow.accept();
				
				
				
				
			//	accept, dismiss, gettext();
				
				
				
		        
				
			   
		
			
				
				
				
				
				
				
				
				
				
				
				
			
				
            
				
	}
}
				
				
				
				
				
				
				
					  
					  
				  
					
				   
					
					
					
					
					
				
				
				
			
				
				
				
				
				
					 
					 
					 
					 
					 
				 
				 
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
						
					
				
				
				
				
				
				
				
				
				
				
				
				
				
				
					
				
				
			   

	


