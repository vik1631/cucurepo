package testUtils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;



public class PropertyReader {

	
	Properties pro=new Properties();
	
	public PropertyReader(){
		try{
		File src=new File("src//main//java//configuration//config.properties");
	
		FileInputStream fis=new FileInputStream(src);
		pro.load(fis);
	}
		catch(Exception e){
			System.out.println("NO SUCH FILE");
		}
}
	
	public String getDriverPath() throws Exception{
		String driverPath=pro.getProperty("driverPath");
		if(driverPath!=null)
			return driverPath;
		else throw new Exception("driverPath is not specified in configuration file");
		}
	
	public String getAppUrl() throws Exception{
		String appUrl=pro.getProperty("appUrl");
		if(appUrl!=null)
			return appUrl;
		else throw new Exception("AppUrl is not specified in configuration file");
		
		
	}
	
	public String getBrowser() throws Exception{
		String browser=pro.getProperty("browser");
		if(browser!=null)
			return browser;
		else throw new Exception("browser is not specified in configuration file");
		
		
	}
	
}
	