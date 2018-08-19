/*
 * Author=Vignesh
 * 
 * 
 */
package stepdefs;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import manager.FileReaderManager;
import manager.PageObjectManager;
import pages.AccessoriesFeedBack;
import testUtils.BrowserFactory;
import testUtils.Credentials;

public class AccessoriesSteps extends BrowserFactory {
	
	private static final Logger log=Logger.getLogger("devpinoyLogger");
	 private PageObjectManager pom =null;
	 private AccessoriesFeedBack accessPages;
	

	
	 @Given("^I am at the accessories page$")
	public void i_am_at_the_accessories_page() throws Throwable {
	  String baseUrl=FileReaderManager.getInstance().getConfig().getAppUrl(); 
		log.debug("BaseUrl="+ baseUrl);
	    
	}

	@Given("^I scrolled down to acessories section$")
	public void i_scrolled_down_to_acessories_section() throws Throwable {
		if(pom==null){
		 pom=new PageObjectManager(driver);
		}
		 accessPages= pom.getAccessoriesFeedBack();
		 
		 accessPages.scrollToFeedBackSection();
	}

	@When("^I enter values in the fields$")
	public void i_enter_values_in_the_fields(List<Credentials> userCredentials) throws Throwable {
		for(Credentials credential:userCredentials ){
			accessPages.enterFirstName(credential.getFirstName());	
			accessPages.enterEmailAddress(credential.getemailAddress());
			accessPages.enterInfo(credential.getwhatsYourIdea());
		}
	
	}

	@When("^I checked the checkbox$")
	public void i_checked_the_checkbox() throws Throwable {
	   accessPages.checkTheBox();
	}

	@When("^I clicked on the send button$")
	public void i_clicked_on_the_send_button() throws Throwable {
	   accessPages.clickTheSendButton();	
	   }

	@Then("^I should see Thank you message$")
	public void i_should_see_Thank_you_message() throws Throwable {
accessPages.expectText().isDisplayed();
	}


	
	
	
	
	
	
	
	
	
	
	
	
	

}
