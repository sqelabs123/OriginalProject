package Reusable;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Reusable.Assertion_Test;
import Reusable.Repo_Test;


public class testuplod {
public WebDriver driver;
	
	public static final String USERNAME = "bolaolayanju1";
	public static final String AUTOMATE_KEY = "HkPbtsGve6DGTR2mCsGN";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

	public Repo_Test action_obj;
	public Assertion_Test Assertion_obj;
	//public String Url="";
	public JavascriptExecutor executor;
	
	@Test(priority=1)
	@Parameters({"userId","password","url"})
	public void testUpload(String userId,String password,String url) throws Exception
	{
		/*		
		String exePath = System.getProperty("user.dir") + "\\TestData\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new ChromeDriver();
		*/
	    DesiredCapabilities caps = new DesiredCapabilities();
	    caps.setCapability("browser", "Chrome");
	    caps.setCapability("browser_version", "55.0");
	    caps.setCapability("os", "Windows");
	    caps.setCapability("os_version", "8");
	    caps.setCapability("resolution", "1920x1080");
	    
//	    caps.setCapability("browserstack.local", "true");
//	    caps.setCapability("browserstack.localIdentifier", "Test123");
//	    caps.setCapability("acceptSslCerts", "true");
	    ChromeOptions options = new ChromeOptions();
	    options.addArguments("--disable-plugins");
	    options.setExperimentalOption("excludeSwitches", "enable-popup-blocking");

//C:\Users\hello\Documents\images\person.jpg	    caps.setCapability(ChromeOptions.CAPABILITY, options);
	    
	    
	    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
//	    driver.get("http://www.google.com");
	//  WebElement element = driver.findElement(By.name("q"));

	//  element.sendKeys("BrowserStack");
	//  element.submit();

	//   System.out.println(driver.getTitle());
	    
	    action_obj = new Repo_Test(driver);
		Assertion_obj = new Assertion_Test(driver);

		System.out.println("---------------------------------------------------------------------------------------------------------------");
		//Open URL
		System.out.println("@URL Opening......."+url);
		//Opening URL
		driver.get(url);
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
		WebElement element = driver.findElement(By.xpath(".//*[@id='content']/div[2]/div/div[2]/div/div/form/div/div/div[3]/div[1]/input"));
		Thread.sleep(1500);
		element.click();
		System.out.println("Element clicked");
		Thread.sleep(5000);
		StringSelection ss = new StringSelection("C:\\Users\\hello\\Documents\\images\\person.jpg");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
//		uploadFile("C:\\Users\\hello\\Documents\\images\\person.jpg");
		System.out.println("File Upload done");
		Thread.sleep(2000);
		Robot robot = new Robot();
		Thread.sleep(5000);
	    robot.keyPress(KeyEvent.VK_ENTER);
	    Thread.sleep(5000);
	    robot.keyRelease(KeyEvent.VK_ENTER);
	    Thread.sleep(5000);
	    robot.keyPress(KeyEvent.VK_CONTROL);
	    Thread.sleep(5000);
	    robot.keyPress(KeyEvent.VK_V);
	    Thread.sleep(5000);
	    robot.keyRelease(KeyEvent.VK_V);
	    Thread.sleep(5000);
	    robot.keyRelease(KeyEvent.VK_CONTROL);
	    Thread.sleep(5000);
	    robot.keyPress(KeyEvent.VK_ENTER);
	    Thread.sleep(5000);
	    robot.keyRelease(KeyEvent.VK_ENTER);
	    Thread.sleep(5000);
	}
}