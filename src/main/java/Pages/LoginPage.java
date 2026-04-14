package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import DriverThreadLocal.DriverThreadLocalClass;

public class LoginPage {
	  private WebDriver driver;
		
		public LoginPage(WebDriver driver)
		{
		this.driver= driver;
		PageFactory.initElements(driver,this);
		}
		
		@FindBy(name="username")
		private WebElement username;
		
		@FindBy(name="password")
		private WebElement password;
		
		@FindBy(xpath="//button[@type='submit']")
		private WebElement submit;
		
		@FindBy(css="h6[class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
		private WebElement dashboardname; // By.cssSelector("h6[class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']");
		
		
	
		public void launchURL()
		{
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		}
		public void login(String username1 , String password1)
		{
		 username.sendKeys(username1); 
		 password.sendKeys(password1);
		 submit.click();
		}
		
		public String verifyDashboard()
		{
			return dashboardname.getText();
		}
		 

}
