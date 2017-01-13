package Reusable;

import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class browser_stack_signup  {

	public Repo_Test action_obj;
	public Assertion_Test Assertion_obj;
	public JavascriptExecutor executor;
	public WebDriver driver;

	public static final String USERNAME = "bolaolayanju1";
	public static final String AUTOMATE_KEY = "HkPbtsGve6DGTR2mCsGN";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

	//public String Url="";

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
//  driver.get("http://www.google.com");
//  WebElement element = driver.findElement(By.name("q"));

//  element.sendKeys("BrowserStack");
//  element.submit();

    System.out.println(driver.getTitle());

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
	action_obj.signuppassword().sendKeys("123456789");
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