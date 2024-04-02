package JavaScriptExecutor;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavaScript {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ankus\\Desktop\\chromedriver.exe");	
				driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.get("https://www.twoplugs.com/");
				driver.manage().window().maximize();
				Thread.sleep(3000);
				JavascriptExecutor js=(JavascriptExecutor) driver;
				WebElement login = driver.findElement(By.xpath("//header/div[1]/ul[1]/li[2]/a[1]"));
				AddBorderLine(login,driver);
				RefreshtheBrowser(driver);
				WebElement scroll = driver.findElement(By.xpath("//img[contains(@src,'newlayout/images/screen.png')]"));
				ScrollToView(scroll,driver);
				ClickOntheElement(login,driver);
				js.executeScript("document.querySelector('#signInEmail').value='priyanka'");
				js.executeScript("document.querySelector('#signInEmail').value");
				
				
				}
	
	
	public static void AddBorderLine(WebElement element, WebDriver driver) {
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='3px solid red'",element);
		
	}
	
	public static void RefreshtheBrowser(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("history.go[0]");
		
		
	}
	
	public static void ScrollToView(WebElement element, WebDriver driver) {
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
		
	}
	
	public static void ClickOntheElement(WebElement element, WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
		
		
	}
	
	
	public static void TitlePage(WebDriver driver) {
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		String title = js.executeScript("return document.title;").toString();
		System.out.println(title);
		
	}
	
	
	
	
	
	
	
	
	
	
	
}


