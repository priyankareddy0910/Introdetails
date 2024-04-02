package Frames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		//invoking browser
				System.setProperty("webdriver.chrome.driver","C:\\Users\\ankus\\Documents\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://jqueryui.com/droppable/");
				
				//driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
				
				//driver.switchTo().frame(0);
				
				
				//driver.switchTo().frame(nameOrId)
				
			   int frames = driver.findElements(By.tagName("iframe")).size();
			   
			   
			   System.out.println(frames);
			   
			   driver.switchTo().defaultContent();
			   
			  System.out.println();
			   
			   
				
				
				
				
				
				
				
				

				
				
				
			
		
	}




	}


