package Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practise {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ankus\\Desktop\\chromedriver.exe");	
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.qaclickacademy.com/");
		
	    driver.manage().window().maximize();
	    
	    

}
	
}
