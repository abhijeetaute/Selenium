package com.automation.page;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.common.WebDriverTest;
import com.automation.repository.WebLocators.SearchResulPageLocators;

public class SearchResulTestPage extends WebDriverTest implements
		SearchResulPageLocators {

	@FindBy(name = SEARCH_BUTTON)
	WebElement searchButton;

	@FindBy(css = SEARCH_RESULT_LINKS)
	List<WebElement> searchResultLinks;

	public void launchPage() {

	}

	public void waitForPageToLoad() {
		PageFactory.initElements(driver, this);
		waitForPresent(getSearchButton());
		waitForVisible(getSearchButton());
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public List<WebElement> getSearchResultLinks() {
		return searchResultLinks;
	}

	public void clickOnFirstLink() {

		for (WebElement link : searchResultLinks) {
			link.click();
			return;
		}
	}
}
