package Contact_Us;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Home_page {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshay.dathathreya\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mobileworld.azurewebsites.net/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//Locating element by link text and store in variable "Element"        		
        WebElement Home = driver.findElement(By.xpath("//a[text()=\"Home\"]"));

        // Scrolling down the page till the element is found		
        js.executeScript("arguments[0].scrollIntoView();", Home);
        Home.click();
        String msg=driver.findElement(By.xpath("//h1[text()=\"Welcome To Our Mobile World!\"]")).getText();
        String Home1=driver.getTitle();
        System.out.println(Home1);
        Assert.assertEquals(msg, "Welcome To Our Mobile World!");
        Thread.sleep(2000);
        js.executeScript("window.history.go(-1)");
        
        WebElement Mobile = driver.findElement(By.xpath("//a[text()=\"Mobiles\"]"));

        // Scrolling down the page till the element is found		
        js.executeScript("arguments[0].scrollIntoView();", Mobile);
        Mobile.click();
        String msg1=driver.findElement(By.xpath("//b[text()=\"All Mobile Details\"]")).getText();
        String Mobile1=driver.getTitle();
        System.out.println(Mobile1);
        Assert.assertEquals(msg1, "All Mobile Details");
        Thread.sleep(2000);
        js.executeScript("window.history.go(-1)");
        
        
        WebElement sign =driver.findElement(By.xpath("//a[text()=\"Sign In\"]"));
        js.executeScript("arguments[0].scrollIntoView();", sign);
        sign.click();
        String msg2=driver.findElement(By.xpath("//label[text()=\"Username / Email\"]")).getText();
        String Signin=driver.getTitle();
        System.out.println(Signin);
        Assert.assertEquals(msg2, "Username / Email");
        Thread.sleep(2000);
        js.executeScript("window.history.go(-1)");
        
        
        WebElement terms=driver.findElement(By.xpath("//a[text()=\"Terms & Conditions\"]"));
        js.executeScript("arguments[0].scrollIntoView();", terms);
        terms.click();
        String msg3=driver.findElement(By.xpath("//h3[text()=\"Terms and Conditions\"]")).getText();
        String TaC=driver.getTitle();
        System.out.println(TaC);
        Assert.assertEquals(msg3, "Terms and Conditions");
        Thread.sleep(2000);
        js.executeScript("window.history.go(-1)");
        
        
        WebElement privecy=driver.findElement(By.xpath("//a[text()=\"Privacy Policy\"]"));
        js.executeScript("arguments[0].scrollIntoView();", privecy);
        privecy.click();
        String msg4=driver.findElement(By.xpath("//b[text()=\"Privacy Policy\"]")).getText();
        String PP=driver.getTitle();
        System.out.println(PP);
        Assert.assertEquals(msg4, "Privacy Policy");
        Thread.sleep(2000);
        js.executeScript("window.history.go(-1)");
        
        
        
        driver.findElement(By.xpath("(//a[text()=\"Contact Us\"])[2]")).click();
        Set<String> window= driver.getWindowHandles();
		Iterator<String>it = window.iterator();
		String parentId=it.next();
		String childId=it.next();
		driver.switchTo().window(childId);
		Thread.sleep(2000);
		String msg5=driver.getTitle();
		System.out.println(msg5);
		 Assert.assertEquals(msg5, "Contact");
		 driver.close();
		 driver.switchTo().window(parentId);
		 
		 
		 
		 List<WebElement> a=driver.findElements(By.xpath("//a[text()=\"More Details\"]"));
		 for(int i=0;i<=8;) {
			 a.get(i).click();
			 Thread.sleep(2000);
			 js.executeScript("window.history.go(-1)");
			 Thread.sleep(2000);
			 i++;
			 
		 }
		 
 

		  
		 }
		
	}


