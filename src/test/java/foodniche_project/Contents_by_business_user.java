package foodniche_project;

import java.io.IOException;
import java.net.URL;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Reusable.Assertion_Test;
import Reusable.Repo_Test;
import Reusable.Sauce_Instance_Login_Test;
import Reusable.browser_stack_login;

public class Contents_by_business_user{

	public Repo_Test action_obj;
	public Assertion_Test Assertion_obj;
	public JavascriptExecutor executor;
	public WebDriver driver;
	public static final String USERNAME = "bolaolayanju1";
	public static final String AUTOMATE_KEY = "HkPbtsGve6DGTR2mCsGN";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	
	@Test(priority=1)
	@Parameters({"userId","password","url"})
	public void Posting_Pictures_Contents_by_Business_User(String userId,String password,String url) throws Exception { 
		
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
		System.out.print("For Business User");
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
		//Entering data in status section
		action_obj.usercontentstatus().sendKeys("Classic Shortbread(Picture For test purpose)");
		Thread.sleep(3000);

		//Uploading file
		
		((RemoteWebDriver) driver).setFileDetector(new LocalFileDetector());
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='content']/div[2]/div/div[2]/div/div/form/div/div/div[3]/div[1]/input")).sendKeys("C:\\Users\\hello\\Documents\\images\\wallpaper2.jpg");	
		Thread.sleep(2000);
		action_obj.postbutton().click();
		Thread.sleep(1000);
		//Assertion
		Assertion_obj.addpost();
		Thread.sleep(2000);
	}	
	@Test(priority=2)
	public void Editing_Pictures_Contents_by_Business_User() throws Exception{
		
		Thread.sleep(1000);
		//Scroll
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(500);
		//Click on 'Home'
		action_obj.home().click();
		Thread.sleep(1000);
		//Click on Edit button
		action_obj.recipesedit().click();
		Thread.sleep(2000);
		//Edit Name
		action_obj.editname().sendKeys("Edited");
		Thread.sleep(2000);
		//Click on 'OK' button
		Thread.sleep(500);
		action_obj.editdecok().click();
		//Assertion
		Assertion_obj.edit_assertion();
		Thread.sleep(2000);
	}
	@Test(priority=3)
	public void Deleting_Pictures_Contents_by_Business_User() throws InterruptedException{
		//Click on 'Delete' button
		action_obj.editdelete().click();
		Thread.sleep(500);
		
}
	@Test(priority=4)
	public void Posting_Video_Contents_By_Business_User() throws Exception{
		
		Thread.sleep(2000);
		//Entering data in status section
		action_obj.usercontentstatus().clear();
		Thread.sleep(500);
		action_obj.usercontentstatus().sendKeys("Classic Shortbread(Video For test purpose)");
		Thread.sleep(3000);
		//Uploading file
		
		
		((RemoteWebDriver) driver).setFileDetector(new LocalFileDetector());
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='content']/div[2]/div/div[2]/div/div[1]/form/div/div/div[3]/div[2]/input")).sendKeys("C:\\Users\\hello\\Documents\\video\\sample_mpeg4.mp4");	
		Thread.sleep(2000);
		
		//Scroll
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)", "");
		//Click on Post button
		Thread.sleep(1000);
		action_obj.postbutton().click();
		Thread.sleep(500);
		//Assertion
		Assertion_obj.addpost();
	}	
	
	@Test(priority=5)
	public void Editing_Video_Contents_by_Business_User() throws Exception{
		//Again click on 'Home'
		action_obj.home().click();
		Thread.sleep(1000);
		//Scroll
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(500);
		//Click on Edit button
		action_obj.recipesedit().click();
		Thread.sleep(2000);
		//Edit Name
		action_obj.editname().sendKeys("Edited");
		Thread.sleep(2000);
		//Click on 'OK' button
		action_obj.editdecok().click();
		Thread.sleep(500);
		//Assertion
		Assertion_obj.edit_assertion2();
		Thread.sleep(2000);
	}
	@Test(priority=6)
	public void Deleting_Video_Contents_by_Business_User() throws InterruptedException{
		//Click on 'Delete' button
		action_obj.editdelete().click();
		
	}
		@Test(priority=7)
		public void Posting_Recipe_Contents_by_Business_User() throws Exception{
			
			Thread.sleep(2000);
			//Entering data in status section
			action_obj.usercontentstatus().clear();
			Thread.sleep(500);
			action_obj.usercontentstatus().sendKeys("Classic Shortbread(Recipe For test purpose)");
			Thread.sleep(700);
			//Click on Recipes icon
			action_obj.usercontentrecipes().click();
			Thread.sleep(2000);
			//Assertion for Recipes pop-up
			Assertion_obj.Recipes_assertion();
			//Entering Recipe title
			action_obj.recipestitle().sendKeys("This easy recipe is crisp, crumbly and tender because we've added a little cornstarch to the flour.");
			//Entering Recipe Description
			action_obj.recipesdescription().sendKeys("This satisfying shortbread is as easy as it gets. It's simultaneously crisp, crumbly and tender because we've added a little cornstarch to the flour. And granulated sugar gives the cookies their gorgeous golden color.");
			Thread.sleep(500);
			//Entering Recipe Ingredients
			action_obj.recipesingredients().sendKeys("unsalted butter"+Keys.RETURN +"all-purpose flour"+Keys.RETURN + "cornstarch"+Keys.RETURN+"fine salt"+Keys.RETURN+"granulated sugar"+Keys.RETURN);
			Thread.sleep(500);
			//Entering Recipe Directions
			action_obj.recipesdirections().sendKeys("Position an oven rack in the center of the oven and preheat to 325 degrees F. Butter a 9-by-12-1/2-inch jelly roll pan and line it with parchment, then butter the paper. Whisk together the flour, cornstarch and salt in a "
					+ "bowl. Beat the butter and sugar with an electric mixer on medium speed until light and fluffy, 5 to 7 minutes.");
		    Thread.sleep(500);
		    //Entering Recipe Cooking time
			action_obj.recipesctime().sendKeys("90");
			Thread.sleep(3000);
		    //Uploading Photo
		    ((RemoteWebDriver) driver).setFileDetector(new LocalFileDetector());
			Thread.sleep(2000);
			driver.findElement(By.xpath(".//*[@class='file-upload']/input")).sendKeys("C:\\Users\\hello\\Documents\\images\\wallpaper2.jpg");	
			Thread.sleep(2000);

			//Scroll
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,1000)", "");
			//Click on Submit button
			action_obj.recipessubmit().click();
			Thread.sleep(1000);
			//Assertion
			Assertion_obj.add_assertion();
			Thread.sleep(3000);
			//Click on 'Home'
			action_obj.home().click();
			Thread.sleep(2000);
		}
		@Test(priority=8)
		public void Editing_Recipe_Contents_by_Business_User() throws Exception{
			//Again click on 'Home'
			action_obj.home().click();
			Thread.sleep(1000);
			//Scroll
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,500)", "");
			Thread.sleep(500);
			//Click on Edit button
			action_obj.recipesedit().click();
			Thread.sleep(2000);
			//Edit Name
			action_obj.editname().sendKeys("Edited");
			Thread.sleep(2000);
			//Click on 'OK' button
			action_obj.editdecok().click();
			Thread.sleep(1000);
			//Assertion
			Assertion_obj.updated();
			Thread.sleep(500);
			
		}
		@Test(priority=9)
		public void Deleting_Recipe_Contents_Contents_by_Business_User() throws InterruptedException{
			//Click on 'Delete' button
			action_obj.editdelete().click();
			Thread.sleep(500);
			
		}
		
		@Test(priority=10)
		public void Posting_Tutorials_Contents_by_Business_User() throws Exception{

			Thread.sleep(2000);
			//Entering data in status section
			action_obj.usercontentstatus().clear();
			Thread.sleep(500);
			action_obj.usercontentstatus().sendKeys("Classic Shortbread(Only For test purpose)");
			Thread.sleep(700);
			//Click on  icon
			action_obj.tutorials().click();
			Thread.sleep(2000);
			//Assertion for Recipes pop-up
			Assertion_obj.tutorial();
			//Entering Recipe title
			action_obj.recipestitle().sendKeys("Classic Shortbread(Tutorials For test purpose)");
			//Entering Recipe Description
			action_obj.recipesdescription().sendKeys("Enter your tutorial title here!!");
			 Thread.sleep(3000);
			    
			  //Uploading Photo
			    ((RemoteWebDriver) driver).setFileDetector(new LocalFileDetector());
				Thread.sleep(2000);
				driver.findElement(By.xpath(".//*[@class='file-upload']/input")).sendKeys("C:\\Users\\hello\\Documents\\images\\wallpaper2.jpg");	
				Thread.sleep(2000);
			//Scroll
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,1000)", "");
			//Click on Submit button
			action_obj.submittutorial().click();
			Thread.sleep(300);
			//Assertion
			Assertion_obj.tutorials_assertion();
			Thread.sleep(3000);
			//Click on 'Home'
			action_obj.home().click();
			Thread.sleep(2000);
		}
		@Test(priority=11)
		public void Editing_Tutorials_Contents_by_Business_User() throws Exception{
			//Again click on 'Home'
			action_obj.home().click();
			Thread.sleep(1000);
			//Scroll
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,100)", "");
			Thread.sleep(1000);
			//Click on Edit button
			action_obj.recipesedit().click();
			Thread.sleep(2000);
			//Edit Name
			action_obj.editname().sendKeys("Edited");
			Thread.sleep(2000);
			//Click on 'OK' button
			action_obj.editdecok().click();
			Thread.sleep(500);
			//Assertion
			Assertion_obj.edittu_assertion();
			Thread.sleep(1000);
			
		}
		@Test(priority=12)
		public void Deleting_Tutorials_Contents_by_Business_User() throws InterruptedException{
			//Click on 'Delete' button
			action_obj.editdelete().click();
			Thread.sleep(500);
			
		}		
	
	@Test(priority=13)
	public void Posting_Coupons_Contents_by_Business_User() throws Exception{
		
		Thread.sleep(3000);
		//Entering data in status section
		action_obj.usercontentstatus().clear();
		Thread.sleep(500);
		action_obj.usercontentstatus().sendKeys("Classic Shortbread(Only For test purpose)");
		Thread.sleep(700);
		//Click on Coupons icon
		action_obj.couponsbutton().click();
		Thread.sleep(1000);
		//Assertion Coupon pop-up
		Assertion_obj.coupons();
		Thread.sleep(500);
		//Coupon name
		action_obj.couponsname().sendKeys("Classic Shortbread(Only For test purpose)");
		Thread.sleep(500);
		//Select Coupon type
		Select type = new Select(driver.findElement(By.xpath("(//*[@class='form-group'])[2]/select")));
		Thread.sleep(500);
		type.selectByVisibleText("Meal");
		//Coupon Description
		action_obj.recipesdescription().sendKeys("Coupons Description!!");
		 Thread.sleep(3000);
		    
		  //Uploading Photo
		    ((RemoteWebDriver) driver).setFileDetector(new LocalFileDetector());
			Thread.sleep(2000);
			driver.findElement(By.xpath(".//*[@class='file-upload']/input")).sendKeys("C:\\Users\\hello\\Documents\\images\\wallpaper2.jpg");	
			Thread.sleep(2000);
		//Click on Submit button
		action_obj.submitcoupons().click();
		Thread.sleep(300);
		//Assertion
		Assertion_obj.coupons2();
		Thread.sleep(3000);
		driver.quit();
	}
}
