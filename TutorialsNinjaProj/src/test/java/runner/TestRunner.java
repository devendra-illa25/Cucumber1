package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//import org.junit.runner.RunWith;
//
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions; bcz we r usng testng

//@RunWith(Cucumber.class)

@CucumberOptions(
		features="src/test/resource/features",
		glue={"stepdefinitions","hooks"},
		tags="@all",
		//publish=true,
		//dryRun=false, // same like before
		//dryRun=true,	//by usng cucumber to check all the steps are executed or not
		plugin={"pretty",
				"html:target/CucumberReports/CucumberReport.html",
				"json:target/CucumberReports/CucumberReport.json",
				"junit:target/CucumberReports/CucumberReport.xml"}
				)
public class TestRunner extends AbstractTestNGCucumberTests {

	
}
