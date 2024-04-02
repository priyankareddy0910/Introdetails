package Basic;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import JavaScriptExecutor.JavaScript;

public class ikea {
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\ankus\\Desktop\\chromedriver.exe");	
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ikea.com/in/en/new/");
		
		 //driver.navigate().to("");
		 
		 //driver.manage().timeouts().implicitlyWait(duration);
		 
		 
		 
		driver.manage().window().maximize();
	    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		Actions a = new Actions(driver);
		WebElement login = driver.findElement(By.xpath("//span[text()='Hej! Log in or sign up']"));
		a.moveToElement(login).click().build().perform();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[contains(text(),'Join IKEA Family')]")));
        driver.findElement(By.xpath("//h3[text()='Join IKEA Family']")).click();
		  //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("family-signup-form-firstName")));
          Thread.sleep(8000);
          driver.navigate().refresh();
		  System.out.println("element is visible");
		  driver.findElement(By.id("family-signup-form-firstName")).sendKeys("priyanka");
		  Thread.sleep(4000);
		  driver.findElement(By.xpath("//input[@id='family-signup-form-lastName']")).sendKeys("reddy");
		  driver.findElement(By.id("family-signup-form-birthDate")).sendKeys("05-01-1999");
		  Select s = new Select(driver.findElement(By.id("family-signup-form-genderCode")));
		 List<WebElement> data =  s.getOptions();
		  for(int i=0;i<data.size();i++) {
			 
			 String gender =  data.get(i).getText();
			 if(gender.equals("Female")) {
				 
				 data.get(i).click();
				 break;
				 
				 }
			  
			 }
		  WebElement element = driver.findElement(By.xpath("//input[@id='family-signup-form-zipCode']"));
		  JavascriptExecutor js =(JavascriptExecutor)driver;
		  js.executeScript("arguments[0].scrollIntoView(true);", element);
		  element.sendKeys("500062");
		  Select newobj = new Select(driver.findElement(By.id("family-signup-form-preferredStore")));
		  newobj.selectByValue("501");
		  driver.findElement(By.id("family-signup-form-phoneNumber")).sendKeys("7207799159");
		  driver.findElement(By.id("family-signup-form-email")).sendKeys("priyankareddy0910@gmail.com");
		  driver.findElement(By.id("family-signup-form-password")).sendKeys("Bhanu@123");
		  driver.findElement(By.xpath("//input[@id='family-signup-form-double-consent']")).click();
		  driver.findElement(By.xpath("//span[text()='Continue to phone verification']")).click();
		  
		 
		  
		  
		  
		  
		  
		  
			 
		 }
	

	}
	

