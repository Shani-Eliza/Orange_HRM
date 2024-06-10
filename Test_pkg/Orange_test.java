package Test_pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base_pkg.Orange_base;
import Base_pkg.Orange_base2;

public class Orange_test 
{
	WebDriver driver;
	String baseurl = "https://www.orangehrm.com/";
	
	@BeforeTest
	public void url() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	
	@Test
	public void test() throws InterruptedException
	{
		Orange_base obj = new Orange_base(driver);
		obj.title("Human Resources Management Software | OrangeHRM");
		obj.click();
		Thread.sleep(3000);
		obj.click2();
	}
	
	@Test
	public void test2() throws InterruptedException
	{
		Orange_base2 obj = new Orange_base2(driver);
		obj.move();
		obj.email("123@gmail.com");
		obj.login();
	}
	
	@AfterTest
	public void close()
	{
		driver.quit();
	}
}
