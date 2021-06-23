package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;

	public void getDriver() {
		System.setProperty("webdriver.chrome.driver", "D:\\RamCucumberClass\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

	}

	public void launchUrl(String url) {
		driver.get(url);

	}

	public void typeText(WebElement element, String data) {
		element.sendKeys(data);

	}

	public void butnClick(WebElement element) {
		element.click();

	}

}
