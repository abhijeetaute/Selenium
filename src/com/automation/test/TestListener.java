package com.automation.test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.automation.listener.Listener.class)
public class TestListener {

	@Test
	public void main() {
	}
}
