package stepDefinations;

import org.testng.Assert;

import DriverThreadLocal.DriverThreadLocalClass;
import Pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {
	
	//private WebDriver driver = DriverThreadLocalClass.getDriver();
	public LoginPage lp = new LoginPage(DriverThreadLocalClass.getDriver());
	
	
	@Given("User Launch the application")
	public void user_launch_the_application() {
	   
		lp.launchURL();
		DriverThreadLocalClass.getTest().info("Application is launched");
		System.out.println("User Launched the Application");
	}
	
	@When("User the enter the username {string} and password {string} and click on submit button")
	public void user_the_enter_the_username_and_password_and_click_on_submit_button(String user, String pwd) {
	   
		lp.login(user, pwd);
		DriverThreadLocalClass.getTest().info("Username and password entered");
		DriverThreadLocalClass.getTest().info("Submit button is clicked");
	    System.out.println("User enterd username and password ");
	}
	
	@Then("User verify the dashboard")
	public void user_verify_the_dashboard() {
	  
		String dashboardName= lp.verifyDashboard();
	    System.out.println("User logged into the application");
	    DriverThreadLocalClass.getTest().info("Application is logged in successful");
	    Assert.assertEquals(dashboardName,"Dashboard");
	}


}
