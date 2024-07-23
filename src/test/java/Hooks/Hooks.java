package Hooks;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;

import BaseTest.BaseClass;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {

	@Before
	public void launchBrowser() throws IOException, AWTException {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		initializePage();
		propertyFileInitialization();

	}
	
//	//@After
//	public void closeDriver() {
//		driver.close();
//	}

}
