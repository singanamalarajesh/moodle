package moodle.test.commons.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage 
{ 
	static WebDriver driver;
	
	public void login()
	{
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
	}
	
	
	
	public void courses()
	{
		driver.findElement(By.xpath("//a[text()='Courses']")).click();
		
	}
	
	
	public WebElement calender()
	{
		return driver.findElement(By.xpath("//*[text()='Calendar']"));
	}

}
