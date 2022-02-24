package com.nopcommerce.frontend;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import utility.Utility;

public class Wish extends DriverSetup {
	
	private String productUrl = "https://demo.nopcommerce.com/build-your-own-computer";
	private String expectedMessage = "Build your own computer";
	
	@Test
	public void addToWish() {
		driver.get(productUrl);
		
		 //Check if the Term is selected or not
	    WebElement checkbox = driver.findElement(By.id("product_attribute_3_6"));  
	    if(checkbox.isSelected()) {
	        
	        System.out.println("Checkbox is ON");
	    }else {
	        
	        checkbox.click();
	        System.out.println("Checkbox is Off");
	    }
		Select ram = new Select(driver.findElement(By.id("product_attribute_2")));
		ram.selectByValue("4");
		
		driver.findElement(By.id("add-to-wishlist-button-1")).click();
		Utility.captureScreenshot(driver,"wish");
		
		//Login Assertion
		driver.get("https://demo.nopcommerce.com/wishlist");
		String actualMessage = driver.findElement(By.className("product-name")).getText();
		Assert.assertEquals(expectedMessage, actualMessage , "Wish addition sucess verification has failed");
	}
}
