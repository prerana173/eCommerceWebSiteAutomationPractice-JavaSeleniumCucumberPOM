package TestRunner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)				
@CucumberOptions(features="Features",glue={"StepDefinition"},plugin = { "pretty", "html:target/cucumber-reports" },monochrome=true)
public class Runner {

}
