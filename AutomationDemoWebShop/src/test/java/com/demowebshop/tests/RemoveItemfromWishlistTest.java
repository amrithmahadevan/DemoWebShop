package com.demowebshop.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RemoveItemfromWishlistTest extends BaseTest {

	

	@Test

	public void verifyUserIsAbleToRemoveItemFromWishlist()

	{


		

		loginPage.login(prop.getProperty("email"),prop.getProperty("password"));

		

		loginPage.searchItem(prop.getProperty("itemToSearch"));

		productPage.addToWishlist();

		productPage.removeItem();

		String msg=productPage.getCartUpdateMsg();

		Assert.assertEquals(msg,"The wishlist is empty!", "Unable to remove item succesfully" );

		

	}


}
