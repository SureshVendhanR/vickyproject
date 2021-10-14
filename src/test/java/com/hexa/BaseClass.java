package com.hexa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseClass {
	WebDriver driver;
	public WebDriver launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suresh\\eclipse\\Maven_9AM\\Driver\\chromedriver.exe");
		return driver;
	}
	public void launchUrl(String url) {
		try {
			driver.get(url);
			driver.manage().window().maximize();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public void type(WebElement element, String value) {
		try {
			element.sendKeys(value);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
	}
	public void btnClick(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
            System.out.println(e.getMessage());
		}
	}
	public String getPageUrl() {
		String url = null;
		try {
			url = driver.getCurrentUrl();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return url;
	}
	public String getPageTitle() {
		String title = null;
		try {
			title = driver.getTitle();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return title;
	}
}
