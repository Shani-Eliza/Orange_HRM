package Base_pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Orange_base2 
{
	WebDriver driver;
	
	public Orange_base2(WebDriver driver) 
	{
		this.driver = driver;
	}

	public void move() throws InterruptedException 
	{	
		By sol = By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[1]/a");
		WebElement soln = driver.findElement(sol);
		Actions act = new Actions(driver);
		act.moveToElement(soln);
		act.perform();
		Thread.sleep(2000);
		
		By why = By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[2]/a");
		WebElement whyHRM = driver.findElement(why);
		act.moveToElement(whyHRM);
		act.perform();
		Thread.sleep(2000);
		
		By res = By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a");
		WebElement resource = driver.findElement(res);
		act.moveToElement(resource);
		act.perform();
		Thread.sleep(2000);
		
		By com = By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a");
		WebElement company = driver.findElement(com);
		act.moveToElement(company);
		act.perform();
		Thread.sleep(2000);
		
		By free_demo = By.xpath("//*[@id=\"navbarSupportedContent\"]/div[2]/ul/li[1]/a/button");
		driver.findElement(free_demo).click();
		driver.navigate().back();
		Thread.sleep(2000);
		
		By sales = By.xpath("//*[@id=\"navbarSupportedContent\"]/div[2]/ul/li[2]/a/button");
		driver.findElement(sales).click();
		driver.navigate().back();
		Thread.sleep(2000);
		
		By req = By.xpath("/html/body/div/div/div/div/section[3]/div[4]/div/div[2]/div/ul/li[3]/div/a/div[1]/img");
		WebElement req_desk = driver.findElement(req);
		act.moveToElement(req_desk);
		act.perform();
		driver.findElement(req).click();
		driver.navigate().back();
		Thread.sleep(2000);
		
		By learn = By.xpath("/html/body/div/div/div/div/section[4]/div[4]/div/div[1]/div[2]/div/div/a/div[1]/h6");
		WebElement learn_more = driver.findElement(learn);
		act.moveToElement(learn_more);
		act.perform();
		driver.findElement(learn).click();
		driver.navigate().back();
		Thread.sleep(2000);
	}
	
	public void email(String s) 
	{
		By email = By.xpath("//*[@id=\"Form_submitForm_EmailHomePage\"]");
		driver.findElement(email).sendKeys(s, Keys.ENTER);
	}

	public void login() throws InterruptedException 
	{
		By log = By.xpath("//*[@id=\"Form_getForm_subdomain\"]");
		driver.findElement(log).sendKeys("poiuyg");
		Thread.sleep(5000);
		
		By name = By.xpath("//*[@id=\"Form_getForm_Name\"]");
		driver.findElement(name).sendKeys("Shani Thomas");
		Thread.sleep(5000);
		
		By no = By.xpath("//*[@id=\"Form_getForm_Contact\"]");
		driver.findElement(no).sendKeys("123456789");
		Thread.sleep(5000);
		
		By country = By.xpath("//*[@id=\"Form_getForm_Country\"]");
		driver.findElement(country).click();
		
		if(driver.getPageSource().contains("India"))
		{
			driver.findElement(By.xpath("//*[@id=\"Form_getForm_Country\"]/option[97]")).click();
		}
		else
		{
			System.out.println("India not found...");
		}
		Thread.sleep(5000);
		
		By trial = By.xpath("//*[@id=\"Form_getForm_action_submitForm\"]");
		WebElement submit = driver.findElement(trial);
		
		Actions act = new Actions(driver);
		act.scrollToElement(submit);
		act.perform();
		driver.findElement(trial).click();
		Thread.sleep(2000);
	}
}
