package moodle.test.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import moodle.test.commons.pages.Dashboardpage;
import moodle.test.commons.pages.Homepage;
import moodle.test.commons.pages.Loginpage;

public class TestLoginModule 
{
	public WebDriver driver;
	
	@Test
	public void verifyLogin()
	{
		System.setProperty("webdriver.chrome.driver","D:\\batch227\\softwares\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://localhost:81/moodle");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Homepage home=new Homepage();
		home.driver=this.driver;
		home.login();
		Loginpage login=new Loginpage();
		login.driver=this.driver;
		login.login("rajesh","pandu552");
		Dashboardpage dashboard=null;
		dashboard.driver=this.driver;
		dashboard.logout();
		driver.close();
		
	}
	
	
	
}
