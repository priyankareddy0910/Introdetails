package Login;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ankus\\Desktop\\chromedriver.exe");	
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.id("name")).sendKeys("priyanka");
	    Thread.sleep(6000);
	    driver.findElement(By.id("alertbtn")).click();
	    Thread.sleep(4000);
	   System.out.println(driver.switchTo().alert().getText());
	    driver.switchTo().alert().accept();
	    
	    
	    
	    

	}

}
