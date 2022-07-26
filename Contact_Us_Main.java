package Contact_Us;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class Contact_Us_Main {
	
	@Test(dataProvider="get")
	public void signUp(String Un, String email, String phone, String message) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\akshay.dathathreya\\\\Documents\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mobileworld.azurewebsites.net/");
		driver.findElement(By.xpath("(//a[@id=\"navbarDropdown\"])[2]")).click();
		driver.findElement(By.xpath("//a[@onclick=\"openPopup()\"]")).click();
		Thread.sleep(2000);
		Set<String> window= driver.getWindowHandles();
		Iterator<String>it = window.iterator();
		String parentId=it.next();
		String childId=it.next();
		driver.switchTo().window(childId);
		driver.manage().window().maximize();
		
		
		Contact_Us CUS=new Contact_Us(driver);
		CUS.User_Name().sendKeys(Un);
		CUS.Email().sendKeys(email);
		CUS.Phone().sendKeys(phone);
		CUS.Message().sendKeys(message);
		CUS.Send().click();
		driver.close();
		
	

}
	@DataProvider(name="get")
	public Object[][] getData(){
Object[][] data=new Object[3][4];
		
		data[0][0]="Akshay";
		data[0][1]="Akshaykumar@gmail.com";
		data[0][2]="123456789";
		data[0][3]="Akshay$1999";
		
		
		
		data[1][0]="Kiran";
		data[1][1]="Kiran12345@gmail.com";
		data[1][2]="1234567890";
		data[1][3]="Kiran$1999";
		
		
		
		data[2][0]="Balaji";
		data[2][1]="Balajisanmugam@gmail.com";
		data[2][2]="234567890-";
		data[2][3]="Balaji$1999";
		
		return data;
	}
	
}
