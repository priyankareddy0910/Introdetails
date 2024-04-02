package Login;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ankus\\Desktop\\chromedriver.exe");	
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		//HashMap newobj = new HashMap();
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("openwindow")).click();
		
		String parent = driver.getWindowHandle();
		
		System.out.println(parent);
		
		Set<String>  ids = driver.getWindowHandles();
		
		Iterator<String> its = ids.iterator();
		
		while(its.hasNext()) {
			
			String child =its.next();
			
			System.out.println(child);
			
			if(!parent.equals(child)) {
				
			System.out.println(driver.switchTo().window(child).getTitle());
			
			driver.close();
				
			
				
			}
			
		}
		
		
		
		 
		
		
		
		
		
		
		
		
		
	    		
	    	}
	    	
	    }
	    
	    
	    
	    
	    
	    
	  
	    

