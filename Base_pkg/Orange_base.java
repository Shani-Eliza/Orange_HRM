package Base_pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Orange_base 
{
	WebDriver driver;
	
	public Orange_base(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	public void title(String s)
	{
		String act = driver.getTitle();
		Assert.assertEquals(s,act);
	}
	
	public void click() throws InterruptedException 
	{
		By lanEN = By.xpath("/html/body/nav/div/div[1]/div[1]/a");
		WebElement EN = driver.findElement(lanEN);
		
		Actions act = new Actions(driver);
		act.moveToElement(EN);
		act.perform();
		By lanES = By.xpath("/html/body/nav/div/div[1]/div[2]/a");
		driver.findElement(lanES).click();
	}

	public void click2() 
	{
		By lanEN = By.xpath("/html/body/nav/div/div[1]/div[1]/a");
		WebElement EN = driver.findElement(lanEN);
		
		Actions act = new Actions(driver);
		act.moveToElement(EN);
		act.perform();
		driver.findElement(lanEN).click();
	}
}
