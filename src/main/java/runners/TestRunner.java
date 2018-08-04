package runners;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/Features"} , glue={"stepdefs", "hooks"}, plugin = {
		"pretty", "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-html-extent/report.html",
		"html:target/cucumber-html-default", "json:target/cucumber-report.json",
		"junit:target/cucumber-report.xml" })
public class TestRunner {

	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
		Reporter.setSystemInfo("user", System.getProperty("user.name"));
		Reporter.setSystemInfo("os", System.getProperty("os.name"));
		Reporter.setTestRunnerOutput("Sample test runner output message");
	}
		

}  