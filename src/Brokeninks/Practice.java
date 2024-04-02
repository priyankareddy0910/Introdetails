package Brokeninks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ankus\\Desktop\\chromedriver.exe");
		

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(@href,'error-page.asp?e=400')]")).click();
		
		driver.navigate().back();
		
		driver.navigate().forward();
		

		
		

	}

}
