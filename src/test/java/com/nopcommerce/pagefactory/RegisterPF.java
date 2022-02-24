package com.nopcommerce.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegisterPF {
	
	//----------------------------------------Locators----------------------------------------------//
		// Email Locator
		@FindBy(how = How.ID, using = "gender-male")
		@CacheLookup
		WebElement radioGender;
		
		// Email Locator
		@FindBy(how = How.ID, using = "FirstName")
		@CacheLookup
		WebElement txtFirstName;
		
		// Email Locator
		@FindBy(how = How.ID, using = "LastName")
		@CacheLookup
		WebElement txtLastName;

		// Email Locator
		@FindBy(how = How.ID, using = "Email")
		@CacheLookup
		WebElement txtEmail;

		// Password Locator
		@FindBy(how = How.ID, using = "Password")
		@CacheLookup
		WebElement txtPassword;
		
		// Email Locator
		@FindBy(how = How.ID, using = "ConfirmPassword")
		@CacheLookup
		WebElement txtConfirmPassword;

		// Button Locator
		@FindBy(how = How.ID, using = "register-button")
		@CacheLookup
		WebElement btnRegister;
		
		
//-----------------------------------------------------Methods----------------------------------------------//
		//Select Gender
		public void selectGender() {
			radioGender.click();
		}
			
		//Input First Name
		public void inputFirstName(String firstname) {
			txtFirstName.clear();
			txtFirstName.sendKeys(firstname);

		}
		
		//Input Last Name
		public void inputLastName(String lastname) {
			txtLastName.clear();
			txtLastName.sendKeys(lastname);
		}
		
		//Input Email
		public void inputEmail(String email) {
			txtEmail.clear();
			txtEmail.sendKeys(email);
		}
		
		// Input Password
		public void inoutPassword(String password) {
			txtPassword.clear();
			txtPassword.sendKeys(password);
		}
		
		// Input RePassword
		public void inputConfirmPassword(String confirmpassword) {
			txtConfirmPassword.clear();
			txtConfirmPassword.sendKeys(confirmpassword);

		}
		
		//Click on register
		public void clickOnRegister() {
			btnRegister.click();

		}

}
