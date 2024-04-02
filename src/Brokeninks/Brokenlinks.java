package Brokeninks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinks {
	
	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		
		//invoking browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ankus\\Desktop\\chromedriver.exe");	
				
				WebDriver driver = new ChromeDriver();
				
				driver.get("http://www.deadlinkcity.com/");
				
				
				//login 
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				List<WebElement> links = driver.findElements(By.tagName("a"));
				
				System.out.println(links.size());
				
				for(WebElement link:links) {
					
					String linkurl = link.getAttribute("href");
					
					URL url = new URL(linkurl);
					
					HttpURLConnection conn =(HttpURLConnection) url.openConnection(); 
					
					conn.connect();
					
					if(conn.getResponseCode()!=200) { 
						
						System.out.println("broken link");
						
					}else {
						
						System.out.println("valid link");
						
						
					}
					
					conn.disconnect();
					
					
				}
				
				
			
			
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			

				
				
				
				

}
	
}
