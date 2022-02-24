package com.nopcommerce.frontend;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.nopcommerce.pagefactory.ContactPF;

import utility.Utility;



public class ContactUs extends DriverSetup {
	
	private String contactusUrl ="https://demo.nopcommerce.com/contactus";
	private String expectedMessage = "Your enquiry has been successfully sent to the store owner.";

	@Test
	public void validContactUs() {
		driver.get(contactusUrl);

		//Contact us
		ContactPF contact = PageFactory.initElements(driver, ContactPF.class);
		contact.inputFullName("dummy name");
		contact.inputEmail("dummy@mailinator.com");
		contact.inputEnquiry("Enquiry for test purpose");
		contact.clickOnSubmit();
		Utility.captureScreenshot(driver,"successfulcontactus");
		
		//Contact Assertion
		String actualMessage = driver.findElement(By.className("result")).getText();
		Assert.assertEquals(expectedMessage, actualMessage , "Contact us success verification has failed");
		
		
	}
}
