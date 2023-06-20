package com.telus.testannotations;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BankingApplication {
	@Test(priority=1)
	public void f() {
		System.out.println("Method F is executed");
		Assert.assertEquals("Login", "Logins", "Values are not same");
	}

	@Test(priority=2,enabled = false)
	public void v() {
		System.out.println("Method V is executed");
	}

	@Test(dependsOnMethods = {"f"})
	public void a() {
		System.out.println("Method A is executed");
	}

	@Test(priority=4)
	public void s() {
		System.out.println("Method S is executed");
	}

}
