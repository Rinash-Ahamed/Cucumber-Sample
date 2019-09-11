package Runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import StepDefinition.LoginStepDefinition;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:Feature", glue = { "StepDefinition" }, monochrome = true, plugin = { "pretty",
		"html:target/cucumber-html-report", "json:target/cucumber-json-report.json" }, dryRun = false)

public class TestRunner extends LoginStepDefinition{
	
	@AfterClass
	public static void teardown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
}
