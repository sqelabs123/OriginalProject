package Reusable;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.google.common.collect.Table.Cell;

public class Sauce_Instance_Login_Test {

	protected WebDriver driver;
 
	 
	public static DesiredCapabilities capability;

	public Repo_Test action_obj;
	public Assertion_Test Assertion_obj;
	//public String Url="";

	@BeforeClass
	@Parameters({"userId","password","url"})
	public void Login(String userId,String password,String url) throws Exception {
		
		action_obj = new Repo_Test(driver);
		
		
		
		 
		
		//####################
		capability = DesiredCapabilities.firefox();
		capability.setCapability("platform", "Windows 10");
		capability.setCapability("version", "54");
		capability.setCapability("name", "Test1");
		//############################

		//driver = new  RemoteWebDriver(new URL(url),capability);

		String downloadFilepath = "D:\\";
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", downloadFilepath);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		cap.setCapability(ChromeOptions.CAPABILITY, options);
	//	WebDriver driver = new ChromeDriver(cap);
		
		
		
		
		
//		String exePath = "E:\\chromedriver.exe";
		String exePath = System.getProperty("user.dir") + "\\TestData\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new ChromeDriver(cap);
		//driver = new FirefoxDriver();
		action_obj = new Repo_Test(driver);
		Assertion_obj = new Assertion_Test(driver);

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

	}
	@AfterClass
	public void logout() throws Exception {
		  
		List<WebElement> lout=(List<WebElement>) driver.findElements(By.id("button-1027-btnIconEl"));
		if(lout.size()==1)
		{
	    System.out.println("---------------------------------------------------------------------------------------------------------------");
		System.out.println("@#############################################################");
		 action_obj.logoutbutton().click();
		Assertion_obj.login_assert_assertion();
		  System.out.println("####LOGOUT####");
		 
		}
	}
 
}
