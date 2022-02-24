package com.nopcommerce.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ContactPF {
//----------------------------------------Locators----------------------------------------------//
			// Fullname Locator
			@FindBy(how = How.ID, using = "FullName")
			@CacheLookup
			WebElement txtFullName;
	
			// Email Locator
			@FindBy(how = How.ID, using = "Email")
			@CacheLookup
			WebElement txtEmail;

			// Enquiry Locator
			@FindBy(how = How.ID, using = "Enquiry")
			@CacheLookup
			WebElement txtEnquiry;
			
			// Submit button Locator
			@FindBy(how = How.XPATH, using = "/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[2]/button")
			@CacheLookup
			WebElement btnSubmit;
	
//-----------------------------------------------------Methods----------------------------------------------//

			//Input Full Name
			public void inputFullName(String fullname) {
				txtFullName.clear();
				txtFullName.sendKeys(fullname);

			}
			
			//Input Email
			public void inputEmail(String email) {
				txtEmail.clear();
				txtEmail.sendKeys(email);
			}
			
			
			//Input Enquiry
			public void inputEnquiry(String enquiry) {
				txtEnquiry.clear();
				txtEnquiry.sendKeys(enquiry);
			}
			
			//Click on submit
			public void clickOnSubmit() {
				btnSubmit.click();
			}
			
}
