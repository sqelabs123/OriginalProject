package Reusable;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Properties;

//import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
 
 
public class Repo_Test {
	 
	public WebDriver driver;
	public static String last="";
	 JavascriptExecutor executor = (JavascriptExecutor)driver;
		
	
	public Repo_Test(WebDriver driver) {
		// TODO Auto-generated constructor stub
 		this.driver=driver;

 		
	}
	Properties prop;
	String  path = System.getProperty("user.dir") + "\\TestData\\UI.properties";
	   ObjectMap_Test objMap = new ObjectMap_Test(path);
   
        
        
     
	   public String date()
	   {
		   Date date = new Date();
		 //current date user entry
		  last=date.toString();
		 System.out.println("The Time Is :-----------"+last);
		 last= last.replace(":", "");
		 last=last.replace(" ", "");

		 // display time and date using toString()
		 System.out.println(last);
		return last;
 	   }
	
	   //Locating the signin link
	 		public WebElement signwithemail()   
	 		{		
	 			try {
	 				WebDriverWait wait= new WebDriverWait(driver,60);
	 				System.out.println("	*Sign with email should be displayed");
	 				WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("signwithemail")));
	 				return   ele; 
	 			} catch (Exception e) {
	 				Reporter.log("*Sign with email not displayed-----"+e.getLocalizedMessage());
	 				System.out.println("	*Sign with email not displayed-----");

	 			}
	 			return null;
	 		}
	 		
	 	//Locating signin link 2
	 		public WebElement signin()   
	 		{		
	 			try {
	 				WebDriverWait wait= new WebDriverWait(driver,60);
	 				System.out.println("	*Signin should be displayed");
	 				WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("signin")));
	 				return   ele; 
	 			} catch (Exception e) {
	 				Reporter.log("*Signin not displayed-----"+e.getLocalizedMessage());
	 				System.out.println("	*Signin not displayed-----");

	 			}
	 			return null;
	 		}
	   	
		//Locating the userName text filed
		public WebElement username()   
		{		
			try {
				WebDriverWait wait= new WebDriverWait(driver,60);
				System.out.println("	*UserName Text field should be displayed");
				WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("username")));
				return   ele; 
			} catch (Exception e) {
				Reporter.log("*UserName Text field not displayed-----"+e.getLocalizedMessage());
				System.out.println("	*UserName Text field not displayed-----");

			}
			return null;
		}
		//Locating the Password text filed
				public WebElement Password()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*Password Text field should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("signinpassword")));
						return   ele; 
					} catch (Exception e) {
						Reporter.log("*Password Text field not displayed-----"+e.getLocalizedMessage());
						System.out.println("	*Password Text field not displayed-----");

					}
					return null;
				}
				//Locating the login button
				public WebElement loginbutton()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*Login button should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("loginbutton")));
						return   ele; 
					} catch (Exception e) {
						Reporter.log("*Login button not displayed-----"+e.getLocalizedMessage());
						System.out.println("	*Login button not displayed-----");

					}
					return null;
				}
				
				//Locating the signup link
				public WebElement signuplink()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*Signup link should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("signup")));
						return   ele; 
					} catch (Exception e) {
						Reporter.log("*signup link not displayed-----"+e.getLocalizedMessage());
						System.out.println("	*signup link not displayed-----");
					}
					return null;
				}
				
				//Locating the signup assert
				public WebElement signupassert()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*Signup assertion text should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("signupassert")));
						return   ele; 
					} catch (Exception e) {
						Reporter.log("*Signup assertion not displayed-----"+e.getLocalizedMessage());
						System.out.println("	*Signup assertion not displayed-----");
					}
					return null;
				}
				
				//Locating the Firstname
				public WebElement Firstname()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*Firstname textbox should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("firstname")));
						return   ele; 
					} catch (Exception e) {
						Reporter.log("*Firstname textbox not displayed-----"+e.getLocalizedMessage());
						System.out.println("	*Firstname textbox not displayed-----");
					}
					return null;
				}
				
				//Locating the Lastname
				public WebElement lastname()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*Lastname textbox should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("lastname")));
						return   ele; 
					} catch (Exception e) {
						Reporter.log("*Lastname textbox not displayed-----"+e.getLocalizedMessage());
						System.out.println("	*Lastname textbox not displayed-----");
					}
					return null;
				}
				
				//Locating the signupemail
				public WebElement signupemail()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*Signup email textbox should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("signupemail")));
						return   ele; 
					} catch (Exception e) {
						Reporter.log("*Signup email textbox not displayed-----"+e.getLocalizedMessage());
						System.out.println("	*Signup email textbox not displayed-----");
					}
					return null;
				}
				
				//Locating the password
				public WebElement signuppassword()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*Password textbox should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("password")));
						return   ele; 
					} catch (Exception e) {
						Reporter.log("*Password textbox not displayed-----"+e.getLocalizedMessage());
						System.out.println("	*Password textbox not displayed-----");
					}
					return null;
				}
				
				//Locating the signup checkin
				public WebElement signupcheckin()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*Signup checkin box should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("signupcheckin")));
						return   ele; 
					} catch (Exception e) {
						Reporter.log("*Signup checkin box not displayed-----"+e.getLocalizedMessage());
						System.out.println("	*Signup checkin box not displayed-----");
					}
					return null;
				}
				
				//Locating the joinfree button	
				public WebElement joinfreebutton()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*Join free button should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("joinfreebutton")));
						return   ele; 
					} catch (Exception e) {
						Reporter.log("*Join free button not displayed-----"+e.getLocalizedMessage());
						System.out.println("	*Join free button not displayed-----");
					}
					return null;
				}
				
				//Locating the Discover Nourishing Meal button	
				public WebElement dnmuser()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*Discover Nourishing Meal button should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("dnmuser")));
						return   ele; 
					} catch (Exception e) {
						Reporter.log("*Discover Nourishing Meal button not displayed-----"+e.getLocalizedMessage());
						System.out.println("	*Discover Nourishing Meal button not displayed-----");
					}
					return null;
				}
				
				//Locating the Discover Nourishing Meal assertion	
				public WebElement dnmuserassert()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*Discover Nourishing Meal assertion should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("dnmuserassert")));
						return   ele; 
					} catch (Exception e) {
						Reporter.log("*Discover Nourishing Meal assertion not displayed-----"+e.getLocalizedMessage());
						System.out.println("	*Discover Nourishing Meal assertion not displayed-----");
					}
					return null;
				}
								
				//Locating the signup country	
				public WebElement signupcountry()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*Signup country textbox should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("signupcountry")));
						return   ele; 
					} catch (Exception e) {
						Reporter.log("*Signup country textbox not displayed-----"+e.getLocalizedMessage());
						System.out.println("	*Signup country textbox not displayed-----");
					}
					return null;
				}
				
				//Locating the signup zipcode	
				public WebElement signupzipcode()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*Signup zipcode textbox should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("signupzipcode")));
						return   ele; 
					} catch (Exception e) {
						Reporter.log("*Signup zipcode textbox not displayed-----"+e.getLocalizedMessage());
						System.out.println("	*Signup zipcode textbox not displayed-----");
					}
					return null;
				}
				
				//Locating the upload user dp	
				public WebElement uploaduserdp()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*Upload user dp should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("uploaduserdp")));
						return   ele; 
					} catch (Exception e) {
						Reporter.log("*Upload user dp not displayed-----"+e.getLocalizedMessage());
						System.out.println("	*Upload user dp not displayed-----");
					}
					return null;
				}
				
				//Locating the next button	
				public WebElement nextbutton()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*Next button should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("nextbutton")));
						return   ele; 
					} catch (Exception e) {
						Reporter.log("*Next button not displayed-----"+e.getLocalizedMessage());
						System.out.println("	*Next button not displayed-----");
					}
					return null;
				}
				
				//Locating the follow 1st button
				public WebElement follow1()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*follow 1st button should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("follow1")));
						return   ele; 
					} catch (Exception e) {
						Reporter.log("*follow 1st button not displayed-----"+e.getLocalizedMessage());
						System.out.println("	*follow 1st button not displayed-----");
					}
					return null;
				}
				
				//Locating the follow 2nd button
				public WebElement follow2()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*follow 2nd button should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("follow2")));
						return   ele; 
					} catch (Exception e) {
						Reporter.log("*follow 2nd button not displayed-----"+e.getLocalizedMessage());
						System.out.println("	*follow 2nd button not displayed-----");
					}
					return null;
				}
				
				//Locating the follow 3rd button
				public WebElement follow3()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*follow 3rd button should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("follow3")));
						return   ele; 
					} catch (Exception e) {
						Reporter.log("*follow 3rd button not displayed-----"+e.getLocalizedMessage());
						System.out.println("	*follow 3rd button not displayed-----");
					}
					return null;
				}
				
				//Locating the follow 4th button
				public WebElement follow4()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*follow 4th button should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("follow4")));
						return   ele; 
					} catch (Exception e) {
						Reporter.log("*follow 4th button not displayed-----"+e.getLocalizedMessage());
						System.out.println("	*follow 4th button not displayed-----");
					}
					return null;
				}
				
				//Locating the follow getstarted button
				public WebElement getstarted()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*Get Started button should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("getstarted")));
						return   ele; 
					} catch (Exception e) {
						Reporter.log("*Get Started button not displayed-----"+e.getLocalizedMessage());
						System.out.println("	*Get Started button not displayed-----");
					}
					return null;
				}
				//Locating the follow logout button
				public WebElement logoutbutton()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*Logout button should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("logoutbutton")));
						return   ele; 
					} catch (Exception e) {
						Reporter.log("*Logout button not displayed-----"+e.getLocalizedMessage());
						System.out.println("	*Logout button not displayed-----");
					}
					return null;
				}
				
				//Locating the promote business button
				public WebElement promotebusiness()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*Promote business should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("promotebusiness")));
						return   ele;
					} catch (Exception e){
						Reporter.log("*Promote business button not displayed-----"+e.getLocalizedMessage());
						System.out.println("	*Promote business button not displayed-----");
					}
					return null;
				}
				
				//Locating the promote business name
				public WebElement businessname()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*Business name should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("businessname")));
						return   ele;
					} catch (Exception e){
						Reporter.log("Business name button not displayed-----"+e.getLocalizedMessage());
						System.out.println("	Business name not displayed-----");
					}
					return null;
				}
				
				//Locating the Business registration
				public WebElement businesspage()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*Business page should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("businesspage")));
						return   ele;
					} catch (Exception e){
						Reporter.log("Business page not displayed-----"+e.getLocalizedMessage());
						System.out.println("	Business page not displayed-----");
					}
					return null;
				}
				
				//Locating the Business registration description
				public WebElement businessdes()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*Business page Description should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("businessdes")));
						return   ele;
					} catch (Exception e){
						Reporter.log("Business page description not displayed-----"+e.getLocalizedMessage());
						System.out.println("	Business page description not displayed-----");
					}
					return null;
				}
								
				//Locating the Business category registration
				public WebElement businesscategory()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*Business page category should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("businesscategory")));
						return   ele;
					} catch (Exception e){
						Reporter.log("Business page category not displayed-----"+e.getLocalizedMessage());
						System.out.println("	Business page category not displayed-----");
					}
					return null;
				}
				
				//Locating the Business website registration
				public WebElement businesswebsite()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*Business page website should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("businesswebsite")));
						return   ele;
					} catch (Exception e){
						Reporter.log("Business page website not displayed-----"+e.getLocalizedMessage());
						System.out.println("	Business page website not displayed-----");
					}
					return null;
				}
				
				//Locating the Business zipcode registration
				public WebElement businesszipcode()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*Business page website should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("businesszipcode")));
						return   ele;
					} catch (Exception e){
						Reporter.log("Business page website not displayed-----"+e.getLocalizedMessage());
						System.out.println("	Business page website not displayed-----");
					}
					return null;
				}
				//Locating the Business email registration
				public WebElement businessemail()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*Business page email should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("businessemail")));
						return   ele;
					} catch (Exception e){
						Reporter.log("Business page email not displayed-----"+e.getLocalizedMessage());
						System.out.println("	Business page email not displayed-----");
					}
					return null;
				}
				//Locating the Business registration profile photo
				public WebElement businessdp()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*Business page Profile Photo should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("businessdp")));
						return   ele;
					} catch (Exception e){
						Reporter.log("Business page Profile Photo not displayed-----"+e.getLocalizedMessage());
						System.out.println("	Business page Profile Photo not displayed-----");
					}
					return null;
				}
				//Locating the Business registration checkbox
				public WebElement businesscheckbox()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*Business page Check box should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("businesscheckbox")));
						return   ele;
					} catch (Exception e){
						Reporter.log("Business page Check box not displayed-----"+e.getLocalizedMessage());
						System.out.println("	Business page Check box not displayed-----");
					}
					return null;
				}
				
				//Locating the Business registration Submit button
				public WebElement businesssubmit()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*Business page Submit Button should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("businesssubmitbutton")));
						return   ele;
					} catch (Exception e){
						Reporter.log("Business page Submit Button not displayed-----"+e.getLocalizedMessage());
						System.out.println("	Business page Submit Button not displayed-----");
					}
					return null;
				}
				
				//Locating the Business get started button
				public WebElement businessgetstarted()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*Business get started button should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("businessgetstarted")));
						return   ele;
					} catch (Exception e){
						Reporter.log("Business get started button not displayed-----"+e.getLocalizedMessage());
						System.out.println("	Business get started button not displayed-----");
					}
					return null;
				}
				
				//Locating the Business Payment information
				public WebElement businesspayinfo()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*Business Payment information should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("businesspayinfo")));
						return   ele;
					} catch (Exception e){
						Reporter.log("Business Payment information not displayed-----"+e.getLocalizedMessage());
						System.out.println("	Business Payment information not displayed-----");
					}
					return null;
				}
				//Locating the assertion Payment information
				public WebElement payinfoassert()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*Assertion Payment information should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("payinfoassert")));
						return   ele;
					} catch (Exception e){
						Reporter.log("Assertion Payment information not displayed-----"+e.getLocalizedMessage());
						System.out.println("	Assertion Payment information not displayed-----");
					}
					return null;
				}
				//Locating the Payment information Card number
				public WebElement cardnumber()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*Card Number Payment information should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("cardnumber")));
						return   ele;
					} catch (Exception e){
						Reporter.log("Card Number Payment information not displayed-----"+e.getLocalizedMessage());
						System.out.println("	Card Number Payment information not displayed-----");
					}
					return null;
				}
				//Locating the CVC
				public WebElement cvc()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*CVC Payment information should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("cvc")));
						return   ele;
					} catch (Exception e){
						Reporter.log("CVC Payment information not displayed-----"+e.getLocalizedMessage());
						System.out.println("	CVC Payment information not displayed-----");
					}
					return null;
				}
				
				//Locating the Expiry
				public WebElement expiry()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*Expiry Payment information should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("expiry")));
						return   ele;
					} catch (Exception e){
						Reporter.log("Expiry Payment information not displayed-----"+e.getLocalizedMessage());
						System.out.println("	Expiry Payment information not displayed-----");
					}
					return null;
				}
				//Locating the Submit button
				public WebElement submit()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*Submit Payment information should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("payinfosubmit")));
						return   ele;
					} catch (Exception e){
						Reporter.log("Submit Payment information not displayed-----"+e.getLocalizedMessage());
						System.out.println("	Submit Payment information not displayed-----");
					}
					return null;
				}
				//Locating the User Content Status
				public WebElement usercontentstatus()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*User Content Status should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("usercontentstatus")));
						return   ele;
					} catch (Exception e){
						Reporter.log("User Content Status not displayed-----"+e.getLocalizedMessage());
						System.out.println("	User Content Status not displayed-----");
					}
					return null;
				}
				//Locating the User Content Picture
				public WebElement usercontentpicture()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*User Content Picture should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("usercontentpicture")));
						return   ele;
					} catch (Exception e){
						Reporter.log("User Content Picture not displayed-----"+e.getLocalizedMessage());
						System.out.println("	User Content Picture not displayed-----");
					}
					return null;
				}
				
				//Locating the User Content Video
				public WebElement usercontentvideo()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*User Content Video should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("usercontentvideo")));
						return   ele;
					} catch (Exception e){
						Reporter.log("User Content Video not displayed-----"+e.getLocalizedMessage());
						System.out.println("	User Content Video not displayed-----");
					}
					return null;
				}
				
				//Locating the User Content Recipes
				public WebElement usercontentrecipes()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*User Content Recipes should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("usercontentrecipes")));
						return   ele;
					} catch (Exception e){
						Reporter.log("User Content Recipes not displayed-----"+e.getLocalizedMessage());
						System.out.println("	User Content Recipes not displayed-----");
					}
					return null;
				}
				
				//Locating the User Content Recipes popup
				public WebElement createrecipespopup()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*User Content Create Recipes pop-up should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("createrecipespopup")));
						return   ele;
					} catch (Exception e){
						Reporter.log("User Content Create Recipes pop-up not displayed-----"+e.getLocalizedMessage());
						System.out.println("	User Content Create Recipes pop-up not displayed-----");
					}
					return null;
				}
				
				//Locating the User Content Recipes Title
				public WebElement recipestitle()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*User Content Recipes Title should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("recipestitle")));
						return   ele;
					} catch (Exception e){
						Reporter.log("User Content Recipes Title not displayed-----"+e.getLocalizedMessage());
						System.out.println("	User Content Recipes Title not displayed-----");
					}
					return null;
				}
				
				//Locating the User Content Recipes description
				public WebElement recipesdescription()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*User Content Recipes description should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("recipesdescription")));
						return   ele;
					} catch (Exception e){
						Reporter.log("User Content Recipes description not displayed-----"+e.getLocalizedMessage());
						System.out.println("	User Content Recipes description not displayed-----");
					}
					return null;
				}
				
				//Locating the User Content Recipes ingredients
				public WebElement recipesingredients()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*User Content Recipes ingredients should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("recipesingredients")));
						return   ele;
					} catch (Exception e){
						Reporter.log("User Content Recipes ingredients not displayed-----"+e.getLocalizedMessage());
						System.out.println("	User Content Recipes ingredients not displayed-----");
					}
					return null;
				}
				
				//Locating the User Content Recipes directions
				public WebElement recipesdirections()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*User Content Recipes directions should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("recipesdirections")));
						return   ele;
					} catch (Exception e){
						Reporter.log("User Content Recipes directions not displayed-----"+e.getLocalizedMessage());
						System.out.println("	User Content Recipes directions not displayed-----");
					}
					return null;
				}
				
				//Locating the User Content Recipes cooking time
				public WebElement recipesctime()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*User Content Recipes cooking time should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("recipesctime")));
						return   ele;
					} catch (Exception e){
						Reporter.log("User Content Recipes cooking time not displayed-----"+e.getLocalizedMessage());
						System.out.println("	User Content Recipes cooking time not displayed-----");
					}
					return null;
				}
				//Locating the User Content Recipes Photo
				public WebElement recipesuploadphoto()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*User Content Recipes Photo should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("recipesuploadphoto")));
						return   ele;
					} catch (Exception e){
						Reporter.log("User Content Recipes Photo not displayed-----"+e.getLocalizedMessage());
						System.out.println("	User Content Recipes Photo not displayed-----");
					}
					return null;
				}
				//Locating the User Content Recipes Submit
				public WebElement recipessubmit()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*User Content Recipes Submit should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("recipessubmit")));
						return   ele;
					} catch (Exception e){
						Reporter.log("User Content Recipes Submit not displayed-----"+e.getLocalizedMessage());
						System.out.println("	User Content Recipes Submit not displayed-----");
					}
					return null;
				}
				//Locating the User Content Recipes Edit
				public WebElement recipesedit()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*User Content Recipes Edit should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("recipesedit")));
						return   ele;
					} catch (Exception e){
						Reporter.log("User Content Recipes Edit not displayed-----"+e.getLocalizedMessage());
						System.out.println("	User Content Recipes Edit not displayed-----");
					}
					return null;
				}
				
				//Locating the User Content Recipes Edit description
				public WebElement editname()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*User Content Recipes Edit description should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("editname")));
						return   ele;
					} catch (Exception e){
						Reporter.log("User Content Recipes Edit description not displayed-----"+e.getLocalizedMessage());
						System.out.println("	User Content Recipes Edit description not displayed-----");
					}
					return null;
				}
				
				//Locating the User Content Recipes Edit OK button
				public WebElement editdecok()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*User Content Recipes Edit OK button description should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("editdecok")));
						return   ele;
					} catch (Exception e){
						Reporter.log("User Content Recipes Edit OK button description not displayed-----"+e.getLocalizedMessage());
						System.out.println("	User Content Recipes Edit OK button description not displayed-----");
					}
					return null;
				}
				//Locating the User Content Recipes Edit Delete button
				public WebElement editdelete()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*User Content Recipes Edit Delete button description should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("editdelete")));
						return   ele;
					} catch (Exception e){
						Reporter.log("User Content Recipes Edit Delete button description not displayed-----"+e.getLocalizedMessage());
						System.out.println("	User Content Recipes Edit Delete button description not displayed-----");
					}
					return null;
				}
				//Locating the home button
				public WebElement home()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*Home button description should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("home")));
						return   ele;
					} catch (Exception e){
						Reporter.log("Home button description not displayed-----"+e.getLocalizedMessage());
						System.out.println("	Home button description not displayed-----");
					}
					return null;
				}
				
				//Locating the Edit assert
				public WebElement editassert()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*Edit assert should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("editaddassert")));
						return   ele;
					} catch (Exception e){
						Reporter.log("Edit assert not displayed-----"+e.getLocalizedMessage());
						System.out.println("	Edit assert not displayed-----");
					}
					return null;
				}
				
				//Locating the Group assert
				public WebElement groupassert()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*Group assert should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("editaddassert")));
						return   ele;
					} catch (Exception e){
						Reporter.log("Group assert not displayed-----"+e.getLocalizedMessage());
						System.out.println("	Group assert not displayed-----");
					}
					return null;
				}
				
				
				//Locating the Add assert
				public WebElement addassert()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*Add assert should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("editaddassert")));
						return   ele;
					} catch (Exception e){
						Reporter.log("Add assert not displayed-----"+e.getLocalizedMessage());
						System.out.println("	Add assert not displayed-----");
					}
					return null;
				}
				//Locating the forgot password
				public WebElement forgotpassword()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*Forgot Password should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("forgotpassword")));
						return   ele;
					} catch (Exception e){
						Reporter.log("Forgot Password not displayed-----"+e.getLocalizedMessage());
						System.out.println("	Forgot Password not displayed-----");
					}
					return null;
				}
				
				//Locating the username forgot password
				public WebElement usernameforgotpassword()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*User name field for Forgot Password should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("usernameforgotpassword")));
						return   ele;
					} catch (Exception e){
						Reporter.log("User name field for Forgot Password not displayed-----"+e.getLocalizedMessage());
						System.out.println("	User name field for Forgot Password not displayed-----");
					}
					return null;
				}
				
				//Locating the Restore password
				public WebElement restorepassword()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*Restore Password should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("restorepassword")));
						return   ele;
					} catch (Exception e){
						Reporter.log("Restore Password not displayed-----"+e.getLocalizedMessage());
						System.out.println("	Restore Password not displayed-----");
					}
					return null;
				}
				//Locating the forgot password
				public WebElement forgotpwdassert()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*Forgot Password message should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("forgotpwdassert")));
						return   ele;
					} catch (Exception e){
						Reporter.log("Forgot Password message not displayed-----"+e.getLocalizedMessage());
						System.out.println("	Forgot Password message not displayed-----");
					}
					return null;
				}
				//Locating the close icon
				public WebElement closeicon()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*Close Icon should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("closeicon")));
						return   ele;
					} catch (Exception e){
						Reporter.log("Close Icon not displayed-----"+e.getLocalizedMessage());
						System.out.println("	Close Icon not displayed-----");
					}
					return null;
				}
				//Locating the close icon
				public WebElement businessconfirm()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*Business confirm message should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("editaddassert")));
						return   ele;
					} catch (Exception e){
						Reporter.log("Business confirm message not displayed-----"+e.getLocalizedMessage());
						System.out.println("	Business confirm message not displayed-----");
					}
					return null;
				}
				//Locating the Facebook Signin
				public WebElement facebooksignin()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*Facebook Signin should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("facebooksignin")));
						return   ele;
					} catch (Exception e){
						Reporter.log("Facebook Signin not displayed-----"+e.getLocalizedMessage());
						System.out.println("	Facebook Signin not displayed-----");
					}
					return null;
				}
				//Locating the Facebook assert
				public WebElement fbassert()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*Facebook Signin page assertion should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("fbassert")));
						return   ele;
					} catch (Exception e){
						Reporter.log("Facebook Signin page assertion not displayed-----"+e.getLocalizedMessage());
						System.out.println("	Facebook Signin page assertion not displayed-----");
					}
					return null;
				}

				//Locating the User Registration
				public WebElement userregistration()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*User Registration assertion should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("userregistration")));
						return   ele;
					} catch (Exception e){
						Reporter.log("User Registration assertion not displayed-----"+e.getLocalizedMessage());
						System.out.println("	User Registration assertion not displayed-----");
					}
					return null;
				}
				
				//Locating Step3 assertion
				public WebElement step3assert()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*Step 3 assertion should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("step3assert")));
						return   ele;
					} catch (Exception e){
						Reporter.log("Step 3 assertion not displayed-----"+e.getLocalizedMessage());
						System.out.println("	Step 3 assertion not displayed-----");
					}
					return null;
				}
				
				//Locating content name assertion
				public WebElement contentname()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*Content name assertion should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("contentname")));
						return   ele;
					} catch (Exception e){
						Reporter.log("Post Content name assertion not displayed-----"+e.getLocalizedMessage());
						System.out.println("	Post Content name assertion not displayed-----");
					}
					return null;
				}
				
				//Locating post button
				public WebElement postbutton()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*Post button should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("postbutton")));
						return   ele;
					} catch (Exception e){
						Reporter.log("Post button not displayed-----"+e.getLocalizedMessage());
						System.out.println("	Post button not displayed-----");
					}
					return null;
				}
				//Locating edit area
				public WebElement editarea()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*Edit area should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("editarea")));
						return   ele;
					} catch (Exception e){
						Reporter.log("Edit area not displayed-----"+e.getLocalizedMessage());
						System.out.println("	Edit area not displayed-----");
					}
					return null;
				}
				
				//Locating Tutorials
				public WebElement tutorials()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*Tutorials should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("tutorials")));
						return   ele;
					} catch (Exception e){
						Reporter.log("Tutorials not displayed-----"+e.getLocalizedMessage());
						System.out.println("	Tutorials not displayed-----");
					}
					return null;
				}
				
				
				//Locating submit Tutorials
				public WebElement submittutorial()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*Tutorials submit button should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("tutorialsubmit")));
						return   ele;
					} catch (Exception e){
						Reporter.log("Tutorials submit button not displayed-----"+e.getLocalizedMessage());
						System.out.println("	Tutorials submit buttonnot displayed-----");
					}
					return null;
				}
				
				//Locating Tutorials assertion edit
				public WebElement tutorialsassertion()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*Tutorials Edit should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("tutorialsassertion")));
						return   ele;
					} catch (Exception e){
						Reporter.log("Tutorials Edit not displayed-----"+e.getLocalizedMessage());
						System.out.println("	Tutorials Edit not displayed-----");
					}
					return null;
				}
				
				//Locating coupons button
				public WebElement couponsbutton()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*Coupons Button should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("couponsbutton")));
						return   ele;
					} catch (Exception e){
						Reporter.log("Coupons Button not displayed-----"+e.getLocalizedMessage());
						System.out.println("	Coupons Button not displayed-----");
					}
					return null;
				}
				
				//Locating coupons name
				public WebElement couponsname()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*Coupons name should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("couponsname")));
						return   ele;
					} catch (Exception e){
						Reporter.log("Coupons name not displayed-----"+e.getLocalizedMessage());
						System.out.println("	Coupons name not displayed-----");
					}
					return null;
				}
				//Locating coupons submit
				public WebElement submitcoupons()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*Submit coupons  should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("submitcoupons")));
						return   ele;
					} catch (Exception e){
						Reporter.log("submit coupons  not displayed-----"+e.getLocalizedMessage());
						System.out.println("	Submit coupons  not displayed-----");
					}
					return null;
				}
				
				//Locating mygroup menu
				public WebElement mygroup()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*My Group menu should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("mygroup")));
						return   ele;
					} catch (Exception e){
						Reporter.log("My Group menu not displayed-----"+e.getLocalizedMessage());
						System.out.println("	My Group menu not displayed-----");
					}
					return null;
				}
				
				//Locating Create group button
				public WebElement creategroup()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*Create group button should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("creategroup")));
						return   ele;
					} catch (Exception e){
						Reporter.log("Create group button not displayed-----"+e.getLocalizedMessage());
						System.out.println("	Create group button not displayed-----");
					}
					return null;
				}
				//Locating group name
				public WebElement groupname()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*Group name should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("groupname")));
						return   ele;
					} catch (Exception e){
						Reporter.log("Group name not displayed-----"+e.getLocalizedMessage());
						System.out.println("	Group name not displayed-----");
					}
					return null;
				}
				//Locating group submit
				public WebElement groupsubmit()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*Group Submit button should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("groupsubmit")));
						return   ele;
					} catch (Exception e){
						Reporter.log("Group Submit button not displayed-----"+e.getLocalizedMessage());
						System.out.println("	Group Submit button not displayed-----");
					}
					return null;
				}
				//Locating group description
				public WebElement groupdescription()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*Group Description should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("groupdescription")));
						return   ele;
					} catch (Exception e){
						Reporter.log("Group Description not displayed-----"+e.getLocalizedMessage());
						System.out.println("	Group Descriptionn not displayed-----");
					}
					return null;
				}
				//Locating groupassert1
				public WebElement groupassert1()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*Group assert1 should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("groupassert1")));
						return   ele;
					} catch (Exception e){
						Reporter.log("Group assert1 not displayed-----"+e.getLocalizedMessage());
						System.out.println("	Group assert1 not displayed-----");
					}
					return null;
				}
				//Locating groupassert2
				public WebElement groupassert2()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*Group assert2 should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("groupassert2")));
						return   ele;
					} catch (Exception e){
						Reporter.log("Group assert2 not displayed-----"+e.getLocalizedMessage());
						System.out.println("	Group assert2 not displayed-----");
					}
					return null;
				}
				//Locating the User Content Recipes Photo
				public WebElement uploaderworking()   
				{		
					try {
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("	*User Content Recipes Photo should be displayed");
						WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("uploaderworking")));
						return   ele;
					} catch (Exception e){
						Reporter.log("User Content Recipes Photo not displayed-----"+e.getLocalizedMessage());
						System.out.println("	User Content Recipes Photo not displayed-----");
					}
					return null;
				}
				
				
				
				
	}



