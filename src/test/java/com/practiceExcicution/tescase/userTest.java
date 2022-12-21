package com.practiceExcicution.tescase;

import org.testng.annotations.Test;

public class userTest {
@Test(groups="smoke")
public void test1() {
	System.out.println("smoke from user");
}
@Test(groups="sanity")
public void test2() {
	System.out.println("sanity from user");
}
@Test(groups="regression")
public void test3() {
	System.out.println("regression from user");
}
}
