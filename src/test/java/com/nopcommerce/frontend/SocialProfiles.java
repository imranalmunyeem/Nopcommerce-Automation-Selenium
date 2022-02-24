package com.nopcommerce.frontend;


import org.testng.Assert;
import org.testng.annotations.Test;

public class SocialProfiles extends DriverSetup {
	
	private String facebookUrl = "https://www.facebook.com/nopCommerce";
	private String twitterUrl = "https://twitter.com/nopCommerce";
	private String youtubeUrl ="https://www.youtube.com/user/nopCommerce";
	private String rssUrl ="https://demo.nopcommerce.com/news/rss/1";
	
	@Test
	public void validateFacebookUrl() {
		driver.get(facebookUrl);		
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, facebookUrl);
	}
	
	@Test
	public void validateTwitterUrl() {
		driver.get(twitterUrl);		
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, twitterUrl);
	}
	
	@Test
	public void validateYoutubeUrl() {
		driver.get(youtubeUrl);		
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, youtubeUrl);
	}
	
	@Test
	public void validateRssUrl() {
		driver.get(rssUrl);		
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, rssUrl);
	}
	
	
}
