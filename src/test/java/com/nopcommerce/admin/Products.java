package com.nopcommerce.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Products extends BaseAdmin{
	
	private String productPageUrl = "https://admin-demo.nopcommerce.com/Admin/Product/List";
	
	@Test
	public void exportProductsAsExcel() throws InterruptedException {
		driver.get(productPageUrl);
		
	    WebElement checkbox = driver.findElement(By.className("mastercheckbox"));
	   
	    //Check if the checkbox is selected or not
	    if(checkbox.isSelected()) {
	        
	        System.out.println("Checkbox is ON");
	    }else {
	        
	        checkbox.click();
	        System.out.println("Checkbox is Off");
	    }
	    
	    //Download as PDF
	    driver.findElement(By.name("download-catalog-pdf")).click();
	    driver.wait(3000);
	    //Utility.captureScreenshot(driver,"downloadproduct");
	}
		
	}


