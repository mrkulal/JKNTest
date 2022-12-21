package com.practiceExcicution.tescase;

import org.testng.annotations.Test;

public class PhotoTest {
	@Test(groups="smoke")
	public void test1() {
		System.out.println("smoke from Photo");
	}
@Test(groups="sanity")
public void test2() {
	System.out.println("sanity from Photo");
}
@Test(groups="regression")
public void test3() {
	System.out.println("regression from Photo");
}
}
