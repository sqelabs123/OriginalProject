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
import Reusable.Sauce_Instance_Login_Test;
import Reusable.browser_stack_login;

public class Signin_and_forgot_password {

	public Repo_Test action_obj;
	public Assertion_Test Assertion_obj;
	public JavascriptExecutor executor;
	public WebDriver driver;
	public static final String USERNAME = "bolaolayanju1";
	public static final String AUTOMATE_KEY = "HkPbtsGve6DGTR2mCsGN";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	
	@Test(priority = 1)
	@Parameters({"userId","password","url"})
	public void Logout(String userId,String password,String url) throws Exception { 
			
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
		driver.get(url);
		System.out.println("---------------------------------------------------------------------------------------------------------------");
		//Open URL
		System.out.println("@URL Opening......."+url);
		//Maximize Window
		driver.manage().window().maximize();
		Thread.sleep(500);
		driver.navigate().refresh();
		Thread.sleep(3000);
		//Click on 'Sign in with email' link
		action_obj.signin().click();
		Thread.sleep(1500);
		//Entering userID
		action_obj.username().sendKeys(userId);
		Thread.sleep(1000);
		//Entering Password
		action_obj.Password().sendKeys(password);
		//Click on 'LOGIN' button
		Thread.sleep(350);
		action_obj.loginbutton().click();
		Thread.sleep(500);
		//Assertion for Login
		Assertion_obj.logout_assertion();
		Thread.sleep(3000);
		//Click on Logout
		action_obj.logoutbutton().click();
		Thread.sleep(2500);
		//Assertion..Validate by 'SIGN IN' link
		Assertion_obj.signinassertassert();
		Thread.sleep(1500);
/*		//Click on Signin
		action_obj.signwithemail().click();
		Thread.sleep(1500);
		//Click on Forgot Password
		action_obj.forgotpassword().click();
		Thread.sleep(500);
		//Restore password assertion
		Assertion_obj.restorepasswordassert();
		Thread.sleep(500);
		//Entering data in Username field for Forgot Password
		action_obj.usernameforgotpassword().sendKeys("vipul.sharma@sqelabs.com");
		//Click on Restore password button
		action_obj.restorepassword().click();
		//Assertion for 'Please check your email' text
		Assertion_obj.forgotpwdassert_assertion();                                     */
}

	@Test(priority=2)
	public void Facebook_Signin() throws Exception{
		//Click on Signin
				action_obj.signwithemail().click();
				Thread.sleep(500);
				//Click on 'Sign in with Facebook' button
				action_obj.facebooksignin().click();
				Thread.sleep(5000);
				//Handling new window
				String winHandleBefore = driver.getWindowHandle();
				for(String winHandle : driver.getWindowHandles()){
				    driver.switchTo().window(winHandle);
				}
				//New window assertion
				Assertion_obj.fbassert_assertion();
				//Close window
				driver.close();
				//Switch to parent window
				driver.switchTo().window(winHandleBefore);
				Thread.sleep(3000);
				//Close validation message
				action_obj.closeicon().click();
				Thread.sleep(3000);
				//Close pop-up window
				action_obj.closeicon().click();
	}
	
	@Test(priority=3)
	public void Restoring_password() throws Exception{
				Thread.sleep(5000);
				//Click on Signin
				action_obj.signwithemail().click();
				Thread.sleep(1500);
				//Click on Forgot Password
				action_obj.forgotpassword().click();
				Thread.sleep(500);
				//Restore password assertion
				Assertion_obj.restorepasswordassert();
				Thread.sleep(500);
				//Entering data in Username field for Forgot Password
				action_obj.usernameforgotpassword().sendKeys("vipul.sharma@sqelabs.com");
				//Click on Restore password button
				action_obj.restorepassword().click();
				Thread.sleep(1000);
				//Assertion for 'Please check your email' text
				Assertion_obj.forgotpwdassert_assertion();
				Thread.sleep(1500);
				driver.quit();
	}
	
}