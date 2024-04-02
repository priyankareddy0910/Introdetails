import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplewindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ankus\\Desktop\\chromedriver.exe");	
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id='openwindow']")).click();
		String parentwindow = driver.getWindowHandle();
	    Set<String> ids = driver.getWindowHandles();
	    
	    Iterator<String>  its = ids.iterator();
	
	    
	    
	while(its.hasNext()) {
		
		String window =its.next();
		
		driver.switchTo().window(window);
		System.out.println(driver.getTitle());
		
	}
	    
	     
	    
	     
	  
	 
		
		

	}

}
