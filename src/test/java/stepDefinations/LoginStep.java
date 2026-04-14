package stepDefinations;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import DriverThreadLocal.DriverThreadLocalClass;
import Pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {
	
	//private WebDriver driver = DriverThreadLocalClass.getDriver();
	public LoginPage lp = new LoginPage(DriverThreadLocalClass.getDriver());
	ExtentTest test = DriverThreadLocalClass.gettest();
	
	@Given("User Launch the application")
	public void user_launch_the_application() {
	   
		lp.launchURL();
		test.info("");
		test.log(Status.FAIL, "Step is passed");
	
		System.out.println("User Launched the Application");
	}
	
	@When("User the enter the username {string} and password {string} and click on submit button")
	public void user_the_enter_the_username_and_password_and_click_on_submit_button(String user, String pwd) {
	   
		lp.login(user, pwd);
		test.info("Username and password entered");
		test.info("Submit button is clicked");
	    System.out.println("User enterd username and password ");
	}
	
	@Then("User verify the dashboard")
	public void user_verify_the_dashboard() {
	  
		String dashboardName= lp.verifyDashboard();
	    System.out.println("User logged into the application");
	    test.info("Application is logged in failed"); 
	    test.log(Status.FAIL, "Step is failed");
	    Assert.assertEquals(dashboardName,"Dashboard1");
	    

	}
}
