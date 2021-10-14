package org.tcs;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Sample {
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Launch Browser");
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("Quit Browser");
	}
	@Test
	public void tc1() {
		System.out.println("TC1");
	}
	@Test
	public void tc2() {
		System.out.println("TC2");
	}
	@After
	public void after() {
		System.out.println("End Time");
	}
	@Before
	public void before() {
		System.out.println("Start Time");
	}
	
}

