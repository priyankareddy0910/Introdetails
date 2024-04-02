import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandles {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\ankus\\Desktop\\chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2017/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()=' Click here for Google ']")).click();
		driver.findElement(By.xpath("//a[text()=' Click here for Facebook ']")).click();
		driver.findElement(By.xpath("//a[text()=' Click here for Gmail ']")).click();
		Set<String> ids =driver.getWindowHandles();
		Iterator its =ids.iterator();
		while(its.hasNext()) {
			String parent=(String) its.next();
			String child=(String) its.next();
			driver.switchTo().window(child);
			System.out.println(driver.getTitle());
			driver.switchTo().defaultContent();
			System.out.println(driver.getTitle());
			
			
		}
	   
	  
	}

}
