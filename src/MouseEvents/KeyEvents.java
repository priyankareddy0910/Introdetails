
package MouseEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyEvents {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ankus\\Desktop\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		
driver.get("https://text-compare.com/");
		
		driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("WELCOME TO AUTOMATION"); // welcome  to Automation 
		
		Actions act=new Actions(driver);
		
		act.moveToElement(driver.findElement(By.xpath("//textarea[@id='inputText1']"))).build().perform();
		
		//WebElement data = driver.findElement(By.xpath("//textarea[@id='inputText1']"));
	   act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform(); //control A
		
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform(); //control c 
		
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	






		
		
		

}
	

