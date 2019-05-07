package stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/AddCustomer.feature",glue= {"stepdefinition"},plugin= {"html:target1"},dryRun=false)

public class TestRunner {

}
