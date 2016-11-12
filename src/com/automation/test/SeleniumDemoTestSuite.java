package com.automation.test;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.automation.common.WebDriverTest;
import com.automation.page.GoogleHomeTestPage;
import com.automation.page.SearchResulTestPage;
import com.google.common.base.Verify;

public class SeleniumDemoTestSuite extends WebDriverTest {

	@Test
	public void TC_DEMO_01() {

		GoogleHomeTestPage googleHomePage = new GoogleHomeTestPage();
		googleHomePage.launchPage();

		if (googleHomePage.getSearchInputBox().isDisplayed()) {
			Reporter.log("Google home page displayed successfully!!");
		} else {
			Reporter.log("Unable to display google home page!!");
		}

		Verify.verify(googleHomePage.getSearchInputBox().isDisplayed(),
				"Successful");
		googleHomePage.getSearchInputBox().sendKeys(
				props.getProperty("search.text"));

		SearchResulTestPage searchResulPage = new SearchResulTestPage();
		searchResulPage.waitForPageToLoad();

		searchResulPage.getSearchButton().click();

		searchResulPage.clickOnFirstLink();

		/*
		 * String attribute = driver .findElement(
		 * By.cssSelector("center input[type=submit]:nth-child(1)"))
		 * .getCssValue("color").toString();
		 * System.out.println(driver.findElement(
		 * By.cssSelector("center input[type=submit]:nth-child(1)"))
		 * .getCssValue("background-image"));
		 * System.out.println(Color.fromString(attribute).asHex());
		 * JOptionPane.showInputDialog(attribute);
		 */
	}

	public static void main(String[] args) {

	}
}
