package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(glue={"StepDefinition","Hooks"}, features = "../Automation_Practice/src/test/java/Fetaures/DemoQA.feature",
          plugin = {"pretty","html:target/cucumber/report/html"}, dryRun = false  
		)
public class RunnerClass {

	
} 
