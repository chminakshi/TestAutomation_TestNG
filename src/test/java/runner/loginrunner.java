package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@ CucumberOptions(
		features = "src/main/resource",
		glue = {"Hooks","stepDefinations"} ,
		plugin = {"pretty","html:target/cucumber.html"}
        )  

public class loginrunner extends AbstractTestNGCucumberTests{

}
