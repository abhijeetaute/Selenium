package com.automation.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.common.WebDriverTest;
import com.automation.repository.WebLocators.GoogleHomePageLocators;

public class GoogleHomeTestPage extends WebDriverTest implements
		GoogleHomePageLocators {

	@FindBy(name = SEARCH_INPUT_BOX)
	WebElement searchInputBox;

	@FindBy(css = SEARCH_BUTTON)
	WebElement searchButton;

	public void launchPage() {
		driver.get("https://www.google.co.in");
		waitForPageToLoad();
	}

	public void waitForPageToLoad() {
		PageFactory.initElements(driver, this);
		waitForPresent(getSearchInputBox());
		waitForVisible(getSearchInputBox());
	}

	public WebElement getSearchInputBox() {
		return searchInputBox;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}
}
