package manager;

import org.openqa.selenium.WebDriver;

import pages.AccessoriesFeedBack;

public class PageObjectManager {
private WebDriver driver;
private AccessoriesFeedBack accessFeedBack;

public PageObjectManager(WebDriver driver){
	this.driver=driver;
}

public AccessoriesFeedBack getAccessoriesFeedBack(){
	return(accessFeedBack==null)?accessFeedBack=new AccessoriesFeedBack(driver):accessFeedBack;
}
}

