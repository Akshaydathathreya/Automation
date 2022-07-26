package OrderBy;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class order {

	WebDriver driver;
    public order(WebDriver driver)
    {
        this.driver=driver;
           PageFactory.initElements(driver, this);
    }

       @FindBy(xpath="(//a[@id='navbarDropdown'])[2]")
       WebElement ddSupport;

       @FindBy(xpath="(//a[text()='Order'])[1]")
       WebElement btnOrder;

       @FindBy(xpath="(//input[@class=\"form-control\"])[1]")
       WebElement tbFname;

       @FindBy(xpath="(//input[@id='inputFirstName'])[2]")
       WebElement tbLastname;

       @FindBy(xpath="//input[@id='inputEmail']")
       WebElement tbEmail;

       @FindBy(xpath="//input[@id='inputPassword']")
       WebElement tbPassword;

       @FindBy(xpath="//input[@id='flexRadioDefault1']")
       WebElement rbGender;

       @FindBy(xpath="(//input[@type='number'])[1]")
       WebElement tbNumber;

       @FindBy(id=" address1")
       WebElement tbAddress1;

       @FindBy(id="address2")
       WebElement tbAddress2;

       @FindBy(id="inputCity")
       WebElement tbCity;

       @FindBy(id="inputZip")
       WebElement tbZip;

       @FindBy(xpath="//input[@rel='samsung']")
       WebElement cbSamsung;

       @FindBy(xpath="//input[@rel='apple']")
       WebElement cbApple;

       @FindBy(xpath="//input[@placeholder='no of mobiles']")
       WebElement tbCount;

       @FindBy(xpath="(//input[@id='gridCheck1'])[1]")
       WebElement cbCheck1;

       @FindBy(xpath="(//input[@id='gridCheck1'])[2]")
       WebElement cbCheck2;

       @FindBy(xpath="(//button[@type='button'])[1]")
       WebElement btnOrderNow;

       public WebElement clickSupport()
       {
           return ddSupport ;  
       }

       public WebElement clickOrder()
       {
           return btnOrder ;  
       }

       public WebElement getFirstName()
       {
           return tbFname ;  
       }

       public WebElement getLastName()
       {
           return tbLastname ;  
       }

       public WebElement getEmail()
       {
           return tbEmail ;  
       }

       public WebElement getPassword()
       {
           return tbPassword ;  
       }

       public WebElement getGender()
       {
           return rbGender ;  
       }

       public WebElement getNumber()
       {
           return tbNumber ;  
       }

       public WebElement getAddress1()
       {
           return tbAddress1 ;  
       }

       public WebElement getAddress2()
       {
           return tbAddress2 ;  
       }

       public WebElement getCity()
       {
           return tbCity ;  
       }

       public WebElement getZip()
       {
           return tbZip ;  
       }

       public WebElement getSamsungcb()
       {
           return cbCheck1 ;  
       }

       public WebElement getApplecb()
       {
           return cbCheck2 ;  
       }

       public WebElement getCount()
       {
           return tbCount ;  
       }

       public WebElement getCheck1()
       {
           return cbCheck1 ;  
       }

       public WebElement getCheck2()
       {
           return cbCheck2 ;  
       }

       public WebElement clickOrderNow()
       {
           return btnOrderNow ;  
       }

}
