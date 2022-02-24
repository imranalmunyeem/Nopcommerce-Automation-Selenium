package com.nopcommerce.pagefactory;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPagePF {

	// Email Locator
	@FindBy(how = How.ID, using = "Email")
	@CacheLookup
	WebElement txtEmail;

	// Password Locator
	@FindBy(how = How.ID, using = "Password")
	@CacheLookup
	WebElement txtPassword;

	// Button Locator
	@FindBy(how = How.XPATH, using = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")
	@CacheLookup
	WebElement btnLogin;

	// login module in one method
	public void loginToNocommerce(String inputEmail, String inputPassword) {
		txtEmail.sendKeys(inputEmail);
		txtPassword.sendKeys(inputPassword);
		btnLogin.click();

	}

}