package com.nopcommerce.frontend;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import utility.Utility;

public class Cart extends DriverSetup {
	private String productUrl = "https://demo.nopcommerce.com/apple-macbook-pro-13-inch";
	private String expectedMessage = "Your order has been successfully processed!";
	@Test
	public void addToCartAsGuest() throws InterruptedException {
		driver.get(productUrl);
		driver.findElement(By.id("product_enteredQuantity_4")).clear();
		driver.findElement(By.id("product_enteredQuantity_4")).sendKeys("5");
		driver.findElement(By.id("add-to-cart-button-4")).click();
		driver.wait(5000);
		driver.get("https://demo.nopcommerce.com/cart");
		
		 //Check if the Term is selected or not
	    WebElement checkbox = driver.findElement(By.id("termsofservice"));  
	    checkbox.click();
	    
	    driver.findElement(By.id("checkout")).click();
	    
	   //Checkoout as a guest
	    driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[1]/div[3]/button[1]")).click();
	   
	    //Guest Informations
	    driver.findElement(By.id("BillingNewAddress_FirstName")).sendKeys("Dummy Name");
	    driver.findElement(By.id("BillingNewAddress_LastName")).sendKeys("Dummy Nametwo");
	    
		Select drpCountry = new Select(driver.findElement(By.id("BillingNewAddress_CountryId")));
		drpCountry.selectByVisibleText("Sweden");
		
	    driver.findElement(By.id("BillingNewAddress_City")).sendKeys("blekinge");
	    driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("1234");
	    driver.findElement(By.id("BillingNewAddress_Email")).sendKeys("dummy@mailinator.com");
	    driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("123456789");
	    driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("Dummy Address");
	    driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/button[4]")).click();
	    
	    
	    //Shipping continue
	    driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/button")).click();
	    
	    //payment method
	    driver.findElement(By.xpath("//*[@id=\"payment-method-buttons-container\"]/button")).click();
	    
	    //payment information
	    driver.findElement(By.xpath("//*[@id=\"payment-info-buttons-container\"]/button")).click();
	    
	
	    //Order confirm
	    driver.findElement(By.xpath("//*[@id=\"confirm-order-buttons-container\"]/button")).click();
	    Utility.captureScreenshot(driver,"cart");
		//Cart Assertion
		String actualMessage = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/div[1]")).getText();
		Assert.assertEquals(expectedMessage, actualMessage , "Order confirmation verification has failed");
		}
		
	
		


}
