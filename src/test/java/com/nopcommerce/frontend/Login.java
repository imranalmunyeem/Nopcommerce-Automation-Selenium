package com.nopcommerce.frontend;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.nopcommerce.pagefactory.LoginPagePF;

import utility.Utility;

public class Login extends DriverSetup{
	
	private String loginUrl = "https://demo.nopcommerce.com/login";
	private String expectedMessage = "Welcome to our store";
	private String expectedMessage2 = "Login was unsuccessful. Please correct the errors and try again.";
	private String expectedMessage3 = "Please enter your email";

	@Test(priority=1, description="Login with valid credentials")
	public void userLoginWithValidCredentialslogin() {
		driver.get(loginUrl);
		LoginPagePF login = PageFactory.initElements(driver, LoginPagePF.class);
		login.loginToNocommerce("dummy@mailinator.com", "dummypassword");
		Utility.captureScreenshot(driver,"validlogin");
		//Login Assertion
		String actualMessage = driver.findElement(By.className("topic-block-title")).getText();
		Assert.assertEquals(expectedMessage, actualMessage , "Login sucess verification has failed");
		
	}
	
	
	@Test(priority=2, description="Login with invalid credentials")
	public void userLoginWithInvalidCredentials() {
		driver.get(loginUrl);
		LoginPagePF login = PageFactory.initElements(driver, LoginPagePF.class);
		login.loginToNocommerce("wrong@gmail.com", "wrong");
		Utility.captureScreenshot(driver,"invalidlogin");
		//Login Assertion
		String actualMessage2 = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[1]")).getText();
		Assert.assertEquals(expectedMessage2, actualMessage2 , "Invalid Login sucess verification has failed");
		
}
	
	
	@Test(priority=3, description="Login without putting any credential")
	public void userLoginWithEmptySubmission() {
		driver.get(loginUrl);	
		LoginPagePF login = PageFactory.initElements(driver, LoginPagePF.class);
		login.loginToNocommerce("", "");
		Utility.captureScreenshot(driver,"emptylogin");
		
		//Login Assertion
		String actualMessage3 = driver.findElement(By.id("Email-error")).getText();
		Assert.assertEquals(expectedMessage3, actualMessage3 , "Empty Login sucess verification has failed");
}
}
