package moodle.test.commons.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import moodle.test.scripts.TestLoginModule;

public class Loginpage extends TestLoginModule 
{

	public WebDriver driver;
	
	public void login(String username,String password)
	{
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("loginbtn")).click();
	}
	
	public void forgotpassword()
	{
		driver.findElement(By.xpath("//*[text()='Forgotten your username or password?']")).click();
	}
	public void loginAsGuest()
	{
		driver.findElement(By.xpath("//input[@value='Log in as a guest')]")).click();
	}
	
	public void home()
	{
		driver.findElement(By.xpath("//a[text()='Home']")).click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}