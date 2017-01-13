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
import Reusable.csv;

public class Groups_by_business extends browser_stack_login{

	public Repo_Test action_obj;
	public Assertion_Test Assertion_obj;
	public JavascriptExecutor executor;
	public WebDriver driver;
	public static final String USERNAME = "bolaolayanju1";
	public static final String AUTOMATE_KEY = "HkPbtsGve6DGTR2mCsGN";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	
	public String cellrandom;
	@Test(priority = 1)
	@Parameters({"userId","password","url"})
		public void Posting_Picture_by_Business_User(String userId,String password,String url) throws Exception { 
		DesiredCapabilities caps = new DesiredCapabilities();
		    caps.setCapability("browser", "Chrome");
		    caps.setCapability("browser_version", "55.0");
		    caps.setCapability("os", "Windows");
		    caps.setCapability("os_version", "8");
		    caps.setCapability("resolution", "1920x1080");
		    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
		
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
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		//Scroll
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1000)", "");
		Thread.sleep(1000);
		//Click on My Group menu
		action_obj.mygroup().click();
		Thread.sleep(1000);
		//Assertion 'Back to Home' button
		Assertion_obj.groupassert1();
		//Click on Create Group
		action_obj.creategroup().click();
		Thread.sleep(500);
		//Assertion 'CREATE GROUPS' page name
		Assertion_obj.groupassert2();
		Thread.sleep(500);
				
/*		//#######################################Vipul CSV###########################################
		String p=System.getProperty("user.dir")+"//TestData/abc.xlsx";
//		String cell = cellrandom;
		csv celldata = new csv();
		String sheet = celldata.toString();
		System.out.println(sheet);
		
		
		
		
		
*/		
		
		//Entering name
		action_obj.groupname().sendKeys("Indian Food");
		//Entering Discription
		action_obj.groupdescription().sendKeys("The Food Hub is a best practice food production and education facility based in Drumshanbo.");
		Thread.sleep(500);
		//Click on Upload Picture button
		driver.findElement(By.xpath(".//*[@class='file-upload']/input")).click();
		Thread.sleep(300);
		//Running 'AutoIT'
		Runtime.getRuntime().exec(System.getProperty("user.dir")+"//TestData/content_by_user.exe");
		Thread.sleep(8000);
		//Scroll
		jse.executeScript("window.scrollBy(0,500)", "");
		//Click on Submit button
//		action_obj.groupsubmit().click();
		Thread.sleep(300);
		//Assertion 'Group created successfully'
		Assertion_obj.groupassert();
		
		}
	}