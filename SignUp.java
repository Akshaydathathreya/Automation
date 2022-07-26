package Sign_Up;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUp {
	WebDriver driver;
	
	public SignUp(WebDriver driver) {
		this.driver=driver;
	}
	
	By FirstName=By.id("myName");
	By LastName =By.xpath("//input[@placeholder=\"Last Name\"]");
	By Email =By.xpath("//input[@placeholder=\"Enter Email\"]");
	By Password=By.xpath("//input[@placeholder=\"Password\"]");
	By Number =By.xpath("//input[@type=\"number\"]");
	By bio =By.xpath("//*[@id=\"myForm\"]/div[5]/div[2]/textarea");
	
	
	public WebElement getFirstName() {
		
		return driver.findElement(FirstName);
		
	}
public WebElement getLastName() {
		
		return driver.findElement(LastName);
		
	}
public WebElement getEmail() {
	
	return driver.findElement(Email);
	
}
public WebElement getPassword() {
	
	return driver.findElement(Password);
	
}
public WebElement getNumber() {
	
	return driver.findElement(Number);
	
}
public WebElement getBio() {
	
	return driver.findElement(bio);
	
}
	

}
