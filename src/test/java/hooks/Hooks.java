package hooks;

import org.openqa.selenium.OutputType;

import drivers.DriversInstance;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class Hooks extends DriversInstance{

	@BeforeStep
	public void beforeSteps(Scenario scenario) {
		scenario.log("Before Scenario Log Data");
	}
	
	@AfterStep
public void afterSteps(Scenario scenario) {
		scenario.log("After Scenario Log Data");
		
	}
	
	
	
	@Before
	public void beforeScenario(Scenario scenario) {
		String ss = scenario.getName();
		System.out.println("Scenario Name: " +ss);

	}

	@After
	public void afterScenario(Scenario scenario) {
		Boolean boo = scenario.isFailed();
		System.out.println("Is failed:" +boo);
		
		byte[] screenshots = driver.getScreenshotAs(OutputType.BYTES);
		scenario.embed(screenshots, "image/png");
		
		
	}

}
