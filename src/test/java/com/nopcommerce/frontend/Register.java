package com.nopcommerce.frontend;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.nopcommerce.pagefactory.RegisterPF;

import utility.Utility;

public class Register extends DriverSetup{
	private String registerUrl ="https://demo.nopcommerce.com/register";
	private String expectedMessage = "Your registration completed";
	@Test
	public void register() {
		
		//Navigate to register page
		driver.get(registerUrl);
		
		//Registration process
		RegisterPF register = PageFactory.initElements(driver, RegisterPF.class);
		register.selectGender();
		register.inputFirstName("Dummy Name");
		register.inputLastName("Dummy name two");
		register.inputEmail("dummy@mailinator.com");
		register.inoutPassword("dummypassword");
		register.inputConfirmPassword("dummmypassword");
		register.clickOnRegister();
		Utility.captureScreenshot(driver,"validregistration");
		//Register Assertion
		String actualMessage = driver.findElement(By.className("result")).getText();
		Assert.assertEquals(expectedMessage, actualMessage , "Registration sucess verification has failed");
	}
	
}
