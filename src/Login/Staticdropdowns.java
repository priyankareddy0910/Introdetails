package Login;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Staticdropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ankus\\Desktop\\chromedriver.exe");	
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		//List<WebElement> options = driver.findElements(By.id("dropdown-class-example"));
		
		Select s= new Select(driver.findElement(By.id("dropdown-class-example")));
		
     driver.findElement(By.id("dropdown-class-example")).findElement(By.xpath("//option[@value='option1']")).click();
		
	  // for(int i=0;i<options.size();i++) {
		   
		 // String option =  options.get(i).getText();
		  
		  //System.out.println(option);
		   
		   
	   }
		
		
		
	   
	     }
	    
	//}
	

	     
	    
	    
		
		
		
		
		
	
	
		
		
		
		
		
		
	
		
		
		
				
			
			
	
		
		
		
	   
	    		 
	    		 
	    	 
	    	
	    	 
	    	
	
		
		
		
		
		
		
		
	


