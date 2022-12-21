package com.practiceExcicution.tescase;

import org.testng.annotations.Test;

public class HomemoduleTEST {
@Test(groups="smoke")
public void test1() {
	System.out.println("smoke from home");
	
}
@Test(groups="sanity")
public void test2() {
	System.out.println("sanity from home");
	
}
@Test(groups="regression")
public void test3() {
	System.out.println("regression from home");
	
}
}
