package moodle.test.commons.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import moodle.test.scripts.LoginModule;

public class Dashboardpage extends LoginModule
{
	
	public WebDriver driver;
	
	public void moodle()
	{
		driver.findElement(By.xpath("//a[@title='Home']")).click();		
	}
	
	public void language()
	{
		driver.findElement(By.xpath("//a[@title='Language']")).click();
	}

    public void logout()
    {
    	driver.findElement(By.xpath("//span[@class='usertext']")).click();
    	driver.findElement(By.xpath("//span[text()='Log out']")).click();
    }
}
