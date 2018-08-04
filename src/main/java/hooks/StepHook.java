package hooks;

import org.openqa.selenium.WebDriver;

import cucumber.api.Scenario;

public class StepHook {
	
	private Scenario scenario=null;;
	
	private WebDriver driver=null;
	
	public StepHook(ScenarioHooks scenarioHook){
		scenario=scenarioHook.getScenario();
		driver=scenarioHook.getWebdriver();
	}

}
