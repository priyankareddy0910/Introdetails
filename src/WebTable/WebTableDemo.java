package WebTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ankus\\Desktop\\chromedriver.exe");	
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		WebElement Table = driver.findElement(By.xpath("//table[@class='table-display']"));
		
		List<WebElement> rows = Table.findElements(By.tagName("tr"));
		
		
		
		for(int i=1;i<rows.size();i++) {
			
		String data = rows.get(i).getText();
		
		System.out.println(data);
			
		}
		
		
		List<WebElement> columns = Table.findElements(By.tagName("th"));
		
		for(int j=0;j<columns.size();j++) {
			
			String datas = columns.get(j).getText();
			
			System.out.println(datas);
			
		}
		
		
		
		
		
		
		

	}

}
