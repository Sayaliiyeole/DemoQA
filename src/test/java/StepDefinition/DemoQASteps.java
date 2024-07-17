package StepDefinition;

import java.awt.Window;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

import BaseTest.BaseClass;
import io.cucumber.java.en.*;

public class DemoQASteps extends BaseClass {

	@Given("user launches URL")
	public void user_launches_url() {
		driver.get(prop.getProperty("URL"));

	}

	@When("user enters login credentials")
	public void user_enters_login_credentials() {
		LP.enterCredentials();
	}

	@When("user click on Submit Button")
	public void user_click_on_submit_button() {
		LP.submitDetails();

	}

	@Then("user open new Tab and switchto frame")
	public void user_open_new_tab_and_switchto_frame() {
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://demoqa.com/frames");

		driver.switchTo().frame(driver.findElement(By.id("frame1")));
		System.out.print(driver.findElement(By.id("sampleHeading")).getText());

	}

	@Then("user open new Window")
	public void user_open_new_window() {
		//driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://demoqa.com/browser-windows");
		WebElement window = driver.findElement(By.xpath("//button[@id='windowButton']"));
		js.executeScript("arguments[0].scrollIntoView;", window);
		js.executeScript("arguments[0].click();", window);
		
		String parentwindow = driver.getWindowHandle();
		Set<String> allwindows = driver.getWindowHandles();
		Iterator<String> ITR = allwindows.iterator();
		while (ITR.hasNext()) {
			String childwindow = ITR.next();
			if (!parentwindow.equals(parentwindow)) {
				driver.switchTo().window(childwindow);

				String message =	driver.switchTo().window(childwindow).getTitle();
				System.out.println(message);
			}
		}
	}

}