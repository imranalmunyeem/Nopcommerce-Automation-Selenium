package com.nopcommerce.frontend;

import org.testng.Assert;
import org.testng.annotations.Test;

import utility.Utility;




public class VerifyTitles extends DriverSetup {
	private String registerUrl ="https://demo.nopcommerce.com/register";
	private String loginUrl = "https://demo.nopcommerce.com/login";
	private String contactusUrl ="https://demo.nopcommerce.com/contactus";
	private String resetPasswordUrl ="https://demo.nopcommerce.com/passwordrecovery";
	private String cartUrl ="https://demo.nopcommerce.com/cart";
	private String aboutUsUrl = "https://demo.nopcommerce.com/about-us";
	private String wishlistUrl ="https://demo.nopcommerce.com/wishlist";
	private String expectedRegisterTitle = "nopCommerce demo store. Register";
	private String expectedLoginTitle = "nopCommerce demo store. Login";
	private String expectedContactusTitle = "nopCommerce demo store. Contact Us";
	private String expectedResetPasswordTitle = "nopCommerce demo store. Password Recovery";
	private String expectedCartTitle = "nopCommerce demo store. Shopping Cart";
	private String expectedAboutTitle = "nopCommerce demo store. About us";
	private String expectedWishlistTitle = "nopCommerce demo store. Wishlist";
	
	@Test
	public void registerTitle() {;
		driver.get(registerUrl);
		String actualTitle = driver.getTitle();
		Utility.captureScreenshot(driver,"registertitle");
		Assert.assertEquals(expectedRegisterTitle, actualTitle);
	}
	
	@Test
	public void loginTitle() {
		driver.get(loginUrl);
		String actualTitle = driver.getTitle();
		Utility.captureScreenshot(driver,"logintitle");
		Assert.assertEquals(expectedLoginTitle, actualTitle);
	}
	
	@Test
	public void contactUsTitle() {
		driver.get(contactusUrl);
		String actualTitle = driver.getTitle();
		Utility.captureScreenshot(driver,"contactustitle");
		Assert.assertEquals(expectedContactusTitle, actualTitle);
	}
	
	@Test
	public void resetPasswordTitle() {
		driver.get(resetPasswordUrl);
		String actualTitle = driver.getTitle();
		Utility.captureScreenshot(driver,"resetpasswordtitle");
		Assert.assertEquals(expectedResetPasswordTitle, actualTitle);
	}
	
	@Test
	public void cartTitle() {
		driver.get(cartUrl);
		String actualTitle = driver.getTitle();
		Utility.captureScreenshot(driver,"carttitle");
		Assert.assertEquals(expectedCartTitle, actualTitle);
	}
	
	@Test
	public void wishTitle() {
		driver.get(wishlistUrl);
		String actualTitle = driver.getTitle();
		Utility.captureScreenshot(driver,"wishtitle");
		Assert.assertEquals(expectedWishlistTitle, actualTitle);
	}
	
	@Test
	public void aboutUsTitle() {
		driver.get(aboutUsUrl);
		String actualTitle = driver.getTitle();
		Utility.captureScreenshot(driver,"aboutustitle");
		Assert.assertEquals(expectedAboutTitle , actualTitle);
	}
	

}
