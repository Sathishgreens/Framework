package org.junitpractice;

import org.datadriven.BaseClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Sample extends BaseClass {

	@BeforeClass
	public static void browserLaunch() {		
		browserLaunch("chrome");
		maximize();
		loadUrl("https://adactinhotelapp.com/");		
	}

	@Test
	public void tc1() throws Exception {		
		WebElement userName = findElement("id", "username");
		sendKeys(userName, "sathishgreens123");
		sendKeys(findElement("id", "password"), "Greens@123");
		click(findElement("id", "login"));
		String title = title();
//		Assert.assertEquals("Adactin.com - Search", title);
//		System.out.println(title);
	}
	
	@Test
	public void tc2() throws Exception {
		WebElement location = findElement("id","location");
		dropDown(location, "text", "Sydney");
		sendKeys(findElement("id", "hotels"), "Hotel Creek");
		
	}
	
}
