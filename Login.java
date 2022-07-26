package Login;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException, InterruptedException {

		File file = new File(System.getProperty("user.dir") + "\\TestData\\" + "Book 2" + ".xlsx");
		FileInputStream inputstream = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(inputstream);
		XSSFSheet sheet = wb.getSheetAt(0);
		/* Open Login page */
//		  WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshay.dathathreya\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://mobileworld.azurewebsites.net/sign.html");

		Thread.sleep(1000);
		// Storing Values in to Variables ( In this case, Usernames and Passwords )
		XSSFRow row = null;
		XSSFCell cell = null;
		String userName = null;
		String password = null;
		for (int i = 1; i <= sheet.getLastRowNum(); i++) {
			row = sheet.getRow(i);
			for (int j = 0; j <= row.getLastCellNum(); j++) {
				cell = row.getCell(j);
				if (j == 0) // We can use Column Name as well, will see in upcoming sessions
				{
					userName = cell.getStringCellValue();
				}
				if (j == 1) // We can use Column Name as well, will see in upcoming sessions
				{
					password = cell.getStringCellValue();
				}
			}
			driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys(userName);
			driver.findElement(By.id("password")).sendKeys(password);
			driver.findElement(By.xpath("//a[@type=\"submit\"]")).click();
			
			
			String result = null;
			try {
				Boolean isLoggedIn = driver.findElement(By.xpath("//a[text()='Log out']")).isDisplayed();
				if (isLoggedIn == true) {
					result = "PASS";
				}
				System.out.println("User Name : " + userName + " ----  " + "Password : " + password
						+ "----- Login success ? ------ " + result);
				// System.out.println("Login successfull : " + isLoggedIn);
				driver.findElement(By.xpath("//a[text()='Log out']")).click();
			} catch (Exception e) {
				Boolean isError = driver.findElement(By.xpath("//h1[text()=\"Welcome To Our Mobile World!\"]"))
						.isDisplayed();
				if (isError == true) {
					result = "FAIL";
				}
				System.out.println("User Name : " + userName + " ----  " + "Password : " + password
						+ "----- Login success ? ------ " + result);
				driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
			}
			
		}

	}
}

