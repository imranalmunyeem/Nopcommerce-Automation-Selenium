package com.nopcommerce.frontend;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.nopcommerce.pagefactory.ResetPasswordPF;

public class ResetPassword extends DriverSetup {
	
	private String resetPasswordUrl = "https://demo.nopcommerce.com/passwordrecovery";
	private String expectedMessage = "Email with instructions has been sent to you.";
	
	@Test
	public void resetPasswordTest() {
		driver.get(resetPasswordUrl);
		
		//Reset Process
		ResetPasswordPF resetpassword = PageFactory.initElements(driver, ResetPasswordPF.class);
		resetpassword.inputEmail("dummy@mailinator.com");
		resetpassword.clickOnReset();
		
		//Reset Assertion
		String actualMessage = driver.findElement(By.className("content")).getText();
		Assert.assertEquals(expectedMessage, actualMessage , "Registration sucess verification has failed");
	}
}
