package MouseEvents;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//invoking browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ankus\\Desktop\\chromedriver.exe");	
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
				driver.manage().window().maximize();
				driver.switchTo().frame("iframeResult");
				Actions a = new Actions(driver);
				a.doubleClick(driver.findElement(By.xpath("//button[text()='Copy Text']"))).build().perform();
				

				
				
				
				
				
				
				
				
				
				

	}

}
