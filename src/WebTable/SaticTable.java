package WebTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SaticTable {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//invoking browser
		        System.setProperty("webdriver.chrome.driver","C:\\Users\\ankus\\Desktop\\chromedriver.exe");	
				
				WebDriver driver = new ChromeDriver();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

				driver.get("https://testautomationpractice.blogspot.com/");
				
				driver.manage().window().maximize();
				
				int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
				
				System.out.println("Number of rows are" + rows);
				
				int columns = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
				
				System.out.println("Number of columns are" + columns);
				
				
				String data = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[2]")).getText();
				
				System.out.println(data);
				
				System.out.println("Bookname"+"    "+"Author"+"   "+"Subject"+"  "+"Price");
				for(int r=2;r<=rows;r++ ) {
					
					for(int c=1;c<=columns;c++) {
						
						String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
						
						System.out.print(value+" ");
						
					}
					
					System.out.println();
					
					
				}
				
			}

		}



