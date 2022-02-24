package com.nopcommerce.admin;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utility.Utility;

public class Discount extends BaseAdmin {
	private String discountUrl = "https://admin-demo.nopcommerce.com/Admin/Discount/List";
	
	@Test
	public void discount() {
		driver.get(discountUrl);
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div/a")).click();
		driver.findElement(By.id("Name")).sendKeys("dummy discount");
		driver.findElement(By.xpath("//*[@id=\"pnlDiscountAmount\"]/div[2]/span[1]/span/input[1]")).sendKeys("100");
		driver.findElement(By.xpath("//*[@id=\"discount-form\"]/div[1]/div/button[1]")).click();
		Utility.captureScreenshot(driver,"discount");
	}
}
