package runner;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import DriverThreadLocal.DriverThreadLocalClass;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features ="src/main/resources/features/",
		glue = "stepDefination",
		monochrome = true,
		plugin= {"pretty","html:target/Cucumberreport.html"}  
		)

public class TestRunner1 extends AbstractTestNGCucumberTests{
	@BeforeClass
	@Parameters("browser")
	public void setDriver(String browser)
	{
		//DriverThreadLocalClass.setDriver(browser);
	}

	
}



