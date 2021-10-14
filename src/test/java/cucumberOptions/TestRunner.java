package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//dryrun: en vez de mostrar casos en failed, los mustra como skipped

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features",
		glue="stepDefinitions", 
		tags="@SeleniumTest",
		monochrome=true,
		plugin= {"pretty", "html:target/cucumber.html", "json:target/cucumber.json", "junit:target/cucumber.xml"})
public class TestRunner {

}
