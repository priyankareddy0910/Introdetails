package JavaScriptExecutor;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollPage {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		//invoking browser
				System.setProperty("webdriver.chrome.driver","C:\\Users\\ankus\\Documents\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
				driver.manage().window().maximize();	
				
				JavascriptExecutor js=(JavascriptExecutor) driver;
				
				//js.executeScript("window.scrollBy(0,1000)", "");
				
				WebElement flag = driver.findElement(By.xpath("//img[@alt='Flag of India']"));
			
				
				js.executeScript("arguments[0].scrollIntoView();", flag);
				Thread.sleep(6000);
				
				js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
				
				
				
				
				
				
				
				
				
				
			}

		}
