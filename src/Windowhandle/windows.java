package Windowhandle;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windows {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ankus\\Documents\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://accounts.google.com/signup");
	    driver.findElement(By.xpath("//a[contains(text(),'Help')]")).click();
	    System.out.println(driver.getTitle());
	    
	     
	      
	      //Iterator 
	      String parent = driver.getWindowHandle(); //id
	      
	      Set<String> ids  = driver.getWindowHandles();//ids parent window - id , child window - id
	      
	      Iterator<String>its = ids.iterator();
	      
	      while(its.hasNext()) {
	    	  
	    	 String child = its.next();
	    	
	    	 
	    	 if(!parent.equals(child)) {
	    		 
	    		 driver.switchTo().window(child);	 
	    		 
	    		 System.out.println(driver.getTitle());
	    		 
	    		 driver.close();
	    		 
	    	 }
	    	  
	    	  
	    	  
	      }
	      
	      driver.switchTo().window(parent);
	      
	      
	      
	     
	     
	      
	      
	      
	     
	      
	      
	    
	    
	    
	    
		
		
		
		
		
		
		
		
	}
}

		
		