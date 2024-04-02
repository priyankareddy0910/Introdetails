package MouseEvents;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ankus\\Desktop\\chromedriver.exe");	
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		
		WebElement rome = driver.findElement(By.xpath("//div[@id='box6']"));
		WebElement italy = driver.findElement(By.xpath("//div[@id='box106']"));
		
		//a.dragAndDrop(rome, italy).build().perform();
		
		a.dragAndDrop(rome, italy).build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	}


