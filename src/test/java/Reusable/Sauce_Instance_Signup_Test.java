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

public class Sauce_Instance_Signup_Test {

	protected WebDriver driver;
 
	public String firstname;
	
	
	
	
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
		capability.setCapability("version", "40");
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
	}
	@AfterClass
	public void Logout() throws Exception {
		  
		List<WebElement> lout=(List<WebElement>) driver.findElements(By.xpath(".//*[@id='navbar']/div/ul/li[5]/a"));
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
