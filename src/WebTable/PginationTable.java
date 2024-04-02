package WebTable;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PginationTable {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		//invoking browser
				System.setProperty("webdriver.chrome.driver","C:\\Users\\ankus\\Documents\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
			
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				driver.get("https://demo.opencart.com/admin/index.php");
				driver.manage().window().maximize();
				
				//Login
				WebElement username=driver.findElement(By.id("input-username"));
				username.clear();
				username.sendKeys("demo");  //demo
						
				WebElement password=driver.findElement(By.id("input-password"));
				password.clear();
				password.sendKeys("demo"); //demo
						
				driver.findElement(By.xpath("//button[text()=' Login']")).click();
				
				if(driver.findElement(By.xpath("//button[@class='btn-close']")).isDisplayed())
				{
					driver.findElement(By.xpath("//button[@class='btn-close']")).click();
				}
				
				//Customers--->customers
				
				driver.findElement(By.xpath("//a[@class='parent collapsed'][normalize-space()='Customers']")).click();
				driver.findElement(By.xpath("//ul[@class='collapse show']//a[contains(text(),'Customers')]")).click();
				String text = driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();
				
				System.out.println(text);
				
				//"Showing 1 to 10 of (1491 Pages)"
				
				
				int total_pages = Integer.parseInt(text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1));
				
				System.out.println(total_pages);
				
				for(int p=1;p<=5;p++) {
					
				
				if(total_pages>1) {
					
					WebElement activepage = driver.findElement(By.xpath("//ul[@class='pagination']//li//*[text()="+p+"]"));
					 
					System.out.println(activepage.getText());;
					
					Thread.sleep(3000);
					
					
				}
				
				int noofrows = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
	        			
				for(int r=1;r<=noofrows;r++) {
					
					String customername = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr["+r+"]//td[2]")).getText();
					 
					String customerEmail = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr["+r+"]//td[3]")).getText();
					 String status = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr["+r+"]//td[5]")).getText();
					 
					 
					 System.out.println(customername+"                 "+customerEmail+"              "+status);
					
					
					
					
				}
				
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	}
	
}