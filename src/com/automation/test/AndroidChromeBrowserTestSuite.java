package com.automation.test;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.automation.common.WebDriverTest;
import com.automation.page.GoogleHomeTestPage;
import com.automation.page.SearchResulTestPage;

public class AndroidChromeBrowserTestSuite extends WebDriverTest {

	@Test
	public void TEST_01() {

		GoogleHomeTestPage googleHomePage = new GoogleHomeTestPage();
		googleHomePage.launchPage();

		if (googleHomePage.getSearchInputBox().isDisplayed()) {
			Reporter.log("Google home page displayed successfully!!");
		} else {
			Reporter.log("Unable to display google home page!!");
		}
		googleHomePage.getSearchInputBox().sendKeys(
				props.getProperty("search.text"));

		SearchResulTestPage searchResulPage = new SearchResulTestPage();
		searchResulPage.waitForPageToLoad();

		searchResulPage.getSearchButton().click();

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
		}
		searchResulPage.clickOnFirstLink();
	}
}
