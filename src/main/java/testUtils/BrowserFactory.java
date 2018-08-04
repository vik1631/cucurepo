package testUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import manager.FileReaderManager;

public class BrowserFactory {
	public static WebDriver driver=null;
	PropertyReader pr=new PropertyReader();
	
	public static WebDriver getInstance(String browserName) throws Exception{
		
		if(browserName.equalsIgnoreCase("chrome")){
System.setProperty("webdriver.chrome.driver", FileReaderManager.getInstance().getConfig().getDriverPath());
 if(driver==null){
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get(FileReaderManager.getInstance().getConfig().getAppUrl());
 }
 }
	return driver;	
		
		
	}

}
