package MouseEvents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tabsandwindows {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ankus\\Desktop\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.opencart.com/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		//driver.switchTo().newWindow(WindowType.TAB); //newtab
		
		driver.switchTo().newWindow(WindowType.WINDOW);//new window
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		

		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
	}

}
