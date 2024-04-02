package MouseEvents;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightclickOperations {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//invoking browser
				System.setProperty("webdriver.chrome.driver","C:\\Users\\ankus\\Documents\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
			
				driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
				
				driver.manage().window().maximize();
				
				WebElement rightclick = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
				
				Actions act = new Actions(driver);
				
				//right click 
				act.contextClick(rightclick).build().perform();
				driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-copy']")).click();
				Thread.sleep(5000);
				driver.switchTo().alert().accept();
				
				
				
				
				
				
				
				
				
				
				
			
				
				
				

	}

}
