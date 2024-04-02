package BrowserMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ankus\\Documents\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.navigate().to("https://www.google.com");
		
		
		
		driver.manage().window().maximize();
		
		System.out.println("title of the page:"+driver.getTitle());//title
		
		System.out.println("Current url is:"+driver.getCurrentUrl());//current url 
		
		
		//System.out.println("pagesource....................");
		
		//String ps = driver.getPageSource();	
		   
		   //System.out.println(ps);
		   
		   //System.out.println(ps.contains("html"));
		   
		   //WebElement data = driver.findElement(By.xpath("name"));
		   
		   System.out.println(driver.getWindowHandle());//
		  		 
		   Thread.sleep(3000);
		   
		   driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		   
		   Set<String> windowids = driver.getWindowHandles();
		   
		   for(String id:windowids) {
			   
			   System.out.println(id); // two ids 
			  
			   
		   }
	
		   }
		   
		   
		   
		   
		  
		   
		   
		   
		   
		   
		   
		   
		   
		  
		
		
		
		
		 
		
		
	    
		
			
		
		
		
		
		
		
		
		
		

	}


