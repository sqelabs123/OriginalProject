package foodniche_project;

import java.net.URL;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Reusable.Assertion_Test;
import Reusable.Repo_Test;
import Reusable.Sauce_Instance_Signup_Test;
import Reusable.browser_stack_login;
import Reusable.browser_stack_signup;

public class Signupuser{

	public Repo_Test action_obj;
	public Assertion_Test Assertion_obj;
	public JavascriptExecutor executor;
	public WebDriver driver;
	
	public static final String USERNAME = "bolaolayanju1";
	public static final String AUTOMATE_KEY = "HkPbtsGve6DGTR2mCsGN";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	
	@Test(priority = 1)
	@Parameters({"userId","password","url"})
	public void SignUpForm(String userId,String password,String url) throws Exception { 
		DesiredCapabilities caps = new DesiredCapabilities();
	    caps.setCapability("browser", "Chrome");
	    caps.setCapability("browser_version", "55.0");
	    caps.setCapability("os", "Windows");
	    caps.setCapability("os_version", "8");
	    caps.setCapability("resolution", "1920x1080");
	    this.driver = new RemoteWebDriver(new URL(URL), caps);
	    
	    action_obj = new Repo_Test(driver);
		Assertion_obj = new Assertion_Test(driver);
		executor=(JavascriptExecutor) driver;
		Date date = new Date();
		Thread.sleep(500);

		System.out.println("---------------------------------------------------------------------------------------------------------------");
		//Open URL
		System.out.println("@URL Opening......."+url);
		driver.get(url);
		driver.manage().window().maximize();
		
		action_obj.signuplink().click();
		Thread.sleep(1500);
		//Assertion for SignUp
		Assertion_obj.sign_up_assertion();
		//Close icon
		action_obj.closeicon().click();
		//Click on Sign up link
		Thread.sleep(500);
		action_obj.signuplink().click();
		Thread.sleep(1500);
		//Assertion for SignUp
		Assertion_obj.sign_up_assertion();
		//Entering First name
		action_obj.Firstname().sendKeys(action_obj.date());
		//Entering Last name
		action_obj.lastname().sendKeys(action_obj.date());
		//Entring emailID
		action_obj.signupemail().sendKeys(action_obj.date()+"@mail.com");
		//Entring Password
		action_obj.signuppassword().sendKeys("C123456789@c");
		//Click on check box
		action_obj.signupcheckin().click();
		Thread.sleep(1500);
		//Click on 'JOIN FREE!!' button
		action_obj.joinfreebutton().click();
		Thread.sleep(2000);
		Assertion_obj.userregistration_assert_assertion();
		Thread.sleep(1000);
	    
		
		//Click on Discover Nourishing Meal icon
		action_obj.dnmuser().click();
		//Assertion for 'NEXT' button
		Assertion_obj.next_assert_assertion();
		//Entering data under 'Country' textbox
		action_obj.signupcountry().sendKeys("US");
		//Entering data under 'Zip code' textbox
		action_obj.signupzipcode().sendKeys("45700");
		Thread.sleep(700);
		//Click on 'Upload Profile Photo' button
		action_obj.uploaduserdp().click();
		Thread.sleep(300);
		//Running 'AutoIT'
		Runtime.getRuntime().exec(System.getProperty("user.dir")+"//TestData/signup_pic_upload.exe");
		Thread.sleep(8000);
		//Click on 'NEXT' button
		action_obj.nextbutton().click();
		Thread.sleep(5000);
		//Assertion for 'Follow 4 or 5 groups to get started!' page
		Assertion_obj.step3assert();
		Thread.sleep(2000);
		//Refresh command
		driver.navigate().refresh();
		Thread.sleep(3000);
		//Click on 1st follow button
		driver.findElement(By.xpath("(//*[@class='group-title'])[1]/a")).click();
		Thread.sleep(1000);
		//Click on 2nd follow button
		driver.findElement(By.xpath("(//*[@class='group-title'])[2]/a")).click();
		Thread.sleep(1000);
		//Click on 3rd follow button
		driver.findElement(By.xpath("(//*[@class='group-title'])[3]/a")).click();
		Thread.sleep(1000);
		//Click on 4th follow button
		driver.findElement(By.xpath("(//*[@class='group-title'])[4]/a")).click();
		Thread.sleep(1000);
		//Click on 'Get Started' button
		action_obj.getstarted().click();
		Thread.sleep(3500);
		//Assertion of 'LOG OUT' link
		Assertion_obj.logout_assertion();
		Thread.sleep(500);
		//Click on Logout
		action_obj.logoutbutton().click();
	}	
}
