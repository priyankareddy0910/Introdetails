import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
  System.setProperty("webdriver.chrome.driver","C:\\Users\\ankus\\Documents\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("inputUsername")).sendKeys("priyanka");
		
		driver.findElement(By.name("inputPassword")).sendKeys("abcd");
		
		driver.findElement(By.className("signInBtn")).click();
		
		
		
		
		
		
		
		

	}

}
