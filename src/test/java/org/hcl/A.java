package org.hcl;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class A {
	@BeforeClass
	private void beforeClas() {
		System.out.println("Launch");
	}

	@Test
	private void tc1() {
		System.out.println("TC1");
	}

	@Test
	private void tc2() {
		System.out.println("TC2");
	}

	@Test
	private void tc21() {
		System.out.println("TC21");
	}

	@Test
	private void tc22() {
		System.out.println("TC22");
	}

	@Test
	private void tc23() {
		System.out.println("TC23");
	}

	private void tc3() {
		System.out.println("TC3");
	}

	@Test
	private void tc4() {
		System.out.println("TC4");

	}

	@AfterMethod
	private void afterMethod() {
		System.out.println("End Time");
	}

	@BeforeMethod
	private void beforemethod() {
		System.out.println("Start Time");
	}

	@AfterClass
	private void afterClass() {
		System.out.println("Quit");
	}
}
