import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericWindowHandles {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ankus\\Desktop\\chromedriver.exe");	
	
	driver = new ChromeDriver();
	driver.get("https://www.orangehrm.com/en/book-a-free-demo/");
	driver.manage().window().maximize();
	String Parentid =driver.getWindowHandle();
	JavascriptExecutor js =(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.linkText("CS & Support")));
	//js.executeScript("window.scrollBy(0,150)");
	driver.findElement(By.linkText("CS & Support")).click();
	driver.findElement(By.linkText("Our Partners")).click();
	driver.findElement(By.linkText("Testimonials")).click();
	driver.findElement(By.linkText("OrangeHRM API")).click();
     Set<String> ids = driver.getWindowHandles();
     ArrayList<String> ylist = new ArrayList(ids);
    if(switchToRightWindow("HR Software Customer Reviews",ylist)) {
    	System.out.println(driver.getCurrentUrl()+" : "+driver.getTitle());
    	
    }
    
    SwitchToParentid(Parentid);
    CloseAllChildWindows(ylist,Parentid);
    
    
    
     
   }
	
	public static void SwitchToParentid(String Parentid) {
		
		driver.switchTo().window(Parentid);
		
		System.out.println(driver.getCurrentUrl()+" : "+driver.getTitle());
		
		
		
	}
	
	public static void Quit() {
		
		driver.quit();
		
	}
	
	
	
	public static void CloseAllChildWindows(ArrayList<String> ylist ,String Parentid) {
		
		for(String e:ylist) {
			
			if(!e.equals(Parentid)) {
				
				driver.switchTo().window(e).close();
				
			}
			
		}
		
		
		
	}
	
	
	
	
	public static  boolean switchToRightWindow(String windowTitle, ArrayList<String> ylist) {
		
		for(String e:ylist) {
			
			String title =driver.switchTo().window(e).getTitle();
			if(title.contains(windowTitle)) {
				
				System.out.println("we are on the right page");
				
				return true;
				
			}
			
			
		}
		return false;
		
	}
	
	
	
}
