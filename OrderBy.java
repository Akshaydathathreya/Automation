package OrderBy;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OrderBy {
	
	
	@Test(dataProvider="getD")
    public void order(String fn,String ln,String el,String pw,String nm,String ad1,String ad2,String ct,String zp,String co ) throws InterruptedException
    {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\akshay.dathathreya\\\\Documents\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mobileworld.azurewebsites.net/");
		driver.findElement(By.xpath("(//*[@id=\"navbarDropdown\"])[2]")).click();
		driver.findElement(By.xpath("(//a[@class=\"dropdown-item\"])[4]")).click();
		
		Thread.sleep(2000);
		Set<String> window= driver.getWindowHandles();
		Iterator<String>it = window.iterator();
		String parentId=it.next();
		String childId=it.next();
		driver.switchTo().window(childId);
		
        order or = new order(driver);
  
        or.getFirstName().sendKeys(fn);
        or.getLastName().sendKeys(ln);
        or.getEmail().sendKeys(el);
        or.getPassword().sendKeys(pw);
        or.getGender().click();
        or.getNumber().sendKeys(nm);
        or.getAddress1().sendKeys(ad1);
        or.getAddress2().sendKeys(ad2);
        or.getCity().sendKeys(ct);
        Select s=new Select(driver.findElement(By.id("inputState")));
        s.selectByIndex(2);
        or.getZip().sendKeys(zp);
        or.getCheck1().click();
        or.getCheck2().click();
        or.getCount().sendKeys(co);
        Select sl=new Select(driver.findElement(By.id("bought")));
        sl.selectByIndex(1);
        or.getSamsungcb().click();
        or.getApplecb().click();
    }

    @DataProvider
    public Object[][] getD()
    {
        Object[][] data = new Object[1][10];

        data[0][0]="kiran";
        data[0][1]="kumar";
        data[0][2]="kirangmysuru@gmail.com";
        data[0][3]="kiran@1";
        data[0][4]="8892926361";
        data[0][5]="#1413,4th cross,kabir road";
        data[0][6]="mandi mohalla, Mysuru";
        data[0][7]="Mysuru";
        data[0][8]="570001";
        data[0][9]="2";

        return data;

    }

}


