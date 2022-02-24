package com.nopcommerce.frontend;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import utility.Utility;

public class Currency extends DriverSetup {
	@Test
	public void currencyEuro() {
		Select euro = new Select(driver.findElement(By.name("customerCurrency")));
		euro.selectByVisibleText("Euro");
		Utility.captureScreenshot(driver,"Euro");
	}
	@Test
	public void currencyUSD() {
		Select euro = new Select(driver.findElement(By.name("customerCurrency")));
		euro.selectByVisibleText("US Dollar");
		Utility.captureScreenshot(driver,"USdollar");
}
}