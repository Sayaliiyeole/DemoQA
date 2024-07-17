package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseTest.BaseClass;
import Utility.utillities;

public class LoginPage extends utillities  {
	WebDriver driver;
	
	public LoginPage(WebDriver driver){
	 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id ="firstName")
	WebElement FirstName;
	
	@FindBy(id ="lastName")
	WebElement LastName;
	
	@FindBy(id ="userEmail")
	WebElement EmailID;
	
	@FindBy(xpath ="input[@name='gender']")
	WebElement gender;
	
	@FindBy(id ="userNumber")
	WebElement MobNo;
	
	@FindBy(id ="dateOfBirthInput")
	WebElement DOB;
	
	
	@FindBy(id ="currentAddress")
	WebElement Address;
	
	@FindBy(id ="submit")
	WebElement Submit;
	
	@FindBy(id="frame1")
	WebElement frame;
	
	@FindBy(id="sampleHeading")
	WebElement frameelement;
	
	
	public void enterCredentials() {
		

		FirstName.sendKeys(prop.getProperty("FirstName"));
		LastName.sendKeys(prop.getProperty("LastName"));
		EmailID.sendKeys(prop.getProperty("Email"));
	    selectGender(prop.getProperty("Gender"));
		MobNo.sendKeys(prop.getProperty("MobileNum"));
//		DOB.clear();
//		DOB.sendKeys(prop.getProperty("DOB"));
		Address.sendKeys(prop.getProperty("Address"));
	}
	
	public void submitDetails() {
		wait(15);
		js.executeScript("arguments[0].click();", Submit);
		//Submit.click();
	}
	
	
}
