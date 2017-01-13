package Reusable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.net.URL;
import java.util.Date;
import java.util.List;

public class browser_stack_login {
	public WebDriver driver;
	
	public static final String USERNAME = "bolaolayanju1";
	public static final String AUTOMATE_KEY = "HkPbtsGve6DGTR2mCsGN";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

	public Repo_Test action_obj;
	public Assertion_Test Assertion_obj;
	//public String Url="";
	public JavascriptExecutor executor;
	@BeforeClass
	@Parameters({"userId","password","url"})
	public void Login(String userId,String password,String url) throws Exception {
	  

    DesiredCapabilities caps = new DesiredCapabilities();
    caps.setCapability("browser", "Chrome");
    caps.setCapability("browser_version", "55.0");
    caps.setCapability("os", "Windows");
    caps.setCapability("os_version", "8");
    caps.setCapability("resolution", "1920x1080");
    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
//    driver.get("http://www.google.com");
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
	//Click on 'Sign in with email' link
	action_obj.signwithemail().click();
	Thread.sleep(1000);
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
	Thread.sleep(5000);
//	action_obj.logoutbutton().click();
	
	
}
@AfterClass
public void logout() throws Exception {
	  
	List<WebElement> lout=(List<WebElement>) driver.findElements(By.xpath(".//*[@id='navbar']/div/ul/li[5]/a"));
	if(lout.size()==1)
	{
    System.out.println("---------------------------------------------------------------------------------------------------------------");
	System.out.println("@#############################################################");
	 action_obj.logoutbutton().click();
	Assertion_obj.login_assert_assertion();
	  System.out.println("####LOGOUT####");
	  driver.quit();
	}
  }
}