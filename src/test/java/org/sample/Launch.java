package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suresh\\eclipse\\Maven_9AM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		WebElement txtUsername = driver.findElement(By.id("email"));
		txtUsername.sendKeys("greens");
		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys("java");
		WebElement btnLogin = driver.findElement(By.xpath("//button[text()='Log In']"));
		btnLogin.click();
		
		
		
		
	}

}
