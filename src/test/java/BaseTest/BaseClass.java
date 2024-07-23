package BaseTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import PageObject.LoginPage;

public class BaseClass {

	public static WebDriver driver; 
	public static LoginPage LP;
	public static Properties prop;
	static FileInputStream FIS;
	public static JavascriptExecutor js;
	public static Robot r;
	public static Actions ac;
	public static void initializePage() throws AWTException {
		LP = new LoginPage(driver);
		js =  (JavascriptExecutor)driver;
		 r = new Robot();
		  ac = new Actions(driver);
	}
	
	public static void propertyFileInitialization() throws IOException {
		FIS = new FileInputStream("../Automation_Practice/TestData/Data.properties");
		prop = new Properties();
		prop.load(FIS);
	}
	
}
