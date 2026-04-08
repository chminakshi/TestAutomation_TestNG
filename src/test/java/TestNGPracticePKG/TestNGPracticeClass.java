package TestNGPracticePKG;
import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGPracticeClass {
	
	
	
	private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	
	
	@BeforeMethod
	@Parameters("browser")
	
	public void launchApplication(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
	    driver.set(new  ChromeDriver());
		driver.get();
		driver.get().get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get().manage().window().maximize();
		
		}else if (browser.equalsIgnoreCase("firefox")) {
			
			 driver.set(new EdgeDriver());
			driver.get();
			driver.get().get("https://rahulshettyacademy.com/AutomationPractice/");
			driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get().manage().window().maximize();
				
			
		}
		
	}
	
	
	@Test
	public void radiobutton() throws InterruptedException {

		driver.get().findElement(By.cssSelector("[value='radio1']")).click();
		driver.get().findElement(By.cssSelector("[value='radio2']")).click();
		driver.get().findElement(By.cssSelector("[value='radio3']")).click();
		System.out.println("This is Chandra34");
	}

	@Test
	public void selectdropdown() {

		driver.get().findElement(By.cssSelector("input#autocomplete")).click();
		driver.get().findElement(By.cssSelector("input#autocomplete")).sendKeys("Ind");
		driver.get().findElement(By.xpath("//div[text()='India']")).click();

	}
	
	
	
	@AfterMethod
	
	public void tearDown()
	{
	  driver.get().quit();
	}

}
