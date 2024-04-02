package CaptureScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshot {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//invoking browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ankus\\Desktop\\chromedriver.exe");	
				
				WebDriver driver = new ChromeDriver();
				
				//edgedriver driver1 = new edgedriver();
				
				//webdriver 100 methods 
				
				
				
				//yet
				//
				
				
				//webdriver 
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				
				//login 
				
				//logout
				
				//submit 
				
				driver.get("https://demo.nopcommerce.com/");
				driver.manage().window().maximize();
				
				///validating 
				
				
				TakesScreenshot ts = (TakesScreenshot) driver;
				File src = ts.getScreenshotAs(OutputType.FILE);
				
				File target=new File("C:\\Users\\ankus\\Documents\\Prathyusha\\Introduction\\fullpage.png");
				
				FileUtils.copyFile(src, target);
				
				
			
				
				
				
				
				
				
				
				
				
				
				

}

}