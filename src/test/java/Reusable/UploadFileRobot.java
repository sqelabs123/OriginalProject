package Reusable;


import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class UploadFileRobot {

	String url = "https://foodniche.me/";
	public Repo_Test action_obj;
	public Assertion_Test Assertion_obj;
	//public String Url="";
	public JavascriptExecutor executor;
	@Test
	@Parameters({"userId","password","url"})
	public void testUpload(String userId,String password,String url) throws Exception
	{
		
		String exePath = System.getProperty("user.dir") + "\\TestData\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
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
		Thread.sleep(5000);
		WebElement element = driver.findElement(By.xpath(".//*[@id='content']/div[2]/div/div[2]/div/div/form/div/div/div[3]/div[1]/input"));
		element.click();
		uploadFile("E:\\abc\\content_by_user.jpg");
		Thread.sleep(2000);
	}
	
	/**
     * This method will set any parameter string to the system's clipboard.
     */
	public static void setClipboardData(String string) {
		//StringSelection is a class that can be used for copy and paste operations.
		   StringSelection stringSelection = new StringSelection(string);
		   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		}
	
	public static void uploadFile(String fileLocation) {
        try {
        	//Setting clipboard with file location
            setClipboardData(fileLocation);
            //native key strokes for CTRL, V and ENTER keys
            Robot robot = new Robot();
	
            robot.keyPress(KeyEvent.VK_CONTROL);
            Thread.sleep(2000);
            robot.keyPress(KeyEvent.VK_V);
            Thread.sleep(2000);
            robot.keyRelease(KeyEvent.VK_V);
            Thread.sleep(2000);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(2000);
            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(2000);
            robot.keyRelease(KeyEvent.VK_ENTER);
            Thread.sleep(2000);
        } catch (Exception exp) {
        	exp.printStackTrace();
        }
    }
}