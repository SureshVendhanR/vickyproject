package com.hexa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sample {
	public static void main(String[] args) {
		BaseClass b = new BaseClass();
		WebDriver driver = b.launchBrowser();
		b.launchUrl("https://adactinhotelapp.com/");
		System.out.println(b.getPageUrl());
		System.out.println(b.getPageTitle());
		WebElement txtUser = driver.findElement(By.id("username"));
		b.type(txtUser, "suresh0078");
		WebElement txtPass = driver.findElement(By.id("password"));
		b.type(txtPass, "Suresh0078");
		WebElement btnLogin = driver.findElement(By.name("login"));
		b.btnClick(btnLogin);
		
		
	}

}
