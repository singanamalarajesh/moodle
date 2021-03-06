package moodle.test.scripts;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import moodle.test.commons.pages.Dashboardpage;
import moodle.test.commons.pages.Homepage;
import moodle.test.commons.pages.Loginpage;

public class TestLoginModule 
{
	public WebDriver driver;
	static Logger log=LogManager.getLogger(TestLoginModule.class);
	
	@Test
	public void verifyLogin()
	{
		System.setProperty("webdriver.chrome.driver","D:\\batch227\\softwares\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://localhost:81/moodle");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		log.info("chrome browser triggered");
		Homepage home=new Homepage();
		home.driver=this.driver;
		home.login();
		log.info("login triggered");
		Loginpage login=new Loginpage();
		login.driver=this.driver;
		login.login("rajesh","pandu552");
		log.info("login page triggered");
		Dashboardpage dashboard=new Dashboardpage();
		dashboard.driver=this.driver;		
		dashboard.logout();
		driver.close();
		
	}
	
	
	
}
