package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AccessoriesFeedBack {
	WebDriver driver;
	
	@FindBy(how=How.XPATH, using="html/body/div/main/section[3]")
	private WebElement topOfFeedBackForm;
	
	@FindBy(how=How.CSS, using="input[name='firstName']")
	private WebElement firstName;
	
	@FindBy(how=How.CSS, using="input[class='input-field required'][name='email']")
	private	WebElement email;
	
	@FindBy(how=How.CSS, using="textarea[name='addInfo']")
	private WebElement whatsYourIdea;
	
	@FindBy(how=How.CSS, using="label[for='newsletter']")
	private WebElement newsLetterCheckbox;
	
	@FindBy(how=How.CSS, using="button[class='btn btn-primary']")
	private WebElement sendButton;
	
	@FindBy(how=How.XPATH, using="html/body/div/main/section[3]/div/div/h2")
	WebElement assertText;
	
	public AccessoriesFeedBack (WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	public void scrollToFeedBackSection(){
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		  jse.executeScript("arguments[0].scrollIntoView(true);",topOfFeedBackForm );
	}
	
	
	public void enterFirstName(String firstname){
		firstName.sendKeys(firstname);
	}
	
	public void enterEmailAddress(String emailAddress){
		email.sendKeys(emailAddress);
	}
	
	public void enterInfo(String info){
		whatsYourIdea.sendKeys(info);
	}
	
		public void checkTheBox(){
			newsLetterCheckbox.click();
		}
		
		public void clickTheSendButton(){
			sendButton.click();
		}
		
		public WebElement expectText(){
			return assertText;
		}
}
