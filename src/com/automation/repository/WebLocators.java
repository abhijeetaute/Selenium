package com.automation.repository;

public interface WebLocators {

	public interface GoogleHomePageLocators {

		String SEARCH_INPUT_BOX = "q";
		String SEARCH_BUTTON = "#tsbb,[name=btnK]";
	}

	public interface SearchResulPageLocators {

		String SEARCH_RESULT_LINKS = ".rc h3 a";
		String SEARCH_BUTTON = "btnG";
	}
}
