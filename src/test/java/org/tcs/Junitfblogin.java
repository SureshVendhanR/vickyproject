package org.tcs;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitfblogin {
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Launch Browser: Chrome");
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("Quit Browser");
	}
	@Before
	public void before() {
		System.out.println("Start Time");
	}
	@Test
	public void tc1() {
		System.out.println("FB Login");
	}
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
	@After
	public void after() {
		System.out.println("End Time");
	}	
	}

