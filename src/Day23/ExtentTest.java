package Day23;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class ExtentTest {
	
	public ExtentSparkReporter sparkReporter;  
	public ExtentReports extent;  
	public ExtentTest extenttest;
	
	  //public ExtentReports extent = new ExtentReports();
	 //public  ExtentSparkReporter spark = new ExtentSparkReporter("Extentreport.html");
  @Test
  public void f1() {
	  
	  String timeStamp= new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		
		sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+ "/reports/"+timeStamp+".html"); 
		
		sparkReporter.config().setDocumentTitle("Rahul Shetty");
		sparkReporter.config().setReportName("Regression");
		sparkReporter.config().setTheme(Theme.STANDARD);
		
		extent=new ExtentReports();
		extent.attachReporter(sparkReporter);
		extent.setSystemInfo("ApplictionName","");
		extent.setSystemInfo("Environment","QA");
		extent.setSystemInfo("Tester Name","MOhan");
		extent.setSystemInfo("OS","Windows");
		extent.setSystemInfo("Browser name","Chrome");
	  
  }
  @Test		
  public void f2() {
	  
	  extent.createTest("verify");
	  
	 
	 
	  
	  
	  
	
  }
  @Test
  public void f3() {
	  
	  extent.createTest("Verify login");
	 
  }
  @Test
  public void f4() {
	  extent.createTest("Verify login");
	  
	 
  }
  @Test
  public void f5() {
	extent.createTest("Verify logout");
	
  }
  @Test
  public void f6(){
	  extent.createTest("verify event");
  }

  public void beforeTest() {
	  extent.createTest("hey verify");
  }

 
  public void afterTest() {
	  extent.flush();
	  
  }

}
