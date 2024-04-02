import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assertions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      System.setProperty("webdriver.chrome.driver","C:\\Users\\ankus\\Documents\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	   
		driver.get("https://rahulshettyacademy.com/AutomationPractice/"); // load the url 
		
		driver.manage().window().maximize();//maxixmize
		WebElement element = driver.findElement(By.xpath("//button[contains(text(),'Home')]"));
		String ExpectedText = "me";
		Assert.assertEquals(element.getText(), ExpectedText);
	
		System.out.println("passed");
		driver.quit();
		
		
		
		
		
		
		   

	}

}
