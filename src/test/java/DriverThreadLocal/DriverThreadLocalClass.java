package DriverThreadLocal;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class DriverThreadLocalClass {
	
	private static WebDriver driver;
	// Create Reporter
	public static ExtentSparkReporter spark = new ExtentSparkReporter("C:\\Practice\\TestAutomation_TestNg\\test-output\\ExtentReport\\extentreport.html");
	// Create ExtentReports instance
    public static ExtentReports extent;
    public static ExtentTest test;
   //	private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    
    
    public static ExtentTest gettest() {
    	
    	extent = new ExtentReports();
    	extent.attachReporter(spark);
    	test = extent.createTest("test started");
    	return test;
    }
    
    public static void flushtest()
    {
    extent.flush();
    }

	
	  public static void setDriver()//(String browser)
	   {
		   
		   driver = new ChromeDriver();//.set(new ChromeDriver());
		 
//	switch (browser) {
//		case "chrome":
//			
//			driver.set(new ChromeDriver());
//			break;
//		case "edge" :
//			
//			driver.set(new EdgeDriver());
//			break;
//		case "fireFox":
//			
//			driver.set(new FirefoxDriver()); 
//			break;
//		default:
//			break;
//		}
//		   driver.get().manage().window().maximize();
//		   driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		   
//		
		   driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   }
	   
	  
	   public static WebDriver getDriver()
	   {
		  setDriver();
		  return driver ;//.get();
	   }
	   
	   public static void quitdriver()
	   {
		   driver.quit();
	   }

	   
	   
	   
}
