package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"./src/test/resources/Features/RvgOpg.feature"},
					glue = {"RvgOpgStep"},
					dryRun = false,
					monochrome = true, 
		        //    tags= "@tag3",
					plugin = {
									"pretty", 
									"html:target/cucumber-reports/report1.html" })
public class Run {

}

