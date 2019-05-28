package com.facebook.Login;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase {
	int a=10, b=20;
	@Test
	public void add()
	{
	System.out.println("Add");
	Assert.assertEquals(a+b, 30);
	}

}
