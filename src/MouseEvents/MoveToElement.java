package MouseEvents;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MoveToElement {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//invoking browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ankus\\Documents\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//	driver.getCurrentUrl("");
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		
		Thread.sleep(3000);
		WebElement desktops=driver.findElement(By.linkText("Desktops"));
		WebElement mac=driver.findElement(By.xpath("//a[contains(text(),'Mac (1)')]"));
		
		
		Actions act=new Actions(driver);
		
		//Mouse hover
		
		//act.moveToElement(desktops).moveToElement(mac).click().build().perform();// creating action then perform 
		act.moveToElement(desktops).moveToElement(mac).click().perform(); // directly performing action
		

	}
}
		


