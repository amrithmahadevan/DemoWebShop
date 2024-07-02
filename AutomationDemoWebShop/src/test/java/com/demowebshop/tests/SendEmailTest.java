package com.demowebshop.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SendEmailTest extends BaseTest {

	

	@Test

	public void verifyUserIsAbleToSEndEmail()

	{

       

		loginPage.login(prop.getProperty("email"),prop.getProperty("password"));

		

		loginPage.searchItem(prop.getProperty("itemToSearch2"));

		

		productPage.sendEmailToFriend(prop.getProperty("friendEmail"));

		

		String actualmsg=productPage.getEmailAlertMsg();

		

		Assert.assertEquals(actualmsg, "Your message has been sent.", "Alert did not match" );

		

	}


}
