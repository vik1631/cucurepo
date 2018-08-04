package hooks;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import manager.FileReaderManager;
import testUtils.BrowserFactory;

public class ScenarioHooks {

	private static Logger log=Logger.getLogger("devpinoyLogger");
	public Scenario scenario;
	public WebDriver driver;
	
	@Before
	public void beforeScenario(Scenario scenario) throws Throwable{
		this.scenario=scenario;
		
		log.info("BEGIN TEST"+scenario.getName());
		String browserConfig=FileReaderManager.getInstance().getConfig().getBrowser();
		driver=BrowserFactory.getInstance(browserConfig);
		log.info("Browser:"+browserConfig);
	}
	
	@After
	public void afterScenario(){
		log.info("END TEST->"+scenario.getName()+" - "+scenario.getStatus());
		driver.quit();
	}
	
	public Scenario getScenario(){
		return scenario;
	}
	
	public WebDriver getWebdriver(){
		return driver;
	}
	
}
