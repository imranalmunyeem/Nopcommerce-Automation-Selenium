package com.nopcommerce.frontend;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import io.github.bonigarcia.wdm.WebDriverManager;


public class DriverSetup {
	public static WebDriver driver;


	@BeforeSuite
	public static void setDriver() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://frontend.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	
	@AfterSuite
	public static void close() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.close();
	}}
	
