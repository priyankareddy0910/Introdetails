import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
  System.setProperty("webdriver.chrome.driver","C:\\Users\\ankus\\Desktop\\chromedriver.exe");	
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(6000);
		
		Select newobj = new Select(driver.findElement(By.id("dropdown-class-example")));
	
		newobj.selectByValue("option1");
		//newobj.selectByIndex("1");
		//newobj.selectByVisibleText("Option1");
		
		
		
		//classname newobj = new classname();
		

	}

}
