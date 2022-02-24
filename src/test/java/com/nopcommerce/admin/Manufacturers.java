package com.nopcommerce.admin;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import utility.Utility;

public class Manufacturers extends BaseAdmin{
	private String manufacturersUrl = "https://admin-demo.nopcommerce.com/Admin/Manufacturer/List";
	private String expectedMessage = "×";
	@Test
	public void addNewManufacturer() {
		driver.get(manufacturersUrl);
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/div/a")).click();
		driver.findElement(By.id("Name")).sendKeys("Dummy Manufacturer");
		driver.switchTo().frame("Description_ifr");
		driver.findElement(By.id("tinymce")).sendKeys("Dummy Description");
		driver.switchTo().defaultContent();
		driver.findElement(By.name("save")).click();
		Utility.captureScreenshot(driver,"manufacturer");
		
		
		//Manufacturer Assertion
		String actualMessage = driver.findElement(By.xpath("close")).getText();
		Assert.assertEquals(expectedMessage, actualMessage , "Manufacturer creation functionality has failed");
	}
}
