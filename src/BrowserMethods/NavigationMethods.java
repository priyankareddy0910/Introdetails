package BrowserMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ankus\\Documents\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		
		driver.get("https://www.ikea.com/in/en/new/");  //facebook
		driver.navigate().to("https://www.ikea.com/in/en/new/");//google
		
		
		
		
		
		
		
		
		
		

}
	
}

