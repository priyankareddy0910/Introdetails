package Windowhandle;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class window {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ankus\\Documents\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

Thread.sleep(5000);
		WebElement button = driver.findElement(By.xpath("//button[@id='newWindowBtn']"));
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",button);
		button.click();
		
		String parentwindow = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		
		
		
		for(String handle:handles) { //handle has only two ids parent and child , if handle is not equal to parent 
			
			System.out.println(handle);
			
			if(!handle.equals(parentwindow)) {
				
				driver.switchTo().window(handle);
				
				driver.manage().window().maximize();
				
				driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("priyanka");	
				
				driver.close();
				
			
			}
		}
	}
}
			
			
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		 
	
	      
	    
	
	


