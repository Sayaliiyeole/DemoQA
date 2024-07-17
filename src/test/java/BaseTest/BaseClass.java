package BaseTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import PageObject.LoginPage;

public class BaseClass {

	public static WebDriver driver; 
	public static LoginPage LP;
	public static Properties prop;
	static FileInputStream FIS;
	public static JavascriptExecutor js;
	
	public static void initializePage() {
		LP = new LoginPage(driver);
		js =  (JavascriptExecutor)driver;
	}
	
	public static void propertyFileInitialization() throws IOException {
		FIS = new FileInputStream("../Automation_Practice/TestData/Data.properties");
		prop = new Properties();
		prop.load(FIS);
	}
	
}
