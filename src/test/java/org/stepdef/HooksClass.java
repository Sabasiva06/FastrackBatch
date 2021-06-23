package org.stepdef;

import org.base.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends BaseClass {

	@Before
	public void beforeEachScenario() {
		getDriver();
		launchUrl("https://www.facebook.com/");

	}

	@After
	public void afterEachScenario() {
		driver.close();

	}

}
