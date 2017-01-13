package foodniche_project;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Reusable.Assertion_Test;
import Reusable.Repo_Test;

public class test_data {
	
	private WebDriver driver;
	
	public Repo_Test action_obj;
	public Assertion_Test Assertion_obj;
	public JavascriptExecutor executor;
	
	@BeforeClass
	
	public void Logout() throws Exception { 
		
		DesiredCapabilities capability = new DesiredCapabilities();
		 capability = DesiredCapabilities.chrome();
		 capability.setCapability("version", "55");
		 capability.setPlatform(Platform.WIN8);
		    capability.setCapability("build", "Simple User: Signin and Forgot Password");
		    driver = new RemoteWebDriver(
		  	      new URL("https://bolaolayanju1:HkPbtsGve6DGTR2mCsGN@hub-cloud.browserstack.com/wd/hub"),
		  	      capability
		  	    );
		  	  }
	@Test(priority=1)
	@Parameters({"userId","password","url"})
	 public void testSimple(String userId,String password,String url) throws Exception {
		action_obj = new Repo_Test(driver);
		Assertion_obj = new Assertion_Test(driver);
		executor=(JavascriptExecutor) driver;
		Date date = new Date();
		System.out.println("---------------------------------------------------------------------------------------------------------------");
		//Open URL
		System.out.println("@URL Opening......."+url);
		//Opening URL
		driver.get(url);
		//Maximize Window
		driver.manage().window().maximize();
		//Click on 'Sign in with email' link
		action_obj.signwithemail().click();
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
		Thread.sleep(2000);
		//Click on Logout
		action_obj.logoutbutton().click();
		Thread.sleep(2500);
		//Assertion..Validate by 'SIGN IN' link
		Assertion_obj.signinassertassert();
		Thread.sleep(1500);
		driver = new Augmenter().augment(driver);
	    File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	    try {
	      FileUtils.copyFile(srcFile, new File("Screenshot.png"));
	    } catch (IOException e) {
	      e.printStackTrace();
	    }
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
				for(String winHandle : driver.getWindowHandles()){driver.switchTo().window(winHandle);				
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
				driver = new Augmenter().augment(driver);
			    File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			    try {
			      FileUtils.copyFile(srcFile, new File("Screenshot.png"));
			    } catch (IOException e) {
			      e.printStackTrace();
			    }
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
				//Assertion for 'Please check your email' text
				Thread.sleep(1000);
				Assertion_obj.forgotpwdassert_assertion();
				driver = new Augmenter().augment(driver);
			    File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			    try {
			      FileUtils.copyFile(srcFile, new File("Screenshot.png"));
			    } catch (IOException e) {
			      e.printStackTrace();
			    }
			    Thread.sleep(1500);
			    driver.quit();
	}

	}
