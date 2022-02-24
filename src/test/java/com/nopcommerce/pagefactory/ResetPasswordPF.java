package com.nopcommerce.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ResetPasswordPF {
	
	//----------------------------------------Locators----------------------------------------------//
	// Email Locator
	@FindBy(how = How.ID, using = "Email")
	@CacheLookup
	WebElement txtEmail;
	
	// Reset button Locator
	@FindBy(how = How.XPATH, using = "/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[2]/button")
	@CacheLookup
	WebElement btnReset;

//-----------------------------------------------------Methods----------------------------------------------//

	//Input Email
	public void inputEmail(String email) {
		txtEmail.clear();
		txtEmail.sendKeys(email);
	}
	
	
	//Click on Reset
	public void clickOnReset() {
		btnReset.click();
	}
}
