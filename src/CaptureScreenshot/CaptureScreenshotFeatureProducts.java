package CaptureScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshotFeatureProducts {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//invoking browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ankus\\Desktop\\chromedriver.exe");	
				
				WebDriver driver = new ChromeDriver();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				driver.get("https://demo.nopcommerce.com/");
				driver.manage().window().maximize();
				
			WebElement Featureproduct = driver.findElement(By.xpath("//dic[@class='product-grid home-page-product-grid']"));
		File src = 	Featureproduct.getScreenshotAs(OutputType.FILE);
		
		File target = new File(("C:\\Users\\ankus\\Documents\\Prathyusha\\Introduction\\Screenshots\\featuredproduct.png"));
		
		
		
		
		FileUtils.copyFile(src, target);
			
				
				
				
				
				
				
				

}
	
}
