package Utility;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseTest.BaseClass;

public class utillities extends BaseClass {

	public static void selectGender(String gender) {
		List<WebElement> listofgender = driver
				.findElements(By.xpath("//input[@name='gender']//following-sibling::label"));
		for (WebElement e : listofgender) {
			if (e.getText().equalsIgnoreCase(gender)) {
				System.out.println(e.getText());
				js.executeScript("arguments[0].scrollIntoView;",e);
				wait(15);
				js.executeScript("arguments[0].click();", e);
				break;
			}
		}

	}

	public static void wait(int t) {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(t));
	}

}
