package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(features = {"src/test/java/features/" }, 
dryRun = !true, 
glue = {"steps", "hooks"},
snippets = SnippetType.CAMELCASE, 
monochrome = true, 
plugin = {
"pretty", "html:reports", "json: reports/result.json",
"junit: reports/reslts.xml" } 
//tags = "not @stg,"
)

public class Runner extends AbstractTestNGCucumberTests {

}
