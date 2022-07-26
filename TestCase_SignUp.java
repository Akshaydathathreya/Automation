package Sign_Up;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCase_SignUp {
	
	

	@Test(dataProvider="get")
		public void signUp(String first,String last, String email,String pass, String num, String bio) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\akshay.dathathreya\\\\Documents\\\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://mobileworld.azurewebsites.net/signup.html");
			Thread.sleep(2000);
			
			SignUp sig=new SignUp(driver);
			sig.getFirstName().sendKeys(first);
			sig.getLastName().sendKeys(last);
			sig.getEmail().sendKeys(email);
			sig.getPassword().sendKeys(pass);
			sig.getNumber().sendKeys(num);
			sig.getBio().sendKeys(bio);
			driver.findElement(By.xpath("//input[@type=\"date\"]")).sendKeys("24-09-1998");
			driver.findElement(By.xpath("//input[@type=\"radio\"]")).click();
			driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
			driver.findElement(By.xpath("//button[text()=\"Register\"]")).click();
			
			
//			String msg=driver.switchTo().alert().getText();
//			System.out.println(msg);
//			Assert.assertEquals(msg, "Hai"+first+"! Go To SignIn");
			driver.switchTo().alert().accept();
			Thread.sleep(5000);
			
			
			
			
		}
	
	@DataProvider(name="get")
	public Object[][] getData(){
		Object[][] data=new Object[3][6];
		
		data[0][0]="Akshay";
		data[0][1]="Kumar";
		data[0][2]="Akshaykumar@gmail.com";
		data[0][3]="Akshay$1999";
		data[0][4]="98765432123";
		data[0][5]="kiran kumar";
		
		
		data[1][0]="Kiran";
		data[1][1]="Kumar";
		data[1][2]="Kiran12345@gmail.com";
		data[1][3]="Kiran$1999";
		data[1][4]="123456789";
		data[1][5]="kiran kumar";
		
		
		data[2][0]="Balaji";
		data[2][1]="Kumar";
		data[2][2]="Balajisanmugam@gmail.com";
		data[2][3]="Balaji$1999";
		data[2][4]="0987654321";
		data[2][5]="kiran kumar";
		return data;
		
		
		
		
		
		
		
		
	}
	
	
	}
	
	


