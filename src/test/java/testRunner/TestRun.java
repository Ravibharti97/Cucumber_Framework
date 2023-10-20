package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {".//Features/Login.feature"},
		glue= {"stepDefinations"},
		dryRun = false,
		monochrome=true,
		tags= "@A3",
		plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
//		plugin= {"pretty","html:target/cucumber-reports/cucumber.html"}
//		
//		"json:Reports/cucumber-report-json", 
//		 "json:target/cucumber-reports/cucumber2.json"
		
		
		
		)

public class TestRun {
	

}
