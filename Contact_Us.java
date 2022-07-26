package Contact_Us;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contact_Us {
	WebDriver driver;
	
	public Contact_Us(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@placeholder=\"Username\"]")
	WebElement User_Name;
	
	public WebElement User_Name() {
		
		return User_Name;
		
	}
	@FindBy(xpath="//input[@placeholder=\"Email\"]")
	WebElement Email;
	
	public WebElement Email() {
		
		return Email;
		
	}
	@FindBy(xpath="//input[@placeholder=\"Phone\"]")
	WebElement Phone;
	
	public WebElement Phone() {
		
		return Phone;
		
	}
	@FindBy(xpath="//textarea[@name=\"message\"]")
	WebElement Message;
	
	public WebElement Message() {
		
		return Message;
		
	}
	@FindBy(xpath="//input[@value=\"Send\"]")
	WebElement Send;
	
	public WebElement Send() {
		
		return Send;
		
	}


}
