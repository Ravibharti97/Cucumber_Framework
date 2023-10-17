package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {".//Features/Items.feature"},
		glue= {"stepDefinations"},
		dryRun = false,
		monochrome=true,
//		tags= "@A3",
		plugin= {"pretty","html:test-output", "json:target/cucumber.json"}
		
		
		)

public class TestRun {
	

}
