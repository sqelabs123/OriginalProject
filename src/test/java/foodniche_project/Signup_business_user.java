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
import Reusable.browser_stack_signup;

public class Signup_business_user extends browser_stack_signup  {

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
	    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);

	    action_obj = new Repo_Test(driver);
		Assertion_obj = new Assertion_Test(driver);
		executor=(JavascriptExecutor) driver;
		Date date = new Date();
		Thread.sleep(2000);

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

		//Click on Promote Business Circle
		action_obj.promotebusiness().click();
		Thread.sleep(2000);
		//Assertion for business page
		Assertion_obj.businesspage_assertion();
		//Entering Business name
		action_obj.businessname().sendKeys(action_obj.date());
		//Entering Business Description
		action_obj.businessdes().sendKeys("Enter Your Business Description Here!!");
		Thread.sleep(500);
		//Click on Business Category
		action_obj.businesscategory().click();
		//Entering Business website
		action_obj.businesswebsite().sendKeys("www.dummyurl.com");
		//Entering Business Zipcode
		action_obj.businesszipcode().sendKeys("45087");
		//Entering Business email
		action_obj.businessemail().sendKeys("dummymail@sqelabs.com");
		Thread.sleep(500);
		//Click on Upload Photo
		driver.findElement(By.xpath("//*[@type='file']")).click();
		Thread.sleep(300);
		//Running 'AutoIT'
		Runtime.getRuntime().exec(System.getProperty("user.dir")+"//TestData/signup_pic_upload.exe");
		Thread.sleep(8000);
		//Scroll
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)", "");
		//Business Checkbox
		action_obj.businesscheckbox().click();
		//Click on Submit button
		action_obj.businesssubmit().click();
		Thread.sleep(1000);
		Assertion_obj.businessconfirm_assertion();
		Thread.sleep(8000);	
		//Assertion 'LOG OUT' link
		Assertion_obj.logout_assertion();
		Thread.sleep(700);
		//Click on Get Started button
		action_obj.businessgetstarted().click();
		Thread.sleep(500);
		Assertion_obj.payinfo_assertion();
		Thread.sleep(500);
		//Enter card number
		action_obj.cardnumber().sendKeys("30569309025904");
		//Enter cvc number
		action_obj.cvc().sendKeys("123");
		//Enter Expiry date
		action_obj.expiry().sendKeys("06/21");
		//Click on Submit button
		action_obj.businesssubmit().click();
		Thread.sleep(1000);
		//Card Details problem
		//No assertion

}
}