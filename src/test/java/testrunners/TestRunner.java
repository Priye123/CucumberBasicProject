package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:reports/cucumber-reports/cucumber.html",
		"json:target/jsonReports/cucumber.json" }, features = {
				"src/test/java/AppFeatures" }, glue = "stepDefinitions", stepNotifications = true

)
public class TestRunner {

}
