package Login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ankus\\Desktop\\chromedriver.exe");	
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
	    driver.manage().window().maximize();
	    
	   
	   WebElement Radio =  driver.findElement(By.xpath("//input[@value='radio2']"));
	    
	    if(Radio.isDisplayed()&& Radio.isEnabled()) {
	    	
	    	System.out.println("radio button is enabled and displayed");
	    	
	    }
	    
	    if(!Radio.isSelected() && Radio.isEnabled()) {
	    	
	    	Radio.click();
	    	
	    	System.out.println("Radio button is selected");
	    	
	    }
	    

	    
	    
	    
	    
	
			 
		
			 
		 }
		 
		 
		 
	 
	  
	  
	    
	    

	}


